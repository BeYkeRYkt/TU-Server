package com.github.tuserver.api.world;

import com.github.tuserver.api.Sound;
import com.github.tuserver.api.block.Block;
import com.github.tuserver.api.entity.Entity;
import com.github.tuserver.api.entity.Player.Player;

public interface World {

	public int getDimensionId();

	public String getDimensionName();

	public String getName();

	public Block getBlock(int x, int y, int z);

	public Chunk getChunkFromChunkCoords(int x, int z);

	public Chunk getChunkFromBlockCoords(int x, int z);

	public Location getSpawnLocation();

	public void setSpawnLocation(Location loc);

	/**
	 * Returns true if the block at the specified coordinates is empty
	 */
	public boolean isAirBlock(int x, int y, int z);

	/**
	 * Sets the block ID and metadata at a given location. Args: X, Y, Z, new
	 * block ID, new metadata, flags. Flag 1 will cause a block update. Flag 2
	 * will send the change to clients (you almost always want this). Flag 4
	 * prevents the block from being re-rendered, if this is a client world.
	 * Flags can be added together.
	 */
	public boolean setBlock(int x, int y, int z, int id, int metadata, int flag);

	/**
	 * Sets a block by a coordinate
	 */
	public boolean setBlock(int x, int y, int z, int id);

	public void markBlockForUpdate(int x, int y, int z);

	/**
	 * Checks if the specified block is able to see the sky
	 */
	public boolean canBlockSeeTheSky(int x, int y, int z);

	/**
	 * Does the same as getBlockLightValue_do but without checking if its not a
	 * normal block
	 */
	public int getFullBlockLightValue(int x, int y, int z);

	/**
	 * Gets the light value of a block location
	 */
	public int getBlockLightValue(int x, int y, int z);

	/**
	 * Brightness for 0 (SkyBlock.Sky) is clear white and (through color
	 * computing it is assumed) DEPENDENT ON DAYTIME. Brightness for 1
	 * (SkyBlock.Block) is yellowish and independent.
	 */
	public int getSkyBlockTypeBrightness(int id, int x, int y, int z);

	/**
	 * Returns saved light value without taking into account the time of day.
	 * Either looks in the sky light map or block light map based on the
	 * enumSkyBlock arg.
	 */
	public int getSavedLightValue(int id, int x, int y, int z);

	/**
	 * Sets the light value either into the sky map or block map depending on if
	 * enumSkyBlock is set to sky or block. Args: enumSkyBlock, x, y, z,
	 * lightValue
	 */
	public void setLightValue(int id, int x, int y, int z, int lightvalue);

	/**
	 * Checks whether its daytime by seeing if the light subtracted from the
	 * skylight is less than 4
	 */
	public boolean isDaytime();

	/**
	 * Plays a sound at the entity's position. Args: entity, sound, volume
	 * (relative to 1.0), and frequency (or pitch, also relative to 1.0).
	 */
	public void playSoundAtEntity(Entity p_72956_1_, Sound sound, float volume, float frequency);

	/**
	 * Play a sound effect. Many many parameters for this function. Not sure
	 * what they do, but a classic call is : (double)i + 0.5D, (double)j + 0.5D,
	 * (double)k + 0.5D, 'random.door_open', 1.0F, world.rand.nextFloat() * 0.1F
	 * + 0.9F with i,j,k position of the block.
	 */
	public void playSoundEffect(double x, double y, double z, Sound sound, float p_72908_8_, float p_72908_9_);

	/**
	 * Plays a record at the specified coordinates of the specified name. Args:
	 * recordName, x, y, z
	 */
	public void playRecord(String name, int p_72934_2_, int p_72934_3_, int p_72934_4_);

	/**
	 * Called to place all entities as part of a world
	 */
	public boolean spawnEntityInWorld(Entity p_72838_1_);

	public void onEntityAdded(Entity p_72923_1_);

	public void onEntityRemoved(Entity p_72847_1_);

	/**
	 * Schedule the entity for removal during the next tick. Marks the entity
	 * dead in anticipation.
	 */
	public void removeEntity(Entity p_72900_1_);

	/**
	 * Creates an explosion. Args: entity, x, y, z, strength
	 */
	public Object createExplosion(Entity entity, double x, double y, double z, float strength, boolean isFlaming);

	/**
	 * Creates an explosion. Args: entity, x, y, z, strength
	 */
	public Object createExplosion(double x, double y, double z, float strength, boolean isFlaming);

	/**
	 * 
	 * @param id
	 *            - Sky/Block (0/1)
	 * @param x
	 *            - X location
	 * @param y
	 *            - Y location
	 * @param z
	 *            - Z location
	 * @return
	 */
	public boolean updateLightByType(int id, int x, int y, int z);

	/**
	 * Gets the closest player to the point within the specified distance
	 * (distance can be set to less than 0 to not limit the distance). Args: x,
	 * y, z, dist
	 */
	public Player getClosestPlayer(double p_72977_1_, double p_72977_3_, double p_72977_5_, double p_72977_7_);

	/**
	 * Returns the closest vulnerable player to this entity within the given
	 * radius, or null if none is found
	 */
	public Player getClosestVulnerablePlayerToEntity(Entity p_72856_1_, double p_72856_2_);

	/**
	 * Retrieve the world seed from level.dat
	 */
	public long getSeed();

	public long getTotalWorldTime();

	public long getWorldTime();

	/**
	 * Sets the world time.
	 */
	public void setWorldTime(long p_72877_1_);

	/**
	 * Returns true if it is thundering, false otherwise.
	 */
	public boolean isThundering();

	/**
	 * Sets whether it is thundering or not.
	 */
	public void setThundering(boolean p_76069_1_);

	/**
	 * Returns the number of ticks until next thunderbolt.
	 */
	public int getThunderTime();

	/**
	 * Defines the number of ticks until next thunderbolt.
	 */
	public void setThunderTime(int p_76090_1_);

	/**
	 * Returns true if it is raining, false otherwise.
	 */
	public boolean isRaining();

	/**
	 * Sets whether it is raining or not.
	 */
	public void setRaining(boolean p_76084_1_);

	/**
	 * Return the number of ticks until rain.
	 */
	public int getRainTime();

	/**
	 * Sets the number of ticks until rain.
	 */
	public void setRainTime(int p_76080_1_);

	/**
	 * Returns current world height.
	 */
	public int getHeight();

	/**
	 * Returns current world height.
	 */
	public int getActualHeight();
}