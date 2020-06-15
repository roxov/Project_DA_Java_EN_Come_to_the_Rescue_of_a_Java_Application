package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * Take a list of symptoms with duplications and write symptoms and their
 * occurrence (no duplication) in a sorted Map.
 * 
 */

public class SymptomCounter implements ISymptomCounter {

	/**
	 * 
	 * Initialize at 1 a new <key-value> in a sorted Map, each time a new symptom
	 * appears. Then, add 1 to the value, each time the symptoms appears again.
	 *
	 * @param symptomsList, the list extracted from file with
	 *                      ReadSymptomDataFromFile.
	 * @return result, a sorted Map with symptoms and their occurence.
	 */

	public TreeMap<String, Integer> counter(List<String> symptomsList) {
		TreeMap<String, Integer> result = new TreeMap<String, Integer>();

		for (String clef : symptomsList) {
			result.put(clef, result.getOrDefault(clef, 0) + 1);
		}
		return result;
	}
}
