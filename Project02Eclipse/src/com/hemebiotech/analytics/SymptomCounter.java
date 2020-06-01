package com.hemebiotech.analytics;

import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;

/**
 * 
 * Initialize at 1 a new <key-value> in a sorted Map, each time a new symptom
 * appears. Then, add 1 to the value, each time the symptoms appears again.
 *
 * @param symptomsList, the list extracted from file with
 *                      ReadSymptomDataFromFile.
 * @return result, a sorted Map with symptoms and their occurence.
 */

public class SymptomCounter {

	public TreeMap<String, Integer> counter(List<String> symptomsList) {
		TreeMap<String, Integer> result = new TreeMap<String, Integer>();
		ListIterator<String> it = symptomsList.listIterator();

		while (it.hasNext()) {
			String clef = symptomsList.get(it.nextIndex());

			if (result.containsKey(clef)) {
				Integer newValue = result.get(clef) + 1;
				// Attention, it.next() fait avancer l'itérateur de 1.
				result.put(it.next(), newValue);
			} else {
				result.put(it.next(), 1);
			}
		}
		return result;
	}
}
