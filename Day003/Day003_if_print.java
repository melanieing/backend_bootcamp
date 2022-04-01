package examjava03;
// 수를 입력받아 출력 (단, 3의 배수는 제외하고 3의 배수이면서 5의 배수인 수는 출력)
import java.util.Scanner;

public class Day003_if_print {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 수를 입력하시오: ");
		int n = sc.nextInt();
		
		// 방법1
		if (n % 3 != 0) {
			System.out.printf("%d입니다.", n);
		} else if (n % 5 == 0) {
			System.out.printf("%d입니다.", n);
		}
		
		// 방법2
		if (n %3 != 0 || n % 5 == 0) {
			System.out.println(n);
		}
		
		sc.close();
	}

}
