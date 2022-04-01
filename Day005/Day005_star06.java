package for_star;
//12345
//23456
//34567
//45678
//56789
public class Day005_star06 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 1; j <= 5; j++) { // 1 ~ 5 : 5열
				System.out.print(i+j); // ex) 0+1 0+2 ... 0+5
			}
			System.out.println();
		}
	}
}
