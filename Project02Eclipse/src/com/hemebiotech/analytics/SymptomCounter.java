package com.hemebiotech.analytics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class SymptomCounter {
	
	public TreeMap<String,Integer> counter(List<String> symptomsList) {
		TreeMap<String,Integer> result = new TreeMap<String,Integer>();
		//Créer symptomsList ?
		Iterator<String> it = symptomsList.iterator();
		
		//Generate an iterator to go through the keys added to the map of symptoms.
		Set<String> keysResult = result.keySet();
		Iterator<String> itmap = keysResult.iterator();
		
		
		while(it.hasNext()) {
			
			
			
			if (itmap.next()) {
			// Créer un itérateur de Map : for ?
				Integer newValue = result.get(it.next()) + 1;
				result.put(it.next(),newValue);
				
			// Si iterateur de la liste ne croise jamais l'itérateur de la map (clés)
			// add symptom de la liste dans une nouvelle clé, avec une valeur de 1
			} else {
				result.put(it.next(), 1);
			}
		}
		
		return result;
		
		/*while (line != null) {
			i++;
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			} else if (line.equals("rush")) {
				rashCount++;
			} else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine(); // get another symptom
		}*/
		
	}
}
