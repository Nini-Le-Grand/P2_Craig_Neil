package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * Treatment of the data from a raw list to a sorted list with duplicates counted
 */
public class AnalyticsCounter {
	/**
	 * Transforms the list of symptoms provided into a map of the symptoms and the number of them
	 * @param symptoms a raw list string of symptoms
	 * @return A map of symptoms (key string) and the number of occurrences (value integer)
	 */
	public HashMap<String, Integer> countSymptoms(List<String> symptoms) {
		HashMap<String, Integer> symptomCount = new HashMap<>();

		for (String symptom : symptoms) {
			if(symptomCount.containsKey(symptom)) {
				symptomCount.put(symptom, symptomCount.get(symptom) + 1);
			} else {
				symptomCount.put(symptom, 1);
			}
		}
		return symptomCount;
	}

	/**
	 * Sorts alphabetically the map of symptomCount
	 * @param symptomCount a map of symptoms (key string) and the number of occurrences (value integer)
	 * @return An alphabetically sorted map of symptoms (key string) and the number of occurrences (value integer)
	 */
	public TreeMap<String, Integer> sortSymptoms(HashMap<String, Integer> symptomCount) {
        return new TreeMap<>(symptomCount);
	}
}
