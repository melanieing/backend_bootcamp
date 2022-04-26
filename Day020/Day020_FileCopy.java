package fileCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Day020_FileCopy {
	public static void main(String[] args) {
		
		// 복사할 파일과 목적지 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("복사할 파일 경로 및 파일명을 입력하세요 : ");
		File originFile = new File(sc.next());
		System.out.print("복사될 목적지 경로 및 파일명을 입력하세요 : ");
		File destinFile = new File(sc.next());
		
		// FileInputStream 스트림 준비
		FileInputStream input = null;
		try {
			input = new FileInputStream(originFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		// FileOutputStream 준비
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(destinFile);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		// 버퍼 크기 1024로 지정
		byte[] buffer = new byte[1];
		// 원래 파일에서 데이터 읽어서 새 파일에 붙여넣기
		int readData = 0;
		try {
			while ((readData = input.read(buffer)) != -1) {
				output.write(buffer, 0, readData);	
				System.out.print('!');

			}
			System.out.println("\n파일 복사 성공!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			input.close();
			output.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
