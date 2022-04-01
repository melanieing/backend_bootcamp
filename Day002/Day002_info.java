package examjava02;
// 사용자의 이름과 나이를 따로 입력받기
// 한 문장으로 출력하기
import java.util.Scanner;

public class Day002_info {
	public static void main(String[] args) {
		
//		String name = "";
//		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.nextLine();

		System.out.print(name + "님의 나이는 몇 살입니까? ");
		int age = sc.nextInt();
		
		System.out.printf("%s님의 나이는 %d살입니다.^^", name, age);
		
		
//		System.out.println(name + "님의 나이는 " + age + "살입니다.");
//		
//		System.out.println("===================================");
//	
//		System.out.printf("%s님의 나이는 몇 살입니까?", name);
//		System.out.println();
//		System.out.printf("%s님의 나이는 %d살입니다.", name, age);
		
		
		sc.close();
		
	}
}
