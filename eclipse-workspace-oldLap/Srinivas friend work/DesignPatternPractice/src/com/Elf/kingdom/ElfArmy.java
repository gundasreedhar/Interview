package com.Elf.kingdom;

import com.basic.interfaces.Army;

public class ElfArmy implements Army {

	private static final String DESCRIPTION = "Elf Army !!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
