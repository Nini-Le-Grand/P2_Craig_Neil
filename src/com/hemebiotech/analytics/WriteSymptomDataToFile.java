package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Treatment of the writing of the final data list in a file where duplicates are counted and the list alphabetically sorted
 */
public class WriteSymptomDataToFile implements ISymptomWriter{
    private final String filepath;
    /**
     * @param filepath a full or partial path to file in which symptoms will be written, one per line
     */
    public WriteSymptomDataToFile (String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void writeSymptoms(TreeMap<String, Integer> symptomsSorted) {
        if(!symptomsSorted.isEmpty() && filepath != null) {
            try {
                FileWriter writer = new FileWriter (filepath);

                for (String i : symptomsSorted.keySet()) {
                    writer.write(i + ": " + symptomsSorted.get(i) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("No symptoms found");
        }
    }
}
