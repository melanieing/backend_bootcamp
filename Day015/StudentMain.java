package student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentManager sm = new StudentManager();
		
        while (true) {
            StudentManager.showMenu();
            System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");
            int menu = sc.nextInt();
            switch (menu) {
            case 0 : // 프로그램 종료
                return;
            case 1 : // 학생 정보 등록
                System.out.print("등록할 학생의 수를 입력하세요 : ");
                int infoNum = sc.nextInt();
                for(int i = 0; i < infoNum; i++) {
                    System.out.print("등록할 학생의 등록번호, 이름, 나이, 국어성적, 영어성적, 수학성적를 차례로 입력하세요 : ");
                    sm.joinInfo(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                }
                System.out.println("학생 정보 등록이 완료되었습니다!");
                break;
            case 2 : // 학생 정보 목록 확인
            	sm.showInfo();
                break;
            case 3 : // 학생 정보 검색
                System.out.print("어떤 키워드로 검색하시겠습니까? (등록번호(1), 이름(2), 나이(3) 중 번호로 선택) : ");
                int clue = sc.nextInt();
		    	if (clue == 1) {
		            System.out.print("찾으시려는 학생의 등록번호를 입력하세요 : ");
		            int clueId = sc.nextInt();
		            sm.printInfo(sm.searchById(clueId));
		        } else if (clue == 2) {
		            System.out.print("찾으시려는 학생의 이름을 입력하세요 : ");
		            String clueName = sc.next();
		            sm.printInfo(sm.searchByName(clueName));
		        } else if (clue == 3) {
		            System.out.print("찾으시려는 학생의 나이를 입력하세요 : ");
		            int clueAge = sc.nextInt();
		            sm.printInfo(sm.searchByAge(clueAge));
		        } else {
		            System.out.println("1, 2, 3 중에서 입력하세요!");
		        }
                break;
            case 4 : // 학생 정보 수정
                System.out.print("정보를 수정하기 전 학생의 등록번호를 입력하세요 : ");
                int beforeId = sc.nextInt();
                if (sm.searchById(beforeId) == null) {
                	System.out.println("해당 등록번호를 가진 학생은 없습니다!");
                	continue;
                }
                System.out.println("수정할 정보의 유형을 고르세요 : (1. 인적사항(등록번호, 이름, 나이), 2. 성적)");
                int infoType = sc.nextInt();
                if (infoType == 1) {
                	System.out.println("새로운 정보를 등록번호, 이름, 나이 순으로 입력하세요 : ");
                	sm.modifyInfo(beforeId, sc.nextInt(), sc.next(), sc.nextInt());                	
                } else if (infoType == 2) {
                	System.out.println("새로운 정보를 국어성적, 영어성적, 수학성적 순으로 입력하세요 : ");
                	sm.modifyInfo(beforeId, sc.nextDouble(), sc.nextDouble(), sc.nextDouble());    
                } else {
                	System.out.println("1, 2 중에서 입력하세요!");
                }
                break;
            case 5 : // 학생 정보 삭제
                System.out.print("삭제할 학생의 등록번호를 입력하세요 : ");
                int targetId = sc.nextInt();
                sm.deleteInfo(targetId);
                break;
            default :
            	System.out.println("0 ~ 5 사이의 숫자를 입력하세요!");
            }
        }

	}
}
