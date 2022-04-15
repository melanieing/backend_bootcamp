package io;
// InputStreamReader로 입력받는 경우, 배열을 어떻게 주느냐에 따라 2개 이상의 값 받기 가능
// 배열 크기에 맞는 고정적인 길이의 값만 받아옴 (비효율적)
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Day015_IoStreamReader {

	public static void main(String[] args) throws IOException {
		
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		
		OutputStream out = System.out;
		OutputStreamWriter writer = new OutputStreamWriter(out);
		
		char data1[] = new char[2]; // 기본적으로 char형 받음
		System.out.print("입력하세요 : ");
		reader.read(data1);
		
		int data2 = data1[0] - '0'; // char로 받은 값을 int로 변환하고 싶을 때 사용
		
		writer.write("입력받은 값 : ");
		writer.write(data1);
		writer.write("\n");
		writer.write("data2 : " + data2);
		
		writer.flush();
		writer.close();
		
		
	}

}
