package com.geekTrust.logic;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.geekTrust.beans.ApplicationConstants;
import com.geekTrust.beans.IKingdomProvider;
import com.geekTrust.beans.Kingdom;

public class KingdomProviderFileImpl implements IKingdomProvider {

	@Override
	public Map<String, Map<String, Kingdom>> getKingdoms() {

		String universePropertyFilePath = ApplicationConstants.UNIVERSE_PROPERTY_FILE_NAME;
		List<String> universeList = new ArrayList<String>();
		loadUniverses(universePropertyFilePath, universeList);

		Map<String, Map<String, Kingdom>> universeKingdomMap = loadKingdoms(universeList);

		return universeKingdomMap;
	}

	private Map<String, Map<String, Kingdom>> loadKingdoms(List<String> universeList) {
		Map<String, Map<String, Kingdom>> universeKingdomMap = new HashMap<>();
		Map<String, Kingdom> kingdomMap = new HashMap<>();
		for (String universe : universeList) {
			Properties properties = new Properties();
			try (InputStream inputStream = KingdomProviderFileImpl.class.getClassLoader()
					.getResourceAsStream(universe + ".properties")) {
				properties.load(inputStream);
				Enumeration<Object> keySet = properties.keys();
				while (keySet.hasMoreElements()) {
					String key = (String) keySet.nextElement();
					String value = properties.getProperty(key);
					Kingdom kingdom = new Kingdom();
					kingdom.setEmblem(key);
					kingdom.setAnimal(value);
					kingdomMap.put(key, kingdom);

				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			universeKingdomMap.put(universe, kingdomMap);

		}

		return universeKingdomMap;
	}

	private void loadUniverses(String universePropertyFilePath, List<String> universeList) {
		Properties properties = new Properties();
		try (InputStream inputStream = KingdomProviderFileImpl.class.getClassLoader()
				.getResourceAsStream(universePropertyFilePath)) {
			properties.load(inputStream);
			Enumeration<Object> keySet = properties.keys();
			while (keySet.hasMoreElements()) {
				String key = (String) keySet.nextElement();
				universeList.add(key);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		KingdomProviderFileImpl kingdomProviderScannerImpl = new KingdomProviderFileImpl();
		kingdomProviderScannerImpl.getKingdoms();

	}

}
