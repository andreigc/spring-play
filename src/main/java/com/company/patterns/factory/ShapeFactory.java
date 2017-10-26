package com.company.patterns.factory;

import java.util.Optional;

public class ShapeFactory {

	public static Optional<Shape> createShape(String shape) {
		switch(shape) {
		case "SQUARE":
			return Optional.of(new Square());
		case "CIRCLE":
			return Optional.of(new Circle());
		case "RECTANGLE":
			return Optional.of(new Rectangle());
		default:
			return Optional.empty();
		
	}
  }
	
}
