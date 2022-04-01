package for_star;
//*         *	1	9	1
//**       **	2	7	2
//***     ***	3	5	3
//****   ****	4	3	4
//***** *****	5	1	5
//****   ****	4	3	4
//***     ***	3	5	3
//**       **	2	7	2
//*         *	1	9	1
public class Day005_star20 {
	public static void main(String[] args) {
		
		// 1 ~ 5행
		for (int i = 0; i < 5; i++) { //           0/1/2/3/4
			for (int j = 0; j <= i; j++) { //0 ~ 0/1/2/3/4  
				System.out.print("*"); // 별 :      1/2/3/4/5개
			}
			for (int j = 0; j < 9-i*2; j++) { //0 ~ 8/6/4/2/0 
				System.out.print(" "); //공백 :      9/7/5/3/1개
			}
			for (int j = 0; j <= i; j++) {// 0 ~  0/1/2/3/4 
				System.out.print("*"); // 별 :      1/2/3/4/5개
			}
			System.out.println();
		}
		
		// 6 ~ 9행
		for (int i = 0; i < 4; i++) { //            0/1/2/3
			for (int j = 0; j < 4-i; j++) { //  0 ~ 3/2/1/0
				System.out.print("*"); // 별 :       4/3/2/1개
			}
			for (int j = 0; j <= i*2+2; j++) { // 0 ~ 2/4/6/8 
				System.out.print(" "); // 공백 :      3/5/7/9개
			}
			for (int j = 0; j < 4-i; j++) {// 0 ~  0/1/2/3 
				System.out.print("*"); // 별 :       4/3/2/1개
			}
			System.out.println();
		}
	}
}
