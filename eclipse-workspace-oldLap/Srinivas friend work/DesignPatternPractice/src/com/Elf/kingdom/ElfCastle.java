package com.Elf.kingdom;

import com.basic.interfaces.Castle;

public class ElfCastle implements Castle {
	private final static String DESCRIPTION = "Elf castle !!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
