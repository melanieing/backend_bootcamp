package info_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//public class equals

public class InfoMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Info> infos = new HashSet<>();
        
		Info[] infoArr = new Info[] {
			new Info("홍길동", 20),
			new Info("이순신", 20),
			new Info("홍길동", 21),
			new Info("홍길동", 20)
		};
			
		for(int i = 0; i < infoArr.length; i++) {
			infos.add(infoArr[i]);
		}

		for(Info tmp : infos) {
			System.out.println(tmp);
		}
		
	}
}
