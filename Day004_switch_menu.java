package examjava04;
// �޴��� ����� ���� ���α׷� ¥����
// �� ���� �ϳ��� �޴��� ���� ����, �ϳ��� �޴� ���� �� ���α׷� ���� (while ��� x)
import java.util.Scanner;

public class Day004_switch_menu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ���� ����� �ʱ�ȭ 
		String name = "";
		double kor = 0.0;
		double eng = 0.0;
		double mat = 0.0;
		             
		double sum = 0.0;
		double avg = 0.0;
		
		while (true) {
			System.out.println("1. �л� �̸� ���");
			System.out.println("2. ����, ����, ���� ���� �Է�");
			System.out.println("3. �л� �̸� ���");
			System.out.println("4. ���� ���");
			System.out.println("5. ��� ���");
			System.out.println("6. ����");
			System.out.println("---------------------------");
			System.out.print("���� �޴� �� �ش��ϴ� ��ȣ�� �Է��Ͻÿ�: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.print("�̸��� �Է��ϼ��� : ");
				name = sc.next();
				System.out.println("����� �Է��� �̸� : " + name);
				break;
			case 2:
				System.out.print("����, ����, ���� ������ ���ʴ�� �Է��ϼ��� : ");
				kor = sc.nextDouble();
				eng = sc.nextDouble();
				mat = sc.nextDouble();
				System.out.println("����� �Է��� ���� ���� : " + kor);
				System.out.println("����� �Է��� ���� ���� : " + eng);
				System.out.println("����� �Է��� ���� ���� : " + mat);
				break;
			case 3:
				System.out.println("��ϵ� �л� �̸� : " + name);
				break;
			case 4:
				sum = kor + eng + mat;
				System.out.println("�� ���� ������ ���� : " + sum);
				break;
			case 5:
				avg = sum / 3.0;
				System.out.println("�� ���� ������ ��� : " + String.format("%.2f", avg));
				break;
			case 6:
				System.out.println("���α׷��� �����մϴ�!");
				System.exit(0); // ������ �ڹ� ���α׷� ���� �޼ҵ�
			}
			sc.close();
		}
	}
}
