package kr.ac.kopo.day08.homework;

public class Triangle extends Figure {
	
	Triangle(int line1, int line2){
		super(line1, line2);
	}

	@Override
	void calculateArea() {
		System.out.println("삼각형일 경우 : 삼각형의 면적은 " + (line1*line2)/2 + "입니다");
	}

}
