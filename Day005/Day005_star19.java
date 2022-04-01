package for_star;
//***** *****
//****   ****
//***     ***
//**       **
//*         *
//**       **
//***     ***
//****   ****
//***** *****
public class Day005_star19 {
	public static void main(String[] args) {
		
		// 1 ~ 5행
		for (int i = 0; i < 5; i++) { //           0/1/2/3/4
			for (int j = 0; j <= 4-i; j++) { //0 ~ 4/3/2/1/0  
				System.out.print("*"); // 별 :      5/4/3/2/1개
			}
			for (int j = 0; j <= i*2; j++) { //0 ~ 0/2/4/6/8 
				System.out.print(" "); //공백 :     1/3/5/7/9개
			}
			for (int j = 0; j < 5-i; j++) {// 0~4/3/2/1/0 
				System.out.print("*"); // 별 : 5/4/3/2/1개
			}
			System.out.println();
		}
		
		// 6 ~ 9행
		for (int i = 0; i < 4; i++) { //            0/1/2/3
			for (int j = 0; j <= i+1; j++) { // 0 ~ 1/2/3/4
				System.out.print("*"); // 별 :       2/3/4/5개
			}
			for (int j = 0; j < 7-i*2; j++) { //0 ~   6/4/2/0 
				System.out.print(" "); // 공백 :      7/5/3/1개
			}
			for (int j = 0; j <= i+1; j++) {// 0 ~   1/2/3/4 
				System.out.print("*"); // 별 :       2/3/4/5개
			}
			System.out.println();
		}

	}
}
