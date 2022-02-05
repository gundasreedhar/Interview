package com.abstractdesign.pattern;

import com.basic.interfaces.Army;
import com.basic.interfaces.Castle;
import com.basic.interfaces.King;

public interface AbstractKingdomFactory {
	King createKing();

	Castle createCastle();

	Army createArmy();

}
