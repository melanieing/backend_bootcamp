package method;

import java.util.Scanner;
// 수를 입력받아 1부터 입력받은 수까지 홀수의 합을 반환하는 메서드
public class Day010_MethodOddSum {

	public static int OddSum(int n) {
		int oddSum = 0;
		
		for (int i = 1; i <= n; i+=2) {
			oddSum += i;
		}
		
		return oddSum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int n = sc.nextInt();
		
		System.out.println("1부터 입력받은 수까지의 홀수의 합은 : " + OddSum(n));
		
		sc.close();
	}

}
