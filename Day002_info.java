package examjava02;
// ������� �̸��� ���̸� ���� �Է¹ޱ�
// �� �������� ����ϱ�
import java.util.Scanner;

public class Day002_info {
	public static void main(String[] args) {
		
//		String name = "";
//		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �̸��� �����Դϱ�? ");
		String name = sc.nextLine();

		System.out.print(name + "���� ���̴� �� ���Դϱ�? ");
		int age = sc.nextInt();
		
		System.out.printf("%s���� ���̴� %d���Դϴ�.^^", name, age);
		
		
//		System.out.println(name + "���� ���̴� " + age + "���Դϴ�.");
//		
//		System.out.println("===================================");
//	
//		System.out.printf("%s���� ���̴� �� ���Դϱ�?", name);
//		System.out.println();
//		System.out.printf("%s���� ���̴� %d���Դϴ�.", name, age);
		
		
		sc.close();
		
	}
}
