package fileCopy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Day020_FileCopyCharBased {
	public static void main(String[] args) {
		
		// 복사할 파일과 목적지 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("복사할 파일 경로 및 파일명을 입력하세요 : ");
		File originFile = new File(sc.next());
		System.out.print("복사될 목적지 경로 및 파일명을 입력하세요 : ");
		File destinFile = new File(sc.next());
		
		// Stream 변수 선언 및 초기화
		FileInputStream fileIn = null;
		FileOutputStream fileOut = null;
        InputStreamReader reader = null;
        OutputStreamWriter writer = null;
		BufferedReader bufferIn = null;
		BufferedWriter bufferOut = null;
		
		try {
			fileIn = new FileInputStream(originFile);
			reader = new InputStreamReader(fileIn,"UTF-8");
			bufferIn = new BufferedReader(reader);
			fileOut = new FileOutputStream(destinFile);
			writer = new OutputStreamWriter(fileOut,"UTF-8");
			bufferOut = new BufferedWriter(writer);
			
			int readData = 0;
			while (readData != -1) {
				readData = bufferIn.read();
				bufferOut.write(readData);
				System.out.print("!");
			}
			System.out.println("\n파일 복사 성공! >_<");
		} catch (IOException e) {
			System.out.println("파일 복사 오류! ㅠ_ㅠ");
			e.printStackTrace();
		} finally {
			if (bufferIn != null) try { bufferIn.close(); } catch (IOException e) {}
			if (fileIn != null) try { fileIn.close(); } catch (IOException e) {}
			if (bufferOut != null) try { bufferOut.close(); } catch (IOException e) {}
			if (fileOut != null) try { fileOut.close(); } catch (IOException e) {}
			sc.close();
		}
		
	}
}