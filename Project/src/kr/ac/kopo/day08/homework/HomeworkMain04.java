package kr.ac.kopo.day08.homework;

import java.util.Scanner;

public class HomeworkMain04 {
	
	public static void main(String[] args) {
		int line1 = 0;
		int line2 = 0;
		
		int fig = (int) (Math.random()*4+1);
		
		line1 = (int) Math.random()*9 + 2;
		line2 = (int) Math.random()*9 + 2;
		
		if(fig == 1) {
			Square square = new Square(line1);
			square.calculateArea();
		} else if(fig == 2) {
			Rectangle rect = new Rectangle(line1, line2);
			rect.calculateArea();
		} else if(fig == 3) {
			Triangle tri = new Triangle(line1, line2);
			tri.calculateArea();
		} else {
			Circle cir = new Circle(line1);
			cir.calculateArea();
		}
		
		
		
	}
}
