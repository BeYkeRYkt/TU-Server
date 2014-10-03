package net.minecraft.network.rcon;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class RConThreadBase implements Runnable
{
    private static final AtomicInteger THREAD_ID = new AtomicInteger(0);

    /** True if the Thread is running, false otherwise */
    protected boolean running;

    /** Reference to the IServer object. */
    protected IServer server;
    protected final String threadName;

    /** Thread for this runnable class */
    protected Thread rconThread;
    protected int field_72615_d = 5;

    /** A list of registered DatagramSockets */
    protected List socketList = Lists.newArrayList();

    /** A list of registered ServerSockets */
    protected List serverSocketList = Lists.newArrayList();
    private static final String __OBFID = "CL_00001801";

    protected RConThreadBase(IServer p_i45300_1_, String threadName)
    {
        this.server = p_i45300_1_;
        this.threadName = threadName;

        if (this.server.isDebuggingEnabled())
        {
            this.logWarning("Debugging is enabled, performance maybe reduced!");
        }
    }

    /**
     * Creates a new Thread object from this class and starts running
     */
    public synchronized void startThread()
    {
        this.rconThread = new Thread(this, this.threadName + " #" + THREAD_ID.incrementAndGet());
        this.rconThread.start();
        this.running = true;
    }

    /**
     * Returns true if the Thread is running, false otherwise
     */
    public boolean isRunning()
    {
        return this.running;
    }

    /**
     * Log debug message
     */
    protected void logDebug(String msg)
    {
        this.server.logDebug(msg);
    }

    /**
     * Log information message
     */
    protected void logInfo(String msg)
    {
        this.server.logInfo(msg);
    }

    /**
     * Log warning message
     */
    protected void logWarning(String msg)
    {
        this.server.logWarning(msg);
    }

    /**
     * Log severe error message
     */
    protected void logSevere(String msg)
    {
        this.server.logSevere(msg);
    }

    /**
     * Returns the number of players on the server
     */
    protected int getNumberOfPlayers()
    {
        return this.server.getCurrentPlayerCount();
    }

    /**
     * Registers a DatagramSocket with this thread
     */
    protected void registerSocket(DatagramSocket socket)
    {
        this.logDebug("registerSocket: " + socket);
        this.socketList.add(socket);
    }

    /**
     * Closes the specified DatagramSocket
     */
    protected boolean closeSocket(DatagramSocket socket, boolean removeFromList)
    {
        this.logDebug("closeSocket: " + socket);

        if (null == socket)
        {
            return false;
        }
        else
        {
            boolean var3 = false;

            if (!socket.isClosed())
            {
                socket.close();
                var3 = true;
            }

            if (removeFromList)
            {
                this.socketList.remove(socket);
            }

            return var3;
        }
    }

    /**
     * Closes the specified ServerSocket
     */
    protected boolean closeServerSocket(ServerSocket socket)
    {
        return this.closeServerSocket_do(socket, true);
    }

    /**
     * Closes the specified ServerSocket
     */
    protected boolean closeServerSocket_do(ServerSocket socket, boolean removeFromList)
    {
        this.logDebug("closeSocket: " + socket);

        if (null == socket)
        {
            return false;
        }
        else
        {
            boolean var3 = false;

            try
            {
                if (!socket.isClosed())
                {
                    socket.close();
                    var3 = true;
                }
            }
            catch (IOException var5)
            {
                this.logWarning("IO: " + var5.getMessage());
            }

            if (removeFromList)
            {
                this.serverSocketList.remove(socket);
            }

            return var3;
        }
    }

    /**
     * Closes all of the opened sockets
     */
    protected void closeAllSockets()
    {
        this.closeAllSockets_do(false);
    }

    /**
     * Closes all of the opened sockets
     */
    protected void closeAllSockets_do(boolean logWarning)
    {
        int var2 = 0;
        Iterator var3 = this.socketList.iterator();

        while (var3.hasNext())
        {
            DatagramSocket var4 = (DatagramSocket)var3.next();

            if (this.closeSocket(var4, false))
            {
                ++var2;
            }
        }

        this.socketList.clear();
        var3 = this.serverSocketList.iterator();

        while (var3.hasNext())
        {
            ServerSocket var5 = (ServerSocket)var3.next();

            if (this.closeServerSocket_do(var5, false))
            {
                ++var2;
            }
        }

        this.serverSocketList.clear();

        if (logWarning && 0 < var2)
        {
            this.logWarning("Force closed " + var2 + " sockets");
        }
    }
}
