package basic_examples;
// 두 수 입력받아 두 수 사이에 있는 수들의 합 구하기 
import java.util.Scanner;

public class Day004_for_2sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		int i = 0, sum = 0;
		
		// n1과 n2 '사이'라고 했으니까 시작은 '+1' 해주기
		for (i = n1+1; i < n2; i++) {
			sum += i;
		}
		System.out.println("두 수 사이의 합 : " + sum);
	}
}
