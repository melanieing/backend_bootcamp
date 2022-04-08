package method;

import java.util.Scanner;

// 두 수를 입력받아 두 수 사이의 합을 출력하는 메서드 만들기
public class Day010_MethodAllSum {
	
	public static void printSum(int n1, int n2) {
		int sum = 0;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		System.out.print("두 수의 합은 : ");
		printSum(n1, n2);
		
		sc.close();
		
	}
}
