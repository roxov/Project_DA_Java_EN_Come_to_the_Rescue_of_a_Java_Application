package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		/**
		 * 
		 * Here enter the filepath of the file which contains symptoms.
		 * 
		 */
		ISymptomReader symptomReader = new ReadSymptomDataFromFile("Project02Eclipse/resources/symptoms.txt");
		
		
		List<String> symptomsList;
		try {
			symptomsList = symptomReader.GetSymptoms();
			
			TreeMap<String, Integer> sortedSymptomsMap = new SymptomCounter().counter(symptomsList);

			/**
			 * 
			 * Here enter the filepath and the name of the file for results and occurences.
			 * 
			 */
			new SymptomsFileWriter("Project02Eclipse/result.out").createSymptomsFile(sortedSymptomsMap);

			System.out.println(sortedSymptomsMap);
		} catch (FileNotFoundException e) {
			System.out.println("Le chemin du fichier n'a pas été trouvé.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		//	reader.close();
		}
		
		
		
	}

}
