package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SymptomsFileWriter {
	private String filepath;
	
	public SymptomsFileWriter(String filepath) {
		this.filepath = filepath;
	}
	
	public void createSymptomsFile(Map<String, Integer> symptomsMap) {
		Set<Entry<String, Integer>> setEntry = symptomsMap.entrySet();
		Iterator<Map.Entry<String, Integer>> itEntry = setEntry.iterator();
		
		File symptomsFile = new File(filepath);
		try {
			symptomsFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileWriter writer;
		try {
			writer = new FileWriter(symptomsFile);
			while(itEntry.hasNext()) {
				Map.Entry<String, Integer> entry = itEntry.next();
				writer.write(entry.getKey() + " = " + entry.getValue() + "\n");
			}
			
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
		
	}
}
