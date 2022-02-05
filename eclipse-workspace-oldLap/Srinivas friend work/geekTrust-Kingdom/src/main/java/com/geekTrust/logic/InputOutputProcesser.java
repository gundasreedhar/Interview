package com.geekTrust.logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.geekTrust.beans.ApplicationConstants;
import com.geekTrust.beans.Kingdom;

public class InputOutputProcesser {

	public static void main(String[] args) {

		Map<String, Map<String, Kingdom>> universekingdomMappings = loadKingdomData();

		Map<String, Kingdom> kingdomMappings = getProperKingDomMappings(universekingdomMappings);
		Kingdom senderKingdom = getSenderKingdom(kingdomMappings);
		senderKingdom.setKing("King Shan");
		isSoutherosKing(kingdomMappings);
		System.out.println("Messages to kingdoms from King Shan: ");
		messageSender(kingdomMappings, senderKingdom);
		senderKingdom.findRulerAndAllies();
		isSoutherosKing(kingdomMappings);
	}

	private static Kingdom getSenderKingdom(Map<String, Kingdom> kingdomMappings) {
		return kingdomMappings.get(ApplicationConstants.SPACE);
	}

	private static Map<String, Kingdom> getProperKingDomMappings(
			Map<String, Map<String, Kingdom>> universekingdomMappings) {
		return universekingdomMappings.get(ApplicationConstants.SOUTHEROS);
	}

	private static Map<String, Map<String, Kingdom>> loadKingdomData() {
		KingdomProviderFileImpl kingdomProvider = new KingdomProviderFileImpl();
		Map<String, Map<String, Kingdom>> universekingdomMappings = kingdomProvider.getKingdoms();
		return universekingdomMappings;
	}

	private static void messageSender(Map<String, Kingdom> kingdomMappings, Kingdom senderKingdom) {
		Scanner sc = new Scanner(System.in);
		List<Kingdom> allKingdomsMessageSend = new ArrayList<Kingdom>();
		String[] input = new String[sc.nextInt()];
		sc.nextLine();
		for (int i = 0; i < input.length; i++) {
			String data = sc.nextLine();
			String emblemMessage[] = data.split(",");
			String emblem = emblemMessage[0];
			String message = emblemMessage[1];
			Kingdom kingdom = kingdomMappings.get(emblem.toLowerCase());
			kingdom.sendMesage(message);
			allKingdomsMessageSend.add(kingdom);
		}

		senderKingdom.setAllKingdomsMessageSend(allKingdomsMessageSend);

	}

	private static void isSoutherosKing(Map<String, Kingdom> kingdomMappings) {
		System.out.println("Who is the ruler of Southeros?");
		String king = null;
		List<Kingdom> allies = null;

		Collection<Kingdom> kingdoms = kingdomMappings.values();
		for (Kingdom kingdom : kingdoms) {
			if (kingdom.isKing()) {
				king = "King Shan";
				allies = kingdom.getAllies();
				break;
			}

		}

		if (king == null) {
			System.out.println("None");
		} else
			System.out.println("King Shan");
		System.out.println("Allies of King Shan?  ");
		if (allies == null) {
			System.out.println("None");
		} else
			System.out.println(allies);
	}

}
