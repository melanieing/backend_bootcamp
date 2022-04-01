package for_star;
//    *
//   ***
//  *****
// *******
//*********
public class Day005_star16 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { //           0/1/2/3/4 : 5행
			for (int j = 0; j < 4-i; j++) { // 0 ~ 3/2/1/0/x : 5열
				System.out.print(" "); // 공백 :     4/3/2/1/0개
			}
			for (int j = 0; j <= i*2; j++) { //  0 ~ 0/2/4/6/8 : 5열
				System.out.print("*"); // 별 :      1/3/5/7/9개
			}
			System.out.println();
		}

	}
}
