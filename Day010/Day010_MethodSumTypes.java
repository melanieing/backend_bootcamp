package method;

import java.util.Scanner;
// 두 수의 합을 반환하는 메서드 만들기
// int 2개, float 2개, 정수와 실수, 실수와 정수
public class Day010_MethodSumTypes {

	public static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}
	
	public static float add(float n1, float n2) {
		float sum = n1 + n2;
		return sum;
	}
	
	public static double add(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static double add(double n1, int n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static double add(double n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("더할 수 두 개를 입력하시오 : ");

		System.out.printf("두 수의 합은 %.2f입니다!", add(sc.nextDouble(), sc.nextDouble()));
		
		sc.close();
	}

}
