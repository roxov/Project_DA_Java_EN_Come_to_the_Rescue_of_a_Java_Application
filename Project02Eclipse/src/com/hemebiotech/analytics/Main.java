package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List<String> symptomsList = new ReadSymptomDataFromFile("Project02Eclipse/resources/symptoms.txt").GetSymptoms();
				
		System.out.println(symptomsList);
		
	}


}
