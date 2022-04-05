package array;

import java.util.Scanner;
//5명의 이름과 나이를 저장하고 출력하는 프로그램
//한 번에 5명의 정보를 저장, 출력
//나이 순으로 정렬되어 출력되도록 기능 추가 (버블정렬 사용)
//1차원 배열 여러 개 사용
public class Day007_array_info_bubblesort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = 5;
		String[] names = new String[size];
		int[] ages = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println(i+1+"번 째 정보 입력");
			System.out.print("이름:");
			names[i] = sc.nextLine();
			System.out.print("나이:");
			ages[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i = 0; i < size; i++) {
			System.out.println(i+1+"번 째 정보");
			System.out.println("이름:" + names[i] + ", 나이" + ages[i] + "세");
		}
		
		//버블 정렬
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size-1; j++) {
				if(ages[j] > ages[j+1]) {
					int tmpAge = ages[j];
					ages[j] = ages[j+1];
					ages[j+1] = tmpAge;
					String tmpName = names[j];
					names[j] = names[j+1];
					names[j+1] = tmpName;
				}
			}
		}
		System.out.println("오름차순으로 정렬 후");
		for(int i = 0; i < size; i++) {
			System.out.println(i+1+"번 째 정보");
			System.out.println("이름:" + names[i] + ", 나이" + ages[i] + "세");
		}
		
		sc.close();
	}
}
