package kr.ac.kopo.day09.abs03;

public abstract class Printer {
	
	private String model;
	
	public Printer() {
		
	}
	
	public Printer(String model) {
		this.model = model;
	}

	// 강제성
	public abstract void print();
	
//	public void print() {
//		System.out.println("프린트중...");
//	}
}
