package com.github.tuserver.api.block;

import com.github.tuserver.api.world.Location;

public interface Block {

	public Location getLocation();

	public int getID();

	public int getData();

	/**
	 * Returns true if the block at the specified coordinates is empty
	 */
	public boolean isAirBlock();

	/**
	 * Sets the block ID and metadata at a given location. Args: X, Y, Z, new
	 * block ID, new metadata, flags. Flag 1 will cause a block update. Flag 2
	 * will send the change to clients (you almost always want this). Flag 4
	 * prevents the block from being re-rendered, if this is a client world.
	 * Flags can be added together.
	 */
	public boolean setBlock(int id, int metadata, int flag);

	/**
	 * Sets a block by a coordinate
	 */
	public boolean setBlock(int id);

	public void markBlockForUpdate();

	/**
	 * Checks if the specified block is able to see the sky
	 */
	public boolean canBlockSeeTheSky();

	/**
	 * Does the same as getBlockLightValue_do but without checking if its not a
	 * normal block
	 */
	public int getFullBlockLightValue();

	/**
	 * Returns saved light value without taking into account the time of day.
	 * Either looks in the sky light map or block light map based on the
	 * enumSkyBlock arg.
	 */
	public int getLightValue();

	/**
	 * Sets the light value either into the sky map or block map depending on if
	 * enumSkyBlock is set to sky or block. Args: enumSkyBlock, lightValue
	 */
	public void setLightValue(int lightvalue);

	public Block getRelative(final int modX, final int modY, final int modZ);

	public Block getRelative(BlockSide side);

}