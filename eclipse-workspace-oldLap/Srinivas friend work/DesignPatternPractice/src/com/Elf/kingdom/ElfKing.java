package com.Elf.kingdom;

import com.basic.interfaces.King;

public class ElfKing implements King {

	private final static String DESCRIPTION = "Elf King !!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
