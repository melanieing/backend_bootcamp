package examjava03;
// ���� �Է¹޾� ¦��, Ȧ���� �����Ͽ� ���
import java.util.Scanner;

public class Day003_if_odd_even {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("%d�� ¦���Դϴ�.", num);
		} else {
			System.out.printf("%d�� Ȧ���Դϴ�.", num);
		}
		
		sc.close();
	}

}
