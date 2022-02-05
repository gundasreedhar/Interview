package com.Orcish.kingdom;

import com.basic.interfaces.King;

public class OscrichKing implements King {

	private final static String DESCRIPTION = "Oscrich King !!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
