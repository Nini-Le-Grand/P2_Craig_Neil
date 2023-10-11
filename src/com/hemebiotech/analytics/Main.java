package com.hemebiotech.analytics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.List;

/**
 * The overall process of the program
 */
public class Main {
    /**
     * Instances all three classes of the project and calls methods in the right order
     * @param args arguments made public
     */
    public static void main(String[] args) {
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("resources/symptoms.txt");
        WriteSymptomDataToFile writer = new WriteSymptomDataToFile("output/result.out");
        AnalyticsCounter counter = new AnalyticsCounter();

        List<String> symptoms = reader.getSymptoms();
        HashMap<String, Integer> symptomsCounted = counter.countSymptoms(symptoms);
        TreeMap<String, Integer> symptomsSorted = counter.sortSymptoms(symptomsCounted);
        writer.writeSymptoms(symptomsSorted);
    }
}
