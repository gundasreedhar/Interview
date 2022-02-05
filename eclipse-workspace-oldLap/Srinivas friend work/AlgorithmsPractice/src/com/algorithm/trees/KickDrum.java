package com.algorithm.trees;

import java.util.ArrayList;
import java.util.*;

public class KickDrum {

	public static void main(String[] args) {
		List<String> eventDetails = new ArrayList<>();
		eventDetails.add("8 10");
		eventDetails.add("2 3");
		eventDetails.add("4 5");
		eventDetails.add("11 12");
		eventDetails.add("3 4");
		eventDetails.add("5 6");
		eventDetails.add("6 7");
		eventDetails.add("8 9");
		eventDetails.add("10 11");
		eventDetails.add("7 8");
		eventDetails.add("1 4");

		findMaximumEvents(eventDetails);
	}

	static void findMaximumEvents(List<String> eventDetails) {

		TreeMap<Integer, Integer> timeRangeMap = new TreeMap<>();
		for (String event : eventDetails) {

			String[] eventSplit = event.split(" ");
			String startT = eventSplit[0];
			String endT = eventSplit[1];
			timeRangeMap.put(Integer.parseInt(startT), Integer.parseInt(endT));

		}

		int start = -1;
		int end = -1;
		int eventCount = 0;
		for (Map.Entry<Integer, Integer> entry : timeRangeMap.entrySet()) {

			if (start == 0) {
				start = entry.getKey();
				end = entry.getValue();
				continue;
			}

			int tempStart = entry.getKey();
			int tempEnd = entry.getValue();
			if (tempStart < end && tempEnd < end) {
				start = tempStart;
				end = tempEnd;
			}

			else if (tempStart > end) {
				eventCount++;
				start = tempStart;
				end = tempEnd;
			}

		}

		System.out.println("eventCount is  " + eventCount);
	}

}
