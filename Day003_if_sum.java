package examjava03;
// �� ���� �Է¹޾� ���� ¦���̰� 3�� ����̸� ���
import java.util.Scanner;

public class Day003_if_sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		int sum = n1 + n2;
		
		if (sum % 6 == 0) {
			System.out.printf("�Է��Ͻ� %d�� %d�� ���� %d�̸� "
					+ "�̴� ¦���̰� 3�� ����Դϴ�.", n1, n2, sum);
		}
		
		sc.close();
	}
}
