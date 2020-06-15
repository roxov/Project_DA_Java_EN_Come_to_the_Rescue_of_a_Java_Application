package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Write symptom data from a sorted Map in a new file. One symptom and its
 * occurence per line.
 * 
 */

public interface ISymptomWriter {
	/**
	 * 
	 * Create the final file and write in it symptoms and occurences.
	 * 
	 * @param symptomsMap, the sorted Map obtain with the SymptomCounter.
	 * @throws IOException
	 */
	void createSymptomsFile(Map<String, Integer> symptomsMap) throws IOException;
}
