package examjava02;
// ������� �̴ϼ��� �Է¹޾� ����ϱ�

import java.util.Scanner;

public class Day002_initial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. �̴ϼ��� ���ڿ��� �� ���� �޴� ���
		System.out.println("�̴ϼ��� �Է��ϼ���.");
		String init = sc.nextLine();

		System.out.println("�Է��� �̴ϼ���" + init + "�Դϴ�.");
		System.out.println("����� �Է��� �̴ϼ� : " + init.charAt(0) + "." + init.charAt(1) + "." + init.charAt(2));

		// 2. �̴ϼ� �Է��� �� ���ھ� �޴� ���
		System.out.println("ù ��° �̴ϼ� �Է�: ");
		char init1 = sc.nextLine().charAt(0);
		System.out.println("�� ��° �̴ϼ� �Է�: ");
		char init2 = sc.nextLine().charAt(0);
		System.out.println("�� ��° �̴ϼ� �Է�: ");
		char init3 = sc.nextLine().charAt(0);
		
		System.out.println(init1 + "." + init2 + "." + init3);
		
		// 3. for������ ����ϱ�
		System.out.println("�̴ϼ� �Է�: ");
		String initial = sc.nextLine();
		
		for (int i = 0; i < initial.length(); i++) {
			System.out.println(initial.charAt(i));
		}
		
		sc.close();

	}
}
