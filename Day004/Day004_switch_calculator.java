package switch_examples;
// 정수 두 개를 입력받아 사칙연산을 하는 계산기
import java.util.Scanner;

public class Day004_switch_calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 입력 : ");
		char cal = sc.nextLine().charAt(0);
		
		System.out.print("첫 번째 수 입력 : ");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 수 입력 : ");
		int n2 = Integer.parseInt(sc.nextLine());
		// int n2 = sc.nextInt();
		sc.close();
		
		int result = 0;
		double divResult = 0.0;
		
		switch (cal) {
		case '+': 
			result = n1 + n2;
			System.out.println("결과 : " + n1 + cal + n2 + '=' + result);
			break;
		case '-':
			result = n1 - n2;
			System.out.println("결과 : " + n1 + cal + n2 + '=' + result);
			break;
		case '*':
			result = n1 * n2;
			System.out.println("결과 : " + n1 + cal + n2 + '=' + result);
			break;
		case '/':
			divResult = n1 / (double)n2;
			System.out.println("결과 : " + n1 + cal + n2 + '=' + divResult);
			break;
		}
	}
}
