package kr.ac.kopo.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain05 {
	
	public static void write() {
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("iotest/data.dat");
			dos = new DataOutputStream(fos);
			char c = 'A';
			int num = 99;
			double f = 12.34;
			
			//1바이트가 들어있음?????
			fos.write(c);	// 1바이트 형태로 a가 들감
			dos.writeChar(c);	// 2바이트 형태로 a가 들감
			dos.writeInt(num);
			dos.writeDouble(f);
			// 그 데이터타입이 가지고 있는 메모리의 크기만큼이 할당된다.
			
			//fos.flush();
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fos);
		}
		System.out.println("파일저장 완료...");
	}
	
	public static void read() {
		FileInputStream fis = null;
		DataInputStream dis = null;
			
		try {
			fis = new FileInputStream("iotest/data.dat");
			dis = new DataInputStream(fis);
			
			int i = dis.read();
			char c = dis.readChar();
			int i2 = dis.readInt();
			double d = dis.readDouble();
			
			System.out.println("첫번째 문자 : " + (char)i);
			System.out.println("두번째 문자 : " + c);
			System.out.println("정수 : " + i2);
			System.out.println("실수 : " + d);
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			FileClose.close(dis, fis);
		}
	}

	public static void main(String[] args) {
		
		read();
//		write();
	}

}
