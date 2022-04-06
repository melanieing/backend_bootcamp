package array;

import java.util.Scanner;

//무한배열(정수) 만들기
// 정수를 저장하는 배열을 무한대로 늘어나도록 작성
// 내가 혼자 삽질한 코드
public class Day009_arrayInfiniteIntToString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arrayLength = 3;
		String nums = "";
		int count = 0;
		int i = 0;
		
		for (; i < arrayLength; i++) {
			int[] array = new int[arrayLength];
			System.out.print("입력(현재길이:" + arrayLength + ") : ");
			array[i] = sc.nextInt();
			nums += Integer.toString(array[i]) + ",";
			System.out.println(nums);
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
