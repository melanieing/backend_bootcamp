package for_star;
//*********
// *******
//  *****
//   ***
//    *
public class Day005_star17 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { //             0/1/2/3/4 : 5행
			for (int j = 0; j < i; j++) { //     0 ~ x/0/1/2/3
				System.out.print(" "); //    공백 :    0/1/2/3/4개
			}
			for (int j = 0; j < 9-i*2; j++) { // 0 ~ 8/6/4/2/0 
				System.out.print("*"); // 별 :        9/7/5/3/1개
			}
			System.out.println();
		}
	}
}
