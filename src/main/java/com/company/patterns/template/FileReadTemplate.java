package com.company.patterns.template;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public abstract class FileReadTemplate {
	public void readFile(String filename) throws IOException {
		FileInputStream is = new FileInputStream(filename);
		Scanner scanner = new Scanner(is);
		doLogic(scanner);
		is.close();
	}
	
	public abstract void doLogic(Scanner scanner);
	
}



//
//public interface FileReadTemplate {
//
//	void handleReading(InputStream is) throws IOException;
//	
//}
