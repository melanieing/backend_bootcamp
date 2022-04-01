package examjava03;
// 두 수를 입력받아 합이 짝수이고 3의 배수이면 출력
import java.util.Scanner;

public class Day003_if_sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 수를 입력하시오: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		int sum = n1 + n2;
		
		if (sum % 6 == 0) {
			System.out.printf("입력하신 %d와 %d의 합은 %d이며 "
					+ "이는 짝수이고 3의 배수입니다.", n1, n2, sum);
		}
		
		sc.close();
	}
}
