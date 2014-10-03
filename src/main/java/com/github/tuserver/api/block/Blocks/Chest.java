package com.github.tuserver.api.block.Blocks;

import com.github.tuserver.api.block.Block;
import com.github.tuserver.api.inv.Inventory;

public interface Chest extends Block {
	public Inventory getInventory();
}