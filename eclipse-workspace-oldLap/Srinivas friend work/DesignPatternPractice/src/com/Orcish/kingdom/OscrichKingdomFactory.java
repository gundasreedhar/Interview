package com.Orcish.kingdom;

import com.abstractdesign.pattern.AbstractKingdomFactory;
import com.basic.interfaces.Army;
import com.basic.interfaces.Castle;
import com.basic.interfaces.King;

public class OscrichKingdomFactory implements AbstractKingdomFactory {

	@Override
	public King createKing() {
		return new OscrichKing();
	}

	@Override
	public Castle createCastle() {

		return new OscrichCastle();
	}

	@Override
	public Army createArmy() {

		return new OscrichArmy();
	}

}
