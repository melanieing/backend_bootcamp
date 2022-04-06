package array;
// 다차원 배열은 각 배열의 길이를 다르게 할당할 수 있음
// 입력받은 수만큼 가변 길이 배열을 할당
// 할당된 가변길이 배열에 각각 길이를 다르게 입력받아 배열 할당
// 값은 0부터 자동입력 후 출력

import java.util.Scanner;

public class Day009_arrayMulDimAllocate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 행의 배열을 만드시겠습니까? : ");
		int row = sc.nextInt();
		int[][] array = new int[row][];
		
		System.out.println("각 행에 배열을 만드세요!");
		for (int i = 0; i < array.length; i++) {
			System.out.print(i+1 + "번째 행의 배열 : ");
			array[i] = new int[sc.nextInt()];			
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = j; // 0부터 값 입력
				System.out.print(array[i][j] + " "); // 
			}
			System.out.println();
		}
		System.out.println();
		
		sc.close();
	}
}
