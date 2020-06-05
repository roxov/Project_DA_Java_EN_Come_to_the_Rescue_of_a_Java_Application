package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class Main {
	public static final String FILE_TO_READ = "Project02Eclipse/resources/symptoms.txt";
	public static final String FILE_TO_WRITE = "Project02Eclipse/result.out";
	
	public static void main(String[] args) throws Exception {
		
		
		ISymptomReader symptomReader = new ReadSymptomDataFromFile(FILE_TO_READ);
		
		
		List<String> symptomsList;
		try (ISymptomWriter writer = new SymptomsFileWriter(FILE_TO_WRITE)){
			symptomsList = symptomReader.GetSymptoms();
			
			TreeMap<String, Integer> sortedSymptomsMap = new SymptomCounter().counter(symptomsList);

			writer.createSymptomsFile(sortedSymptomsMap);
			
		} catch (FileNotFoundException e) {
			System.out.println("Le chemin du fichier n'a pas été trouvé.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				symptomReader.close();
		}	
	}

}
