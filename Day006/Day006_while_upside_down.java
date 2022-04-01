package while_examples;
// 입력받은 수를 거꾸로 출력하기
import java.util.Scanner;

public class Day006_while_upside_down {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 방법1 (for문 사용)
		System.out.print("거꾸로 출력할 수를 입력 : ");
		int num = sc.nextInt();
		String numToString = Integer.toString(num);
		int numLength = numToString.length();
		String udNum = "";
		
		for (int i = numLength-1; i >= 0; i--) {
			udNum += numToString.charAt(i);
		}
		System.out.println("거꾸로 출력 : " + udNum);
		
		sc.close();
		
	}

}
