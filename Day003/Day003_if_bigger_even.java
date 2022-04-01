package examjava03;
// 두 수를 입력받아 큰 수가 짝수이면 출력
import java.util.Scanner;

public class Day003_if_bigger_even {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		if (n1 >= n2 && n1 % 2 == 0) {
			System.out.printf("%d는 둘 중 큰 수이자 짝수입니다.", n1);
		} else if (n2 % 2 == 0) {
			System.out.printf("%d는 둘 중 큰 수이자 짝수입니다.", n2);
		}
		
		sc.close();
	}
}
