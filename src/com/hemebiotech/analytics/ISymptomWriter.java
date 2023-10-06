package com.hemebiotech.analytics;

import java.util.TreeMap;

/**
 * Anything that will write symptom data in a file from a parameter.
 * <p>
 * There is no return value
 */
public interface ISymptomWriter {
    /**
     * Writes one symptom per line with its number of occurrences from the provided map in a new file
     * @param symptomsSorted A sorted map of symptoms (key) with the number of occurrences (value)
     */
    void writeSymptoms(TreeMap<String, Integer> symptomsSorted);
}
