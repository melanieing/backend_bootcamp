package forHW;
// �� 100��(�� ���� 80kg)�� ����Ǿ� �ִ� â�� �ϼ� 1���� �㰡 ����
// �� �� ������ �Ϸ翡 20g�� ���� �԰� 10�ϸ��� ���� ���� 2�� ������
// ��ĥ ���� â���� ���� ��� ���� ���̰� �ɱ�?
// ��� �� �� �����ΰ�?
public class Day004_for_mouse {
	public static void main(String[] args) {

		int day;
		int mouse = 2;
		int rice = 8000000;
		
		for (day = 0; rice > 0; day++) {
			rice -= mouse * 20;
			if (day % 10 == 0 && day != 0) {
				mouse *= 2;
			}
		}
		System.out.printf("���� �� �������� �� : %d��, �� ���� �� : %d����", day, mouse);
	}
}
