package examjava03;
// ���� �Է¹޾� ��� (��, 3�� ����� �����ϰ� 3�� ����̸鼭 5�� ����� ���� ���)
import java.util.Scanner;

public class Day003_if_print {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ���� �Է��Ͻÿ�: ");
		int n = sc.nextInt();
		
		// ���1
		if (n % 3 != 0) {
			System.out.printf("%d�Դϴ�.", n);
		} else if (n % 5 == 0) {
			System.out.printf("%d�Դϴ�.", n);
		}
		
		// ���2
		if (n %3 != 0 || n % 5 == 0) {
			System.out.println(n);
		}
		
		sc.close();
	}

}
