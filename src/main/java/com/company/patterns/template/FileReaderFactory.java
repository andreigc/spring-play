package com.company.patterns.template;

import java.util.Scanner;

public class FileReaderFactory {

	public static FileReadTemplate readAllText() {
		return new FileReadTemplate() {
			
			@Override
			public void doLogic(Scanner scanner) {
				
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
			}
		};
	}
	
	public static FileReadTemplate readNumbersOnly() {
		return new FileReadTemplate() {

			@Override
			public void doLogic(Scanner scanner) {
				
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				scanner.close();
	
			}
		};
	}
	
}
