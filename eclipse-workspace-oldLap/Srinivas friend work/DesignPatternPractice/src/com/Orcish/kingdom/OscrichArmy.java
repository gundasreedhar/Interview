package com.Orcish.kingdom;

import com.basic.interfaces.Army;

public class OscrichArmy implements Army {

	private static final String DESCRIPTION = "Oscrich Army !!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
