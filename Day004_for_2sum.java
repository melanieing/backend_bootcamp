package repeat;
// �� �� �Է¹޾� �� �� ���̿� �ִ� ������ �� ���ϱ� 
import java.util.Scanner;

public class Day004_for_2sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		int i = 0, sum = 0;
		
		// n1�� n2 '����'��� �����ϱ� ������ '+1' ���ֱ�
		for (i = n1+1; i < n2; i++) {
			sum += i;
		}
		System.out.println("�� �� ������ �� : " + sum);
	}
}
