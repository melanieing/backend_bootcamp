package for_star;
//*****
// ****
//  ***
//   **
//    *
//   ** 
//  ***
// ****
//*****
public class Day005_star14 {
	public static void main(String[] args) {
		
		// 1 ~ 5행
		for (int i = 0; i < 5; i++) {         //      0/1/2/3/4 : 5행
			for (int j = 0; j < i; j++) {     //  0 ~ x/0/1/2/3 : 5열
				System.out.print(" "); 		  // 공백 : 0/1/2/3/4개
			}
			for (int j = 0; j < 5-i; j++) {   //  0 ~ 4/3/2/1/0 : 5열
				System.out.print("*"); 	      //  별 : 5/4/3/2/1개 
			}
			System.out.println();
		}
		
		// 6 ~ 9행
		for (int i = 0; i < 4; i++) {        //     0/1/2/3 : 4행
			for (int j = 0; j < 3-i; j++) {  // 0 ~ 2/1/0/x : 4열
				System.out.print(" ");      // 공백 : 3/2/1/0개
			}
			for (int j = 0; j <= i+1; j++) { // 0 ~ 1/2/3/4 : 4열
				System.out.print("*"); 	     // 별 : 2/3/4/5개
			}
			System.out.println();
		}

	}
}
