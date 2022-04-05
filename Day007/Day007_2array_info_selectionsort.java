package array;

import java.util.Scanner;
// 5명의 이름과 나이를 저장하고 출력하는 프로그램
// 한 번에 5명의 정보를 저장, 출력
// 나이 순으로 정렬되어 출력되도록 기능 추가 (선택정렬 사용)
// 2차원 배열 사용하기
public class Day007_2array_info_selectionsort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] info = new String[5][2];
		
		for (int i = 0; i < info.length; i++) {
			System.out.println(i+1 + "번 째 정보 입력");
			for (int j = 0; j < info[i].length; j++) {
				if (j == 1) {
					System.out.print("나이 : ");
					info[i][j] = sc.nextLine();
					break;
				}
				System.out.print("이름 : ");
				info[i][j] = sc.nextLine();
			}
		}
		System.out.println("--------------입력한 순서대로 출력----------------");
		for (int i = 0; i < info.length; i++) {
			System.out.println(i+1 + "번 째 정보");
			System.out.println("이름 : " + info[i][0] + ", 나이 : " + info[i][1] + "세");
		}
		
		System.out.println("--------------오름차순 출력 옵션------------------");
		System.out.println("오름차순으로 정렬해서 보시겠습니까? (y/n)");
		char answer = sc.next().charAt(0);
		if (answer == 'y' || answer == 'Y') {
			for (int i = 0; i < info.length; i++) {
				for (int j = i+1; j < info.length; j++) {
					if (Integer.parseInt(info[i][1]) > Integer.parseInt(info[j][1])) { // String타입은 대소비교가 불가하므로 int로 변환해서 비교
						String tmpAge = info[i][1];
						info[i][1] = info[j][1];
						info[j][1] = tmpAge;
						String tmpName = info[i][0];
						info[i][0] = info[j][0];
						info[j][0] = tmpName;
					}
				}
			}
		}
		for (int i = 0; i < info.length; i++) {
			System.out.println(i+1 + "정보");
			System.out.println("이름 : " + info[i][0] + ", 나이 : " + info[i][1] + "세");
		}
		
		sc.close();
	}
}
