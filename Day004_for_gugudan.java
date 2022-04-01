package forHW;
// 구구단 출력하기 
public class Day004_for_gugudan {
	public static void main(String[] args) {
		
		// 가로로 출력하기
		for (int gop = 1; gop <= 9; gop++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d * %d = %2d | ", dan, gop, dan*gop);
			}
			System.out.println();
		}
		
		// 세로로 출력하기
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단>>");
			for (int gop = 1; gop <= 9; gop++) {
				System.out.printf("%d * %d = %2d\n", dan, gop, dan*gop);
			}
			System.out.println();
		}
	}
}
