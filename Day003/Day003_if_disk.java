package examjava03;
// ���� 1�뿡 5000��
// �� ���� 10�� �̻��� ��� ��ü �ݾ��� 10%�� ����
// 100�� �̻��� ��� ��ü �ݾ��� 12% ����
// X���� ������ ����� ��?
import java.util.Scanner;

public class Day003_if_disk {
	public static void main(String[] args) {
		
		int basePrice = 5000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� ���� �����Ͻðڽ��ϱ�? ");
		int orderDisk = sc.nextInt();
		double orderPrice = 0;
		
		if (orderDisk >= 100) {
			orderPrice = orderDisk * basePrice * 0.88;
		} else if (orderDisk >= 10) {
			orderPrice = orderDisk * basePrice * 0.9;
		}
		
		System.out.printf("%d���� ��ũ�� ���� �� �ݾ��� %,d�Դϴ�.", orderDisk, (int)orderPrice);
		
		sc.close();
	}
}
