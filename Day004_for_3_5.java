package repeat;
// 1 ~ 100������ �� �� 3�� ��� ����, 3�� ����̸鼭 5�� ����� ���� ���� ���
public class Day004_for_3_5 {
	public static void main(String[] args) {

		int i = 0, sum = 0;
		for (i = 1; i <= 100; i++) {
			if (i % 3 != 0 || i % 15 == 0) {
//				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
