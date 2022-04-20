package info_arrayList;

import java.util.Scanner;

public class InfoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InfoManager manager = new InfoManager();

        while (true) {
            InfoManager.showMenu();
            System.out.print("원하시는 메뉴의 번호를 입력하세요 : ");
            int menu = sc.nextInt();
            switch (menu) {
            case 0 : // 프로그램 종료
                return;
            case 1 : // 회원 정보 등록
                System.out.print("등록할 회원의 수를 입력하세요 : ");
                int infoNum = sc.nextInt();
                for(int i = 0; i < infoNum; i++) {
                    System.out.print("회원의 등록번호, 이름, 나이를 차례로 입력하세요 : ");
                    manager.joinInfo(sc.nextInt(), sc.next(), sc.nextInt());
                }
                System.out.println("회원 정보 등록이 완료되었습니다!");
                break;
            case 2 : // 회원 정보 목록 확인
                manager.showInfo();
                break;
            case 3 : // 회원 정보 검색
                System.out.print("어떤 키워드로 검색하시겠습니까? (등록번호(1), 이름(2), 나이(3) 중 번호로 선택) : ");
                int clue = sc.nextInt();
                if (clue == 1) {
                    System.out.print("찾으시려는 회원의 등록번호를 입력하세요 : ");
                    int clueId = sc.nextInt();
                    manager.printInfo(manager.searchById(clueId));
                } else if (clue == 2) {
                    System.out.print("찾으시려는 회원의 이름을 입력하세요 : ");
                    String clueName = sc.next();
                    manager.printInfo(manager.searchByName(clueName));
                } else if (clue == 3) {
                    System.out.print("찾으시려는 회원의 나이를 입력하세요 : ");
                    int clueAge = sc.nextInt();
                    manager.printInfo(manager.searchByAge(clueAge));
                } else {
                    System.out.println("1, 2, 3 중에서 입력하세요!");
                }
                break;
            case 4 : // 회원 정보 수정
                System.out.print("정보를 수정하기 전 회원의 등록번호를 입력하세요 : ");
                int beforeId = sc.nextInt();
                if (manager.searchById(beforeId) == null) {
                	System.out.println("해당 등록번호를 가진 회원은 없습니다!");
                	continue;
                }
            	System.out.println("새로운 정보를 등록번호, 이름, 나이 순으로 입력하세요 : ");
            	manager.modifyInfo(beforeId, sc.nextInt(), sc.next(), sc.nextInt());
                System.out.println("학생 정보 수정을 완료했습니다!");
            	break;
            case 5 : // 회원 정보 삭제
                System.out.print("삭제할 회원의 등록번호를 입력하세요 : ");
                int targetId = sc.nextInt();
                if (!manager.deleteInfo(targetId)) {
                	System.out.println("해당 등록번호를 가진 회원은 없습니다!");
                } else {
                	System.out.println("해당 회원 정보를 삭제했습니다!");
                }
                break;
            default :
            	System.out.println("0 ~ 5 사이의 숫자를 입력하세요!");
            }
        }
    }
}