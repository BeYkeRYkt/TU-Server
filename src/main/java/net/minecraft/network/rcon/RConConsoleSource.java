package net.minecraft.network.rcon;

import net.minecraft.command.CommandResultStats;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class RConConsoleSource implements ICommandSender
{
    /** Single instance of RConConsoleSource */
    private static final RConConsoleSource instance = new RConConsoleSource();

    /** RCon string buffer for log. */
    private StringBuffer buffer = new StringBuffer();
    private static final String __OBFID = "CL_00001800";

    public static RConConsoleSource func_175570_h()
    {
        return instance;
    }

    /**
     * Clears the RCon log
     */
    public void resetLog()
    {
        this.buffer.setLength(0);
    }

    /**
     * Gets the contents of the RCon log
     */
    public String getLogContents()
    {
        return this.buffer.toString();
    }

    /**
     * Gets the name of this command sender (usually username, but possibly "Rcon")
     */
    public String getName()
    {
        return "Rcon";
    }

    public IChatComponent getDisplayName()
    {
        return new ChatComponentText(this.getName());
    }

    /**
     * Notifies this sender of some sort of information.  This is for messages intended to display to the user.  Used
     * for typical output (like "you asked for whether or not this game rule is set, so here's your answer"), warnings
     * (like "I fetched this block for you by ID, but I'd like you to know that every time you do this, I die a little
     * inside"), and errors (like "it's not called iron_pixacke, silly").
     */
    public void addChatMessage(IChatComponent message)
    {
        this.buffer.append(message.getUnformattedText());
    }

    /**
     * Returns true if the command sender is allowed to use the given command.
     */
    public boolean canCommandSenderUseCommand(int permissionLevel, String command)
    {
        return true;
    }

    public BlockPos getPosition()
    {
        return new BlockPos(0, 0, 0);
    }

    public Vec3 getPositionVector()
    {
        return new Vec3(0.0D, 0.0D, 0.0D);
    }

    public World getEntityWorld()
    {
        return MinecraftServer.getServer().getEntityWorld();
    }

    public Entity getCommandSenderEntity()
    {
        return null;
    }

    public boolean sendCommandFeedback()
    {
        return true;
    }

    public void func_174794_a(CommandResultStats.Type p_174794_1_, int p_174794_2_) {}
}
