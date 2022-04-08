package method;

import java.util.Scanner;
//두 수를 입력받아 큰 수 출력 메서드 만들기
public class Day010_methodBigger {

	public static void printBigger(int n1, int n2) {
		if (n1 >= n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		System.out.print("두 수 중 더 큰 수는 : ");
		printBigger(n1, n2);
		
		sc.close();
		
	}
}
