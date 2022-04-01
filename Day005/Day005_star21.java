package for_star;
//*********	0	9	0
// *******	1	7	1
//  *****	2	5	2
//   ***	3	3	3
//    *		4	1	4
//   ***	3	3	3
//  *****	2	5	2
// *******	1	7	1
//*********	0	9	0
public class Day005_star21 {
	public static void main(String[] args) {
		
		// 1 ~ 5행
		for (int i = 0; i < 5; i++) { //           0/1/2/3/4
			for (int j = 0; j < i; j++) { // 0 ~  x/0/1/2/3  
				System.out.print(" "); // 별 :      0/1/2/3/4개
			}
			for (int j = 0; j < 9-i*2; j++) { //0 ~ 8/6/4/2/0 
				System.out.print("*"); //공백 :      9/7/5/3/1개
			}
			for (int j = 0; j < i; j++) {// 0 ~  x/0/1/2/3
				System.out.print(" "); // 별 :      0/1/2/3/4개
			}
			System.out.println();
		}
		
		// 6 ~ 9행
		for (int i = 0; i < 4; i++) { //            0/1/2/3
			for (int j = 0; j <= 2-i; j++) { //  0 ~ 2/1/0/x
				System.out.print(" "); // 별 :       3/2/1/0개
			}
			for (int j = 0; j <= i*2+2; j++) { // 0~2/4/6/8 
				System.out.print("*"); // 공백 :      3/5/7/9개
			}
			for (int j = 0; j <= 2-i; j++) {// 0 ~   2/1/0/x
				System.out.print(" "); // 별 :       3/2/1/0개
			}
			System.out.println();
		}
	}
}
