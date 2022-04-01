package for_star;
//*****
// ****
//  ***
//   **
//    *
public class Day005_star10 {
	public static void main(String[] args) {
		
		// for문 (for문 - for문)
		for (int i = 0; i < 5; i++) { 		// 0 ~ 4 : 5행
			for (int j = 0; j < i; j++)     // 0 ~ x/0/1/2/3 : 5열
				System.out.printf(" ");     //공백 : 0/1/2/3/4개
			for (int j = 0; j < 5 - i; j++) // 0 ~ 4/3/2/1/0 : 5열
				System.out.printf("*"); 	// 별 : 5/4/3/2/1개
			System.out.println();
		}
		
		// for문 (for문 (if-else문))
		for (int i = 0; i < 5; i++) { 		// 0 ~ 4 : 5행
			for (int j = 0; j < 5; j++) {   // 0 ~ 4 : 5열
				if (j < i)					// 0/1/2/3/4 < (고정)0/1/2/3/4
					System.out.printf(" "); // -> 공백: 0/1/2/3/4개
				else
					System.out.printf("*"); // ->  별: 5/4/3/2/1개
			}
			System.out.println("");
		}

	}
}
