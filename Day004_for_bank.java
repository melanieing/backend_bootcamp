package forHW;
// ù ���� 10���� �����ϰ�, 
// ���������� ������ 2�踦 ����
// �� ��(30��) ���� ������ �ݾ���?
public class Day004_for_bank {
	public static void main(String[] args) {

		int day = 30;
		long bank = 0;
		long money = 10;
		
		for (int d = 1; d <= day; d++) {
			bank += money;
			money *= 2;
//			System.out.printf("��¥ : %d��, �Աݾ� : %,d��, �ܰ� : %,d��\n", day, deposit, money);
		}
		System.out.printf("�� ������ �ݾ� : %,d��", bank);
	}
}
