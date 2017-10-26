package com.company.patterns.template;

import java.io.IOException;

public class FileReadApp {

	public static void main(String[] args) {
		
		FileReadTemplate fr = FileReaderFactory.readAllText();
	
		FileReadTemplate fn = FileReaderFactory.readNumbersOnly();
		
		
		try {
			fr.readFile("info.txt");
			fn.readFile("info.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
