package examjava03;
// ��� ���ö� �ֹ��ϴµ� 10�������� ���� 2500��,
// 10���� �ʰ��ϴ� �翡 ���ؼ��� ���� 2400��
// ��� ���ö� ������ �Է¹޾Ƽ� �ݾ��� ����ϴ� ���α׷�
import java.util.Scanner;

public class Day003_if_delivery {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int baseBox = 10;
		int basePrice = 2500;
		
		int addPrice = 2400;
		
		int orderBox = 0;
		int orderPrice = 0;
		
		System.out.print("��� ���ö��� ������ �Է��Ͻÿ�: ");
		orderBox = sc.nextInt();
		
		if (orderBox <= baseBox) {
			orderPrice = orderBox * basePrice;
		} else {
			orderPrice = baseBox * basePrice + (orderBox-10) * addPrice;
		}
		
		System.out.printf("��� ���ö� %d���� �ֹ� �ݾ��� %,d�Դϴ�.", orderBox, orderPrice);
				
		sc.close();

	}
}
