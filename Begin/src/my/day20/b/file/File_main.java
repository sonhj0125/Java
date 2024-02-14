package my.day20.b.file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_main {

	/*
	   >>> File 클래스 <<<
	   자바에서 File 클래스의 객체라 함은 파일 및 폴더(디렉토리)를 다 포함한다.
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("탐색기에 존재하는 파일명을 입력하세요 : ");
		
		String file_name = sc.nextLine();
		// C:/NCS/iotestdata/puppy.jpg
		
		File file_1 = new File(file_name);
		
		System.out.println("파일명만 : " + file_1.getName());
		// file_1.getName(); 은 파일명만 알려주는 것
		// 파일명만 : puppy.jpg
		
		
		long file_size = file_1.length();
		System.out.println("파일크기 : " + file_size + "byte");
		// 파일크기 : 61573byte
		
		
		String absolutePath = file_1.getAbsolutePath();
		System.out.println("파일이 저장된 경로명을 포함한 파일명1 : " + absolutePath);
		// 파일이 저장된 경로명을 포함한 파일명1 : C:\NCS\iotestdata\puppy.jpg
		
		
		// 또는
		String path = file_1.getPath();
		System.out.println("파일이 저장된 경로명을 포함한 파일명2 : " + path);
		// 파일이 저장된 경로명을 포함한 파일명2 : C:\NCS\iotestdata\puppy.jpg
		
		
		
		// === C:\NCS\iotestdata\puppy.jpg 파일이 저장된 경로명만 출력하세요.!! === //		
		
		String path_name = path.substring( 0, path.indexOf(file_1.getName()) );								
		System.out.println("경로명만 : " + path_name);
		// 경로명만 : C:\NCS\iotestdata\
		
		
		System.out.println("\n========================================\n");
		
		System.out.println(">>> 디렉토리(폴더) 생성하기 <<<");
		
		File dir = new File("C:/NCS/iotestdata/MyDir");
		
		if( !dir.exists() ) {
			// 해당 디렉토리(폴더)가 없으면
			boolean bool = dir.mkdir();	// 해당 디렉토리(폴더 MyDir) 생성
			
			String result = bool?"디렉토리(폴더) 생성 성공!!":"디렉토리(폴더) 생성 실패ㅠㅠ";
			
			System.out.println("C:/NCS/iotestdata/MyDir " + result);
			// C:/NCS/iotestdata/MyDir 디렉토리(폴더) 생성 성공!!
		}
		
		// >> File dir 이 디렉토리(폴더)인지 알아오기 <<
		if(dir.isDirectory()) {
			System.out.println("C:/NCS/iotestdata/MyDir 은 디렉토리(폴더) 입니다.");
			// C:/NCS/iotestdata/MyDir 은 디렉토리(폴더) 입니다.
		}
			
		
		
		
		System.out.println("\n========================================\n");
		
		System.out.println(">>> 파일 생성하기 <<<");
		
		File file_2 = new File("C:/NCS/iotestdata/MyDir/테스트1.txt");
		
		if( !file_2.exists() ) {
			// 해당 파일이 존재하지 않으면 
			
			try {
				boolean bool = file_2.createNewFile();		// 해당 파일 생성
				
				if(bool) {
					// 해당 파일이 정상적으로 생성되었다면
					System.out.println("테스트1.txt 의 절대경로 : " + file_2.getAbsolutePath());
					// 테스트1.txt 의 절대경로 : 
				}
				
			} catch (IOException e) {				
				e.printStackTrace();
				
			} // end of try_catch	
			
		}
		
		// >> File file_2 이 파일인지 알아오기 << //
		
		if( file_2.isFile() ) {
			System.out.println("C:/NCS/iotestdata/MyDir/테스트1.txt 은 파일입니다.");
		}
			
		// 테스트1.txt 의 절대경로 : C:\NCS\iotestdata\MyDir\테스트1.txt
		// C:/NCS/iotestdata/MyDir/테스트1.txt 은 파일입니다.
		sc.close();
		
	} // end of main

}
