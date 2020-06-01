package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List<String> symptomsList = new ReadSymptomDataFromFile("Project02Eclipse/resources/symptoms.txt").GetSymptoms();
		TreeMap<String,Integer> sortedSymptomsMap = new SymptomCounter().counter(symptomsList);		
		new SymptomsFileWriter("Project02Eclipse/result.out").createSymptomsFile(sortedSymptomsMap);
		
		System.out.println(sortedSymptomsMap);
	}


}
