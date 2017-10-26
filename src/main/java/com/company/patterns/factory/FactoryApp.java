package com.company.patterns.factory;

import java.util.Optional;

public class FactoryApp {

	public static void main(String[] args) {
//		
//		Shape c = new Circle();
//		Shape s = new Square();
//		Shape r = new Rectangle();
//		
//		c.draw();
//		s.draw();
//		r.draw();
		
//		ShapeFactory.createShape("RECTANGLE").draw();
//		ShapeFactory.createShape("CIRCLE").draw();
		
		Optional<Shape> circle= ShapeFactory.createShape("CIRCLE");
		if(circle.isPresent()) {
			circle.get().draw();
		}
		
		Optional<Shape> rectangle = ShapeFactory.createShape("RECTANGLE");
		if(rectangle.isPresent()) {
			rectangle.get().draw();
		}
		
		Optional<Shape> square = ShapeFactory.createShape("SQUARE");
		if(square.isPresent()) {
			square.get().draw();
		}
		
		Optional<Shape> unknown = ShapeFactory.createShape("Unknown");
		if(unknown.isPresent()) {
			unknown.get().draw();
		} else {
			System.out.println("optional not present");
		}
		
	}
	
}
