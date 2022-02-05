package com.test.designpattern;

import com.abstractdesign.pattern.AbstractKingdomFactory;
import com.basic.interfaces.FactoryProvider;
import com.basic.interfaces.FactoryProvider.KingdomEnum;

public class TestAbstractFactory {
	public static void main(String[] args) {

		AbstractKingdomFactory abstractKingdomFactory = FactoryProvider.getProperFactory(KingdomEnum.ELF);
		System.out.println(abstractKingdomFactory.createArmy().getDescription());
		System.out.println(abstractKingdomFactory.createCastle().getDescription());

		AbstractKingdomFactory abstractKingdomFactory2 = FactoryProvider.getProperFactory(KingdomEnum.OSR);
		System.out.println(abstractKingdomFactory.createArmy().getDescription());
		System.out.println(abstractKingdomFactory2.createCastle().getDescription());
	}

}
