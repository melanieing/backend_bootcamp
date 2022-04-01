package for_star;
//    *
//   **
//  ***
// ****
//*****
public class Day005_star11 {
	public static void main(String[] args) {
		
		// for문 (for문-for문)
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 0; j < 4-i; j++) { // 0 ~ 3/2/1/0/x
				System.out.print(" "); 		//공백 : 4/3/2/1/0개
			}
			 for (int j = 0; j <= i; j++) {  // 0 ~ 0/1/2/3/4
				 System.out.print("*"); 	 // 별 : 1/2/3/4/5개
			 }
			 System.out.println();
		}
		
		
		// for문 (for문(if-else문))
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 4; j >= 0; j--) { // 4 ~ 0 : 5열
				if (i < j) { // (고정)0/1/2/3/4 < 4/3/2/1/0
					System.out.print(" "); // 공백: 4/3/2/1/0개
				} else {
					System.out.print("*"); //  별: 1/2/3/4/5개
				}
			}
			System.out.println();
		}	
	}
}
