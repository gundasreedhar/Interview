package com.geekTrust.beans;

import java.util.ArrayList;
import java.util.List;

import com.geekTrust.logic.KingdomUtil;

public class Kingdom {

	private String king;
	private String emblem;
	private String message;
	private String animal;
	private boolean isKing;
	private List<Kingdom> allies;
	private List<Kingdom> allKingdomsMessageSend;

	public String getKing() {
		return king;
	}

	public void setKing(String king) {
		this.king = king;
	}

	public String getEmblem() {
		return emblem;
	}

	public void setEmblem(String emblem) {
		this.emblem = emblem;
	}

	public boolean isKing() {
		return isKing;
	}

	public void setKing(boolean isKing) {
		this.isKing = isKing;
	}

	public List<Kingdom> getAllies() {
		return allies;
	}

	public void setAllies(List<Kingdom> allies) {
		this.allies = allies;
	}

	public List<Kingdom> getAllKingdomsMessageSend() {
		return allKingdomsMessageSend;
	}

	public void setAllKingdomsMessageSend(List<Kingdom> allKingdomsMessageSend) {
		this.allKingdomsMessageSend = allKingdomsMessageSend;
	}

	public void sendMesage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {

		return emblem;
	}

	public Kingdom findRulerAndAllies() {

		List<Kingdom> allKingdomsMessageSent = this.getAllKingdomsMessageSend();
		List<Kingdom> allies = new ArrayList<Kingdom>();
		int expectedVictoryCounter = 0;

		for (Kingdom kingdom : allKingdomsMessageSent) {
			String messageRecieved = kingdom.getMessage();
			String sortedMessage = KingdomUtil.sort(messageRecieved);
			String animal = kingdom.getAnimal();
			String sortedAnimal = KingdomUtil.sort(animal);
			boolean isMesageValid = KingdomUtil.compareData(sortedAnimal, sortedMessage);
			if (isMesageValid) {
				expectedVictoryCounter++;
				allies.add(kingdom);
			}

		}

		if (expectedVictoryCounter >= KingdomUtil.rulerVictoryCount) {
			this.setKing(this.getKing());
			this.setKing(true);
		}

		else {
			this.setKing("None");
			allies = null;
		}

		this.setAllies(allies);

		return this;

	}
}
