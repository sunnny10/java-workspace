package kr.ac.kopo.day08.homework;

public class Square extends Figure {
	
	Square(int line1){
		super(line1);
	}
	
	@Override
	void calculateArea() {
			System.out.println("정사각형일 경우 : 정사각형의 면적은 " + line1*line1 + "입니다");
	}
		
}
