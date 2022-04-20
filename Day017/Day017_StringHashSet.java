package hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//HashSet을 이용해서 문자열을 넣는 프로그램을 구현하시오
//중복된 값을 입력하면 "중복!"을 출력

public class Day017_StringHashSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		HashSet<String> ss = new HashSet<>();
		
		while (true) {
			System.out.print("입력(현재길이:" + ss.size() + "):");
			String input = sc.nextLine();
			if (ss.add(input)) {		
				Iterator<String> st = ss.iterator();
				while (st.hasNext()) {
					String num = st.next();
					System.out.print(num + ",");
				}
				System.out.println();
			} else {
				System.out.println("중복!");
			}	
		}
	}

}
