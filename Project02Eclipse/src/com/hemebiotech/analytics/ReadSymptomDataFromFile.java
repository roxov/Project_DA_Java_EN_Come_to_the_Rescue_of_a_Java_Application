package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Read the file from the given filepath and return a list of symptoms, with
 * duplications.
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	private BufferedReader reader;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 *
	 */

	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates
	 *         are possible/probable
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Override
	public List<String> GetSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();

		if (filepath != null) {
			reader = new BufferedReader(new FileReader(filepath));
			String line = reader.readLine();

			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
		}
		return result;
	}

	public void close() throws IOException {
		reader.close();
	}
}
