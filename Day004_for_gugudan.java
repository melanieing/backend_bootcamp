package forHW;
// ������ ���
public class Day004_for_gugudan {
	public static void main(String[] args) {
		// ���� ������
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %2d | ", j, i, i*j);
			}
			System.out.println();
		}
		
		// ���� (���� ������)
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "��>>");
			for (int gop = 1; gop <= 9; gop++) {
				System.out.printf("%2d * %2d = %2d\n", dan, gop, dan*gop);
			}
			System.out.println();
		}
		
	}
}
