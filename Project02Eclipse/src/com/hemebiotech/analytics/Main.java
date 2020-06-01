package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/**
		 * 
		 * Here enter the filepath of the file which contains symptoms.
		 * 
		 */
		List<String> symptomsList = new ReadSymptomDataFromFile("Project02Eclipse/resources/symptoms.txt")
				.GetSymptoms();

		TreeMap<String, Integer> sortedSymptomsMap = new SymptomCounter().counter(symptomsList);

		/**
		 * 
		 * Here enter the filepath and the name of the file for results and occurences.
		 * 
		 */
		new SymptomsFileWriter("Project02Eclipse/result.out").createSymptomsFile(sortedSymptomsMap);

		System.out.println(sortedSymptomsMap);
	}

}
