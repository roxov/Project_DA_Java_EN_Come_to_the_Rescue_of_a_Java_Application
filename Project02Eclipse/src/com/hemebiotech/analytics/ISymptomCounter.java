package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

/**
 * 
 * Take a list of symptoms with duplications and write symptoms and their
 * occurence (no duplication) in a sorted Map.
 * 
 */
public interface ISymptomCounter {

	/**
	 * 
	 * @param symptomsList, the list extracted from file with
	 *                      ReadSymptomDataFromFile.
	 * 
	 * @return result, a sorted Map with symptoms and their occurence.
	 * 
	 */
	TreeMap<String, Integer> counter(List<String> symptomsList);
}
