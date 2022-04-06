package array;

import java.util.Scanner;
//무한배열(문자열) 만들기 + 기능 추가
//중복된 값을 입력하면 "중복!"을 출력하고 값을 저장하지 않도록 하는 기능 추가
public class Day009_arrayInfiniteStringDedupli {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int defaultSize = 3;
		int size = defaultSize;
		
		// 기본 사이즈의 배열 생성
		String[] arr = new String[size];
		
		AAA: while(true) {
			System.out.printf("입력(현재길이:%d):", size);
			String str = sc.nextLine();
			if(str.contentEquals("끝")) { // "끝"을 입력하면 종료
				break;
			}
			if (index != 0) {
				for (int i = index-1; i >= 0; i--) { 
					if (str.contentEquals(arr[i])) { 
						System.out.println("중복!");
						continue AAA;
					}
				}
			}
			arr[index++] = str;
			if(size == index) { // 배열이 꽉 차면
				size += defaultSize; // 3칸(기본사이즈) 더 늘려주기
				String[] tmp = arr;
				arr = new String[size];
				for(int i = 0; i < tmp.length; i++) {
					arr[i] = tmp[i];
				}
				System.out.println("증가됨("+arr.length+")");
			}
			printArray(arr, index);
			System.out.println();
		}
		sc.close();
	}
	
	// 배열에 담긴 것들을 순서대로 출력해주는 메서드 
	public static void printArray(String[] arr, int index) {
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + ",");
		}
	}
}
