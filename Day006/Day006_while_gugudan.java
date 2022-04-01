package while_examples;
// 구구단 출력해보기(가로, 세로)
public class Day006_while_gugudan {
	public static void main(String[] args) {
		
		// 가로 출력 (while문 사용)
		int hori_gop = 1; // 2 ~ 9
		int hori_dan = 2; // 1 ~ 9		
		
		while (hori_gop >= 1 && hori_gop <= 9) {
			while (hori_dan <= 9) {
				System.out.printf("%d * %d = %2d | ", hori_dan, hori_gop, hori_dan*hori_gop);
				hori_dan++;
			}
			hori_dan = 2;
			hori_gop++;
			System.out.println();
		}
		
		// 가로 출력 (for문 사용)
//		for (int gop = 1; gop <= 9; gop++) {
//			for (int dan = 2; dan <= 9; dan++) {
//				System.out.printf("%d * %d = %2d | ", dan, gop, dan*gop);
//			}
//			System.out.println();
//		}
		
		// 세로 출력 (while문 사용)
		int verti_dan = 2; // 2 ~ 9
		int verti_gop = 1; // 1 ~ 9		
		
		while (verti_dan >= 2 && verti_dan <= 9) {
			while (verti_gop <= 9) {
				System.out.printf("%d * %d = %2d\n", verti_dan, verti_gop, verti_dan*verti_gop);
				verti_gop++;
			}
			verti_gop = 1;
			verti_dan++;
			System.out.println("-----------");
		}
		
		// 비교 : 세로 출력 (for문 사용)
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.println(dan + "단>>");
//			for (int gop = 1; gop <= 9; gop++) {
//				System.out.printf("%d * %d = %2d\n", dan, gop, dan*gop);
//			}
//			System.out.println();
//		}

	}
}
