package io;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.BufferedWriter;

//import java.io.InputStream;
//import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 버퍼(Buffer) : 이삿짐센터 트럭
 * - InputStream과 InputStreamReader를 합친 느낌!
 * - 가변적인 값을 받아올 수 있음
 * - 동시에 버퍼는 입력받은 값은 버퍼에 저장해두었다가 버퍼가 가득차거나 개행문자가 나타나면 버퍼내용을 한 번에 전송함
 * - 그래서 Scanner보다 훨씬 속도가 빠름!
 * - BR을 통해 한 번에 입력받아 -> BW의 writer()을 통해 한 번에 출력 -> flush()를 사용해 버퍼 비우기
 * - 입력받는 기본타입 : String
 */

public class Day015_Buffer {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		InputStream in = System.in;
//		InputStreamReader reader = new InputStreamReader(in);
		// 위의 두 줄을 한 번에 아래처럼 쓰기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		OutputStream out = System.out;
//		OutputStreamWriter writer = new OutputStreamWriter(out);
		// 위의 두 줄을 한 번에 아래처럼 쓰기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine(); // br의 기본형 : String // 12
		int i = Integer.parseInt(str) + 1;
		
		br.close(); 
		
		bw.write("입력받은 값 : " + str); // 12
		bw.newLine();
		bw.write("입력받은 값 + 1 : " + i + 1 + "\n"); // 131 ??
		bw.write("입력받은 값 + 1 : " + Integer.parseInt(str) + 1 + "\n"); // 121
		bw.write("입력받은 값 + 1 : " + (Integer.parseInt(str) + 1) + "\n"); // 13
		
		bw.flush();
		bw.close();
	}
}
