package for_examples;
//  *
// ***
//*****
// ***
//  *
public class Day006_for_flag_star {
	public static void main(String[] args) {
		
		boolean flag = true; // flag 기법
		int line = 5; 		 // 총 행의 개수
		int star = 1; 		 // 시작할 때 별의 개수
		int space = line / 2; 
		
		for (int i = 0; i < line; i++) { // 0/1/2/3/4 : 5행
			for (int j = 0; j < space; j++) { // 0/1
				System.out.print(" "); // 공백 : 2번
			}
			for (int j = 0; j < star; j++) { // 0
				System.out.print("*"); // 별 : 1번
			}
			System.out.println();
			
			if (i == line/2) { // 가운데에 다다랐을 때 
				flag = !flag; // flag 전환 (toggle 효과)
			}
			if (flag) { // 가운데 선 기준으로 윗 부분
				star += 2; 
				space--;
			} else { // 가운데 선 기준으로 아랫 부분
				star -= 2; 
				space++;
			}
		}
		
	}
}
