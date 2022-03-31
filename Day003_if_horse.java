package examjava03;

import java.util.Scanner;

// ���������� ���� �¿��ִµ� ó�� 30���� �⺻����� 1�δ� 3000���̴�.
// ���Ŀ��� 10�д� 500������ �߰� ����� �޴´�.
// ���� ź �ð��� �Է¹޾Ƽ� ��ü �ݾ��� ����ϴ� ���α׷��� �ۼ��ض�.

public class Day003_if_horse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ���1 (soft coding)
		int basePrice = 3000;
		int baseTime = 30;
		
		int perUseTime = 10;
		int perUsePrice = 500;
		
		int useTime = 0;
		int usePrice = 0;
		
		System.out.println("�� ź �ð�: ");
		useTime = sc.nextInt();
		
		if (useTime >= 0 && useTime <= baseTime) {
			useTime = baseTime;
		} else if (useTime > baseTime) {
			int addTime = useTime - baseTime;
			int addPrice = addTime / perUseTime * perUsePrice;
			usePrice = basePrice + addPrice;
		}
		
		System.out.println("�̿� �ݾ�: " + usePrice + "��");
		
		// ���2 (hard coding)
		int fee = 0;
		
		System.out.print("�ο� ���� ���� ź �ð�(��)�� �Է��Ͻÿ�: ");
		int many = sc.nextInt(), time = sc.nextInt();
		
		if (time >= 0 && time <= 30) {
			fee = 3000 * many;
		} else {
			fee = (3000 + (time-30)/10 * 500) * many;
		}
		
		System.out.printf("��ü �ݾ��� %,d�� �Դϴ�.", fee);
		
		sc.close();
	}
}
