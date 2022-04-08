package method;

import java.util.Scanner;
// cm값을 inch값으로 반환하는 함수 (1 inch == 2.54cm)
public class Day010_MethodCmToInch {

	public static double cmToInch(double cm) {
		double inch = cm / (double)2.54;
		
		return inch;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("inch로 변환할 cm값을 입력하시오 : ");
		double cm = sc.nextDouble();
		
		System.out.printf("%.3f(cm)는 %.3f(inch)입니다!", cm, cmToInch(cm));
		
		sc.close();
	}

}
