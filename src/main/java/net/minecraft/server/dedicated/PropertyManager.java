package net.minecraft.server.dedicated;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertyManager
{
    private static final Logger LOGGER = LogManager.getLogger();

    /** The server properties object. */
    private final Properties serverProperties = new Properties();

    /** The server properties file. */
    private final File serverPropertiesFile;
    private static final String __OBFID = "CL_00001782";

    public PropertyManager(File propertiesFile)
    {
        this.serverPropertiesFile = propertiesFile;

        if (propertiesFile.exists())
        {
            FileInputStream var2 = null;

            try
            {
                var2 = new FileInputStream(propertiesFile);
                this.serverProperties.load(var2);
            }
            catch (Exception var12)
            {
                LOGGER.warn("Failed to load " + propertiesFile, var12);
                this.generateNewProperties();
            }
            finally
            {
                if (var2 != null)
                {
                    try
                    {
                        var2.close();
                    }
                    catch (IOException var11)
                    {
                        ;
                    }
                }
            }
        }
        else
        {
            LOGGER.warn(propertiesFile + " does not exist");
            this.generateNewProperties();
        }
    }

    /**
     * Generates a new properties file.
     */
    public void generateNewProperties()
    {
        LOGGER.info("Generating new properties file");
        this.saveProperties();
    }

    /**
     * Writes the properties to the properties file.
     */
    public void saveProperties()
    {
        FileOutputStream var1 = null;

        try
        {
            var1 = new FileOutputStream(this.serverPropertiesFile);
            this.serverProperties.store(var1, "Minecraft server properties");
        }
        catch (Exception var11)
        {
            LOGGER.warn("Failed to save " + this.serverPropertiesFile, var11);
            this.generateNewProperties();
        }
        finally
        {
            if (var1 != null)
            {
                try
                {
                    var1.close();
                }
                catch (IOException var10)
                {
                    ;
                }
            }
        }
    }

    /**
     * Returns this PropertyManager's file object used for property saving.
     */
    public File getPropertiesFile()
    {
        return this.serverPropertiesFile;
    }

    /**
     * Returns a string property. If the property doesn't exist the default is returned.
     */
    public String getStringProperty(String key, String defaultValue)
    {
        if (!this.serverProperties.containsKey(key))
        {
            this.serverProperties.setProperty(key, defaultValue);
            this.saveProperties();
            this.saveProperties();
        }

        return this.serverProperties.getProperty(key, defaultValue);
    }

    /**
     * Gets an integer property. If it does not exist, set it to the specified value.
     */
    public int getIntProperty(String key, int defaultValue)
    {
        try
        {
            return Integer.parseInt(this.getStringProperty(key, "" + defaultValue));
        }
        catch (Exception var4)
        {
            this.serverProperties.setProperty(key, "" + defaultValue);
            this.saveProperties();
            return defaultValue;
        }
    }

    public long getLongProperty(String key, long defaultValue)
    {
        try
        {
            return Long.parseLong(this.getStringProperty(key, "" + defaultValue));
        }
        catch (Exception var5)
        {
            this.serverProperties.setProperty(key, "" + defaultValue);
            this.saveProperties();
            return defaultValue;
        }
    }

    /**
     * Gets a boolean property. If it does not exist, set it to the specified value.
     */
    public boolean getBooleanProperty(String key, boolean defaultValue)
    {
        try
        {
            return Boolean.parseBoolean(this.getStringProperty(key, "" + defaultValue));
        }
        catch (Exception var4)
        {
            this.serverProperties.setProperty(key, "" + defaultValue);
            this.saveProperties();
            return defaultValue;
        }
    }

    /**
     * Saves an Object with the given property name.
     */
    public void setProperty(String key, Object value)
    {
        this.serverProperties.setProperty(key, "" + value);
    }
}
