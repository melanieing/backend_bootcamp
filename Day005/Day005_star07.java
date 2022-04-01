package for_star;
//56789
//45678
//34567
//23456
//12345
public class Day005_star07 {
	public static void main(String[] args) {
		
		// 방법1 : j를 고정시키고 증가하는 i를 계속 빼기
		for (int i = 0; i < 5; i++) { // 0 ~ 4 : 5행
			for (int j = 5; j < 10; j++) { // 5 ~ 9 : 5열
				System.out.print(j-i); // ex) 5-0 6-0 ... 9-0
			}						   //	  5-1 6-1 ... 9-1
			System.out.println();
		}
		
		// 방법2 : 감소하는 i와 증가하는 j를 더하기 
		for (int i = 5; i > 0; i--) { // 5 ~ 1 : 5행
			for (int j = 0; j < 5; j++) { // 0 ~ 4 : 5열
				System.out.print(i+j); // ex) 5+0 5+1 ... 5+4
			}						   //     4+0 4+1 ... 4+4
			System.out.println();
		}
	}
}
