package examjava03;
// 두 수를 입력받아 큰 수를 출력
import java.util.Scanner;

public class Day003_if_bigger {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비교하기 위한 두 수를 입력하시오: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.printf("둘 중 더 큰 수는 %d입니다.", n1);
		} else if (n2 > n1){
			System.out.printf("둘 중 더 큰 수는 %d입니다.", n2);
		} else {
			System.out.printf("%d(와)과 %d(은)는 같습니다.", n1, n2);
		}
		
		sc.close();
	}
}
