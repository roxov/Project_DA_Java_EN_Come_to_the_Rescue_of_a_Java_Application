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
		Set<Entry<String, Integer>> setEntry = symptomsMap.entrySet();
		Iterator<Map.Entry<String, Integer>> itEntry = setEntry.iterator();


		FileWriter writer = new FileWriter(new File(filepath));
			while (itEntry.hasNext()) {
				Map.Entry<String, Integer> entry = itEntry.next();
				writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
			}

			writer.flush();
			writer.close();

	}
}
