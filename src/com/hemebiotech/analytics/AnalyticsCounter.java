package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class AnalyticsCounter {
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

	public TreeMap<String, Integer> sortSymptoms(HashMap<String, Integer> symptomCount) {
        return new TreeMap<>(symptomCount);
	}
}
