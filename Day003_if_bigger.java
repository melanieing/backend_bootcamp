package examjava03;
// �� ���� �Է¹޾� ū ���� ���
import java.util.Scanner;

public class Day003_if_bigger {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϱ� ���� �� ���� �Է��Ͻÿ�: ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.printf("�� �� �� ū ���� %d�Դϴ�.", n1);
		} else if (n2 > n1){
			System.out.printf("�� �� �� ū ���� %d�Դϴ�.", n2);
		} else {
			System.out.printf("%d(��)�� %d(��)�� �����ϴ�.", n1, n2);
		}
		
		sc.close();
	}
}
