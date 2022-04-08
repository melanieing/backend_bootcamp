package method;

import java.util.Scanner;

// 파일의 용량(byte)을 매개변수로 입력받아 bit 단위로 반환하는 함수
public class Day010_MethodByteToBit {

	public static double byteToBit(double byteValue, String unit) {
		double bit = 0;
		
		if (unit.equals("K")) {
			bit = byteValue * 8192;
		} else if (unit.equals("M")) {
			bit = byteValue * 8388608;
		} else if (unit.equals("G")) {
			bit = byteValue * 8.5899e+9;
		}
		return bit;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("bit로 변환할 KB, MB, GB 값을 입력하시오(ex. 32 G) : ");
		double byteValue = sc.nextDouble();
		String unit = sc.next();
		
		System.out.println(byteValue + unit + "B는 " + byteToBit(byteValue, unit) + "bit입니다!");
		
		sc.close();
	}

}
