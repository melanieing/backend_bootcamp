package examjava03;
// 수를 입력받아 짝수, 홀수를 구분하여 출력
import java.util.Scanner;

public class Day003_if_odd_even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d는 짝수입니다.", num);
		} else {
			System.out.printf("%d는 홀수입니다.", num);
		}
		
		sc.close();
	}

}
