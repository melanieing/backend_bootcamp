package while_examples;
// 하나의 수를 입력받아 n!을 구하라. (팩토리얼)
import java.util.Scanner;

public class Day006_while_factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// while문 사용하기
		System.out.print("하나의 수를 입력하십시오 : ");
		int n = sc.nextInt();
		int facto = 1, count = 1;
		
		while (n != 1) {
			facto *= n;
			n--;	
			++count;
		}
		
		System.out.printf("출력 : %d!는 %d이다.", count, facto);
		sc.close();
	}
}
