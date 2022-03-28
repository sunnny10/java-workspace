package kr.ac.kopo.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

/*
 	iotest/IOMain05/java -> IOMain05.java.txt 복사
 */

public class IOMain07 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader("iotest/IOMain05.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("iotest/IOMain05.java.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			while(true) {
				/*
				int c = br.read();
				if(c == -1) break;
				bw.write(c);
				*/
				//readLine()은 문장의 끝을 null로 인식한다.
				String data = br.readLine();
				if(data == null) break;
				//bw.write(data);
				//bw.newLine();
				pw.println(data);	// newLine 포함
				
			}
			bw.flush();
			System.out.println("파일 복사를 완료하였습니다");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);
			FileClose.close(fr);
			FileClose.close(bw);
			FileClose.close(fw);
		}
	}

}
