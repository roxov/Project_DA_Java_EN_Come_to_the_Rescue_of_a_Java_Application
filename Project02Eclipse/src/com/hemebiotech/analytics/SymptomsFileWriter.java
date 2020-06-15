package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Create a new file (or erase the existing one) with the filepath given in
 * Main. Write a symptom with its occurrence on each line.
 * 
 */

public class SymptomsFileWriter implements ISymptomWriter {
	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to new file with symptoms and their
	 *                 occurence.
	 */

	public SymptomsFileWriter(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * 
	 * Create the final file and write in it symptoms and occurences.
	 * 
	 * @param symptomsMap, the sorted Map obtain with the SymptomCounter.
	 * @throws IOException
	 */

	public void createSymptomsFile(Map<String, Integer> symptomsMap) throws IOException {
		// On ne peut pas itérer sur une Map, il faut créer un Set.
		Set<Entry<String, Integer>> setEntry = symptomsMap.entrySet();

		try (FileWriter writer = new FileWriter(new File(filepath));) {

			for (Entry<String, Integer> entry : setEntry) {
				writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
			}
			writer.flush();
		}
	}
}
