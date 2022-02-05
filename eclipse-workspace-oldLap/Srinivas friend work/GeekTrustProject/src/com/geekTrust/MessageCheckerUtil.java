package com.geekTrust;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MessageCheckerUtil {

	private final static int shanVictoryCount = 3;

	static boolean checkMessage(Kingdom kingdom, String message) {
		String emblemSymbol = KingdomMessageUtil.getAnimalFromKingdom(kingdom);
		boolean checker = compareEmblemWithMessage(emblemSymbol, message);
		return checker;
	}

	static boolean compareEmblemWithMessage(String emblemSymbol, String message) {
		int count = 0;
		int i = emblemSymbol.length();
		int j = message.length();
		while (i >= 0 && j >= 0) {
			if (emblemSymbol.charAt(i) == message.charAt(j)) {
				count++;
				i--;
				j--;
				continue;
			}

			j--;

		}
		if (count == i) {
			return true;
		}

		return false;
	}

	static Ruler getRulerAfterMessageInterpret(Map<Kingdom, String> shanMessageMap) {
		Ruler shanRuler = new Ruler();
		List<String> allies = new ArrayList<>();
		int expectedVictoryCount = 0;
		for (Entry<Kingdom, String> eachShanMessage : shanMessageMap.entrySet()) {
			Kingdom kingdom = eachShanMessage.getKey();
			String message = eachShanMessage.getValue();
			String emblemSymbol = KingdomMessageUtil.getAnimalFromKingdom(kingdom);
			if (compareEmblemWithMessage(emblemSymbol, message)) {
				allies.add(eachShanMessage.getKey().getValue());
				expectedVictoryCount++;
			}
		}

		if (expectedVictoryCount == shanVictoryCount) {
			shanRuler.setRuler("SHAN");
		}

		else {
			shanRuler.setRuler("None");
			allies = null;
		}

		shanRuler.setAllies(allies);

		return shanRuler;
	}
}
