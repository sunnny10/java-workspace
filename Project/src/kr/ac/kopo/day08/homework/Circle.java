package kr.ac.kopo.day08.homework;

public class Circle extends Figure{
	
	Circle(int line1) {
		super(line1);
	}

	@Override
	void calculateArea() {
		System.out.println("원일 경우 : 원의 면적은 " + line1*line1*Math.PI + "입니다");
	}

}
