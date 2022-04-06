package array;
// 무한배열(문자열) 만들기
// 문자열을 저장하는 배열을 무한대로 늘어나도록 작성
import java.util.Scanner;

public class Day009_arrayInfiniteString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 일단 현재길이 3으로 만들면서 시작
		int arrayLength = 3;
		String strings = "";
		int count = 0;
		int i = 0;
		
		for (; i < arrayLength; i++) {
			String[] array = new String[arrayLength];
			System.out.print("입력(현재길이:" + arrayLength + ") : ");
			array[i] = sc.nextLine();
			strings += array[i] + ",";
			System.out.println(strings);
			count++;
			if (count == arrayLength) {
				arrayLength *= 2;
				System.out.println("증가됨(" + arrayLength + ")");
				continue;
			}
		}
		
		sc.close();
	}
}
