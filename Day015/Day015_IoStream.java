package io;
/*
 * 스트림(Byte) : Byte 형태로 데이터를 운반하는 데 사용되는 연결통로
 * (단방향 통신만 가능, 연속적 통신(큐-FIFO)
 * Source(근원지) -> InputStream -> OutputStream -> Sink(데이터 종착점)
 * 
 * Reader : InputStream : 스트림을 한 줄씩 읽고 내보내서 비움 
 * 	InputStream in = System.in;
 * Writer : OutputStream : 
 * 	OutputStream out = System.out;
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Day015_IoStream {
	public static void main(String[] args) throws IOException {
		
		// InputStream으로 입력받는 경우, 맨 앞 문자 1개만 출력
		// 기본적으로 int 형태로 입력받음
		InputStream in = System.in;
		OutputStream out = System.out;
		
		int data1 = in.read();
		
		out.write(data1);
		out.flush(); // write에 저장한 값을 출력함 + 비워줌
		out.close(); // 스트림 닫기
		
	}

}
