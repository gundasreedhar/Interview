package com.geekTrust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MessageInterpreter {

	public static void main(String[] args) {

		int kingdomAcquired = 0;
		List<Kingdom> kingdomAllies = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String inputMessage1 = scanner.nextLine();
		if (kingdomAcquired == 0) {
			System.out.println("None");
		}

		String inputMessage2 = scanner.nextLine();
		if (kingdomAllies.isEmpty()) {
			System.out.println("None");
		}

		System.out.println("Messages to kingdoms from King Shan:");
		int numberOfKingdomsContacted = scanner.nextInt();

		Map<Kingdom, String> shanMessageMap = new HashMap<>();
		while (numberOfKingdomsContacted > 0) {
			String shanMessage = scanner.next();
			String inputMessage[] = shanMessage.split(",");
			String kingdom = inputMessage[0];
			String message = inputMessage[1];
			Kingdom kingdomEnum = null;
			for (Kingdom eachKindom : Kingdom.values()) {
				if (eachKindom.getValue().equals(kingdom)) {
					kingdomEnum = eachKindom;
					break;
				}
			}
			shanMessageMap.put(kingdomEnum, message);

		}

		Ruler shanRuler = MessageCheckerUtil.getRulerAfterMessageInterpret(shanMessageMap);
		System.out.println("Who is the Ruler !");
		System.out.println(shanRuler.getRuler());
		System.out.println("Allies of kingShan! ");
		System.out.println(shanRuler.getAllies());

	}

}
