package com.Elf.kingdom;

import com.abstractdesign.pattern.AbstractKingdomFactory;
import com.basic.interfaces.Army;
import com.basic.interfaces.Castle;
import com.basic.interfaces.King;

public class ElfKingdomFactory implements AbstractKingdomFactory {

	@Override
	public King createKing() {
		return new ElfKing();
	}

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

}
