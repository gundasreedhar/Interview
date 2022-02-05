package com.basic.interfaces;

import com.Elf.kingdom.ElfKingdomFactory;
import com.Orcish.kingdom.OscrichKingdomFactory;
import com.abstractdesign.pattern.AbstractKingdomFactory;

public class FactoryProvider {

	public enum KingdomEnum {
		ELF, OSR
	}

	static public AbstractKingdomFactory getProperFactory(KingdomEnum kingdomEnum) {

		switch (kingdomEnum) {
		case ELF:
			return new ElfKingdomFactory();

		case OSR:
			return new OscrichKingdomFactory();

		default:
			throw new IllegalStateException("Not proper kingdomName ");
		}
	}

}
