package com.geekTrust.logic;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mockito.Mockito;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.geekTrust.beans.Kingdom;

public class KingdomSenderTest {
	InputOutputProcesser inputOutputProcesser;

	@BeforeTest
	void setup() {
		inputOutputProcesser = new InputOutputProcesser();
	}

	@Test
	void testMessageSender() {
		InputOutputProcesser spiedInoutProcesser = Mockito.spy(inputOutputProcesser);
		Map<String, Kingdom> kingdomMappings = generateKingdomMappings();
		Map<String, Map<String, Kingdom>> universekingdomMappings = generateTestUniverseMappings(kingdomMappings);
		Mockito.doReturn(universekingdomMappings).when(spiedInoutProcesser).loadKingdomData();

		Mockito.doReturn(kingdomMappings).when(spiedInoutProcesser).getProperKingDomMappings(Mockito.anyMap());
		Kingdom kingdom = kingdomMappings.get("space");
		kingdom.setEmblem("space");
		kingdom.setAnimal("gorilla");
		kingdom.setKing(false);
		generateMessageSender(kingdomMappings, kingdom);
		Mockito.doReturn(kingdom).when(spiedInoutProcesser).getSenderKingdom(kingdomMappings);
		Mockito.doReturn(kingdom).when(spiedInoutProcesser).messageSender(kingdomMappings, kingdom);
		spiedInoutProcesser.messageSender();

		List<Kingdom> expectedAllies = generateExpectedAllies(kingdomMappings);
		Collections.sort(expectedAllies);
		List<Kingdom> resultAllies = getResultAllies(kingdomMappings);
		Collections.sort(resultAllies);
		assertEquals(expectedAllies, resultAllies);

	}

	private List<Kingdom> getResultAllies(Map<String, Kingdom> kingdomMappings) {
		List<Kingdom> allies = new ArrayList<Kingdom>();
		for (Map.Entry<String, Kingdom> kingdomEntry : kingdomMappings.entrySet()) {
			Kingdom kingdom = kingdomEntry.getValue();
			if (kingdom.isKing()) {
				allies = kingdom.getAllies();
			}
		}
		return allies;
	}

	private List<Kingdom> generateExpectedAllies(Map<String, Kingdom> kingdomMappings) {
		List<Kingdom> kingdoms = new ArrayList<Kingdom>();
		kingdoms.add(kingdomMappings.get("air"));
		kingdoms.add(kingdomMappings.get("land"));
		kingdoms.add(kingdomMappings.get("ice"));
		return kingdoms;
	}

	public void generateMessageSender(Map<String, Kingdom> kingdomMappings, Kingdom senderKingdom) {
		List<Kingdom> allKingdomsMessageSend = new ArrayList<Kingdom>();

		Map<String, String> map = new HashMap<String, String>();
		map.put("Air", "oaaawaala");
		map.put("Land", "a1d22n333a4444p");
		map.put("Ice", "zmzmzmzaztzozh");

		for (Map.Entry<String, String> entryMap : map.entrySet()) {

			String emblem = entryMap.getKey();
			String message = entryMap.getValue();
			Kingdom kingdom = kingdomMappings.get(emblem.toLowerCase());
			kingdom.sendMesage(message);
			allKingdomsMessageSend.add(kingdom);
		}

		senderKingdom.setAllKingdomsMessageSend(allKingdomsMessageSend);

	}

	private Map<String, Kingdom> generateKingdomMappings() {
		Map<String, Kingdom> kingdomMappings = new HashMap<String, Kingdom>();
		Kingdom kingdom1 = new Kingdom();
		kingdom1.setEmblem("land");
		kingdom1.setAnimal("panda");
		kingdomMappings.put("land", kingdom1);
		Kingdom kingdom2 = new Kingdom();
		kingdom2.setEmblem("water");
		kingdom2.setAnimal("octopus");
		kingdomMappings.put("water", kingdom2);
		Kingdom kingdom3 = new Kingdom();
		kingdom3.setEmblem("ice");
		kingdom3.setAnimal("mammoth");
		kingdomMappings.put("ice", kingdom3);
		Kingdom kingdom4 = new Kingdom();
		kingdom4.setEmblem("air");
		kingdom4.setAnimal("owl");
		kingdomMappings.put("air", kingdom4);
		Kingdom kingdom5 = new Kingdom();
		kingdom5.setEmblem("fire");
		kingdom5.setAnimal("dragon");
		kingdomMappings.put("fire", kingdom5);
		Kingdom kingdom6 = new Kingdom();
		kingdom6.setEmblem("space");
		kingdom6.setAnimal("gorilla");
		kingdomMappings.put("space", kingdom6);

		return kingdomMappings;
	}

	private Map<String, Map<String, Kingdom>> generateTestUniverseMappings(Map<String, Kingdom> kingdomMappings) {
		Map<String, Map<String, Kingdom>> universeMappings = new HashMap<String, Map<String, Kingdom>>();
		universeMappings.put("Southeras", kingdomMappings);

		return universeMappings;
	}

}
