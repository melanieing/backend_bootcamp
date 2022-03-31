package examjava01;
/*
자신의 이름, 나이, 키, 몸무게, 최고학점을 입력받아 출력
(나이는 입력한 값에 -1을 한다.)
 */
import java.util.Scanner;

public class Day001_personal_info {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		System.out.print("나이 입력 : ");
		int age = sc.nextInt();

		System.out.print("키 입력(cm) : ");
		double height = sc.nextDouble();

		System.out.print("몸무게 입력(kg) : ");
		double weight = sc.nextDouble();
		
		System.out.print("최고학점 입력 : ");
		double grade = sc.nextDouble();
		
		sc.close();
		
		System.out.println("------인적사항------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + (age - 1) + "세");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("최고학점 : " + grade + "점");
	}
}