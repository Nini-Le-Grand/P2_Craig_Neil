package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
        WriteSymptomDataToFile writer = new WriteSymptomDataToFile("result.out");
        AnalyticsCounter counter = new AnalyticsCounter();

        List<String> symptoms = reader.getSymptoms();
        HashMap<String, Integer> symptomsCount = counter.countSymptoms(symptoms);
        TreeMap<String, Integer> symptomsSort = counter.sortSymptoms(symptomsCount);
        writer.writeSymptoms(symptomsSort);
    }
}
