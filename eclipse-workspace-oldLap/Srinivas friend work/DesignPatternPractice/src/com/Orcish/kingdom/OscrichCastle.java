package com.Orcish.kingdom;

import com.basic.interfaces.Castle;

public class OscrichCastle implements Castle {
	private final static String DESCRIPTION = "Oscrich castle !!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
