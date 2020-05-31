package com.hemebiotech.analytics;

public class SymptomsFileWriter {
	// next generate output

	public void fileWriter() {
		SymptomsFileWriter writer = new SymptomsFileWriter("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
	}
}
