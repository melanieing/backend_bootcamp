package examjava01;
/*
�ڽ��� �̸�, ����, Ű, ������, �ְ������� �Է¹޾� ���
(���̴� �Է��� ���� -1�� �Ѵ�.)
 */
import java.util.Scanner;

public class Day001_personal_info {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();

		System.out.print("���� �Է� : ");
		int age = sc.nextInt();

		System.out.print("Ű �Է�(cm) : ");
		double height = sc.nextDouble();

		System.out.print("������ �Է�(kg) : ");
		double weight = sc.nextDouble();
		
		System.out.print("�ְ����� �Է� : ");
		double grade = sc.nextDouble();
		
		sc.close();
		
		System.out.println("------��������------");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + (age - 1) + "��");
		System.out.println("Ű : " + height + "cm");
		System.out.println("������ : " + weight + "kg");
		System.out.println("�ְ����� : " + grade + "��");
	}
}