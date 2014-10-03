package com.github.tuserver.api.block.Blocks;

import com.github.tuserver.api.block.Block;

public interface Sign extends Block {

	public String[] getLines();

	public String getLine(int index);

	public void setLine(int index, String line);
}
