package examjava03;
// �� ���� �Է¹޾� ū ������� ���
import java.util.Scanner;

public class Day003_if_3_order {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է��Ͻÿ�: ");
		// ���1 (swap)
		int first = sc.nextInt(), second = sc.nextInt(), third = sc.nextInt();
		int temp;
		
		if (second > first && second > third) {
			temp = first;
			first = second;
			second = temp;
		} else if (third > first && third > second) {
			temp = first;
			first = third;
			third = temp;
		} 
		if (third > second) {
			temp = second;
			second = third;
			third = temp;
		}
		
		System.out.printf("ū ������� ���� : %d, %d, %d", first, second, third);

		// ���2 (if - else if - else��)
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		if (a >= b) {
			if (a >= c) {
				System.out.printf("ū ������� ���� : %d, %d, %d", a,b,c);
			} else {
				System.out.printf("ū ������� ���� : %d, %d, %d", a,c,b);
			}
		} else if (b >= c) {
			if (a >= c) {
				System.out.printf("ū ������� ���� : %d, %d, %d", b,a,c);
			} else {
				System.out.printf("ū ������� ���� : %d, %d, %d", b,c,a);
			}
		} else {
			if (a >= b) {
				System.out.printf("ū ������� ���� : %d, %d, %d", c,a,b);
			} else {
				System.out.printf("ū ������� ���� : %d, %d, %d", c,b,a);
			}
		}
		
		sc.close();
	}
}
