package examjava04;
// ���� �� ���� �Է¹޾� ��Ģ������ �ϴ� ����
import java.util.Scanner;

public class Day004_switch_calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		char cal = sc.nextLine().charAt(0);
		
		System.out.print("ù ��° �� �Է� : ");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�� ��° �� �Է� : ");
		int n2 = Integer.parseInt(sc.nextLine());
		// int n2 = sc.nextInt();
		sc.close();
		
		int result = 0;
		double divResult = 0.0;
		
		switch (cal) {
		case '+': 
			result = n1 + n2;
			System.out.println("��� : " + n1 + cal + n2 + '=' + result);
			break;
		case '-':
			result = n1 - n2;
			System.out.println("��� : " + n1 + cal + n2 + '=' + result);
			break;
		case '*':
			result = n1 * n2;
			System.out.println("��� : " + n1 + cal + n2 + '=' + result);
			break;
		case '/':
			divResult = n1 / (double)n2;
			System.out.println("��� : " + n1 + cal + n2 + '=' + divResult);
			break;
		}
	}
}
