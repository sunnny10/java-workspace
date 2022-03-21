package kr.ac.kopo.day08.homework;

public class Rectangle extends Figure{
	
	public Rectangle(int line1, int line2) {
		super(line1, line2);
	}

	@Override
	void calculateArea() {
		System.out.println("직사각형일 경우 : 직사각형의 면적은 " + line1*line2 + "입니다");
	}

}
