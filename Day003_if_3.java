package examjava03;
// �Է��� �����Ͱ� 3�� ����� ��� ����Ͻÿ�

import java.util.Scanner;

public class Day003_if_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����͸� �Է��Ͻÿ�: ");
		int data = sc.nextInt();
		
		if (data % 3 == 0) {
			System.out.printf("%d�� 3�� ����Դϴ�.", data);
		}
		
		sc.close();
	}

}
