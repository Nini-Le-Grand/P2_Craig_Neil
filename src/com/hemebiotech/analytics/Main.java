package com.hemebiotech.analytics;

import java.util.*;

/**
 * The overall process of the program
 */
public class Main {
    /**
     * Instances all three classes of the project and calls methods in the right order
     * @param args arguments made public
     */
    public static void main(String[] args) {
        ISymptomReader reader = new ReadSymptomDataFromFile("resources/symptoms.txt");
        ISymptomWriter writer = new WriteSymptomDataToFile("output/result.out");
        AnalyticsCounter counter = new AnalyticsCounter();

        List<String> symptoms = reader.getSymptoms();
        Map<String, Integer> symptomsCounted = counter.countSymptoms(symptoms);
        TreeMap<String, Integer> symptomsSorted = counter.sortSymptoms(symptomsCounted);
        writer.writeSymptoms(symptomsSorted);
    }
}
