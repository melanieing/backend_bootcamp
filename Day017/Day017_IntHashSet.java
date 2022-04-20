package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// HashSet을 이용해서 정수를 넣는 프로그램을 구현하시오
// 중복된 값을 입력하면 "중복!"을 출력

public class Day017_IntHashSet {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> is = new HashSet<>();

		while (true) {
			System.out.print("입력(현재길이:" + is.size() + "):");
			int input = sc.nextInt();
			if (is.add(input)) {		
				Iterator<Integer> it = is.iterator();
				while (it.hasNext()) {
					Integer num = it.next();
					System.out.print(num + ",");
				}
				System.out.println();
			} else {
				System.out.println("중복!");
			}	
		}
	
	}
}
