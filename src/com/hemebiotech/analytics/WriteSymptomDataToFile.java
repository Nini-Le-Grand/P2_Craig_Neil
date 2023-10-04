package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class WriteSymptomDataToFile implements ISymptomWriter{
    private final String filepath;

    public WriteSymptomDataToFile (String filepath) {
        this.filepath = filepath;
    }
    @Override
    public void WriteSymptoms(HashMap<String, Integer> symptoms) {
        if(!symptoms.isEmpty() && filepath != null) {
            try {
                FileWriter writer = new FileWriter (filepath);

                for (String i : symptoms.keySet()) {
                    writer.write(i + ": " + symptoms.get(i) + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}