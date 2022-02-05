package com.geekTrust;

public enum Kingdom {

	SPACE("space"), LAND("land"), WATER("water"), ICE("ice"), AIR("air"), FIRE("fire");
	String kingdom;

	private Kingdom(String kingdom) {
		this.kingdom = kingdom;
	}
	
	String getValue(){
		return kingdom;
	}

}
