package method;

import java.util.Scanner;

// 입력받은 수가 홀수인지 짝수인지 반환하는 메서드
public class Day010_MethodOddEven {
	
	public static String OddOrEven(int n) {
		String result = "";
		if (n % 2 == 0) {
			result = "짝수";
		} else {
			result = "홀수";
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("홀수인지 짝수인지 판별할 수를 입력하시오 : ");
		int n = sc.nextInt();
		System.out.println(n + "은 " + OddOrEven(n)  + "입니다!");
		
		sc.close();
	}
}
