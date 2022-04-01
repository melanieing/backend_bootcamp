package basic_examples;
// 정수 10개를 입력받아 평균 구하기
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day004_for_10avg {
	public static void main(String[] args) {

		// 1. 정수 10개를 문자열로 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("평균을 구할 정수 10개를 입력하시오: ");
		String str = sc.nextLine();
		sc.close();
		
		// 2. 사용할 변수 선언 및 초기화
		String[] numbers = new String[10];
		int i = 0, j = 0, sum = 0;
		double avg = 0.0;
		
		// 3. 문자열을 공백기준으로 토큰으로 나눠서 배열에 담기 
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		while (tokenizer.hasMoreTokens()) {
			numbers[i] = tokenizer.nextToken();
			i++;
		}
		
		// 4. 배열의 인덱스끼리 총합 구하기
		for (j = 0; j < numbers.length; j++) {
			sum += Integer.parseInt(numbers[j]);
//			System.out.println(sum);
		}
		
		// 5. 평균구해서 출력
		avg = sum / 10.0;
		System.out.printf("평균 : %.2f", avg);
	}
}
