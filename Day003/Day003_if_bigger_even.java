package examjava03;
// �� ���� �Է¹޾� ū ���� ¦���̸� ���
import java.util.Scanner;

public class Day003_if_bigger_even {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		if (n1 >= n2 && n1 % 2 == 0) {
			System.out.printf("%d�� �� �� ū ������ ¦���Դϴ�.", n1);
		} else if (n2 % 2 == 0) {
			System.out.printf("%d�� �� �� ū ������ ¦���Դϴ�.", n2);
		}
		
		sc.close();
	}
}
