package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Create a new file (or erase the existing one) with the filepath given in
 * Main. Write a symptom with its occurence on each line.
 * 
 * @param symptomsMap, the sorted Map obtain with the SymptomCounter.
 * @param filepath     a full or partial path to new file with symptoms and
 *                     their occurence.
 */

public class SymptomsFileWriter {
	private String filepath;

	public SymptomsFileWriter(String filepath) {
		this.filepath = filepath;
	}

	public void createSymptomsFile(Map<String, Integer> symptomsMap) {
		Set<Entry<String, Integer>> setEntry = symptomsMap.entrySet();
		Iterator<Map.Entry<String, Integer>> itEntry = setEntry.iterator();

		File symptomsFile = new File(filepath);
		try {
			symptomsFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileWriter writer;
		try {
			writer = new FileWriter(symptomsFile);
			while (itEntry.hasNext()) {
				Map.Entry<String, Integer> entry = itEntry.next();
				writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
			}

			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
