package kr.ac.kopo.day13;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	// 파일객체 이용하면 파일탐색기 같은 거 만들 수 있다.
	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		if(dirObj.exists()) {
			
			File[] list = dirObj.listFiles();
			for(File f : list) {
				System.out.println(f.getName());
				System.out.println(f.isDirectory()? "디렉토리" : "파일");
			}


			/*
			String[] list = dirObj.list();	// 저 폴더 안에 들어있는 거 다 보여달라
			for(String data : list) {
				System.out.println(data);
				File fileObj = new File(dirObj.getName() + "/" + data);
				System.out.println(fileObj.isDirectory()? "디렉토리" : "파일");
			}
			*/
			
		}
		
		/*
		// 파일명만 갖는게 아니라 경로도 가질 수 있따 . 근데 파일에 대한 정보인지 디렉토리에 대한 정보인지 모름. 폴더가 존재하지 않으면 만들 수도 있겟다
		File dirObj = new File("iotest/강아지/리트리버");
		System.out.println("존재여부 : " + dirObj.exists());
		System.out.println("디렉토리여부(판단) : " + dirObj.isDirectory());
		System.out.println("파일여부 : " + dirObj.isFile());
		
		//이클립스는 실시간으로 볼 수 있는 애가 아니다.... f5라고 새로고침해야 보인다.
		if(!dirObj.exists()) {
			// 목적이 맨 마지막 폴더를 만드는 것
			dirObj.mkdirs(); 	// 중간에 폴더가 없어도 걔를 만들어라
			//dirObj.mkdir();
		}
		*/
		
		
		/*
								// 상대경로, JAVA 폴더의 경로
		File fileObj = new File("iotest/a.txt");
		String fileName = fileObj.getName();
		String parent = fileObj.getParent();
		
		System.out.println("파일명 : " + fileName);
		System.out.println("파일명 : " + parent);
		
		System.out.println("파일 존재여부 : " + fileObj.exists());
		long fileSize = fileObj.length();
		System.out.println("파일 크기 : " + fileSize + "byte(s)");
		System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
		System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
		
		//밀리세컨드 단위
		long lastTime = fileObj.lastModified();
		//원래는 캘린더 객체쓰고 그래야 되는데 간단하게 쓸 수 있따
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
	
		*/
	}

}
