package for_star;
//11111
//22222
//33333
//44444
//55555
public class Day005_star04 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // 1 ~ 5 : 5행 (시작값을 1로 해야 하는 이유O)
			for (int j = 0; j < 5; j++) { // 0 ~ 4 : 5열
				System.out.print(i); // i를 5번 출력 -> ex) 11111
			}
			System.out.println();
		}

	}
}
