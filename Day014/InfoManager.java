package info;

public class InfoManager {

    private Info[] infos;
    private int numUsers;    // for indexing and checking the number of current users
    private int size;        // for resizing info array and checking current array size

    // 기본 메뉴 구성
    public static void showMenu() {
        System.out.println("\n=====회원 정보 관리 프로그램=====");
        System.out.println("1. 회원 정보 등록");
        System.out.println("2. 회원 정보 확인");
        System.out.println("3. 회원 정보 검색");
        System.out.println("4. 회원 정보 수정");
        System.out.println("5. 회원 정보 삭제");
        System.out.println("0. 프로그램 종료");
    }

    // initializing constructor
    public InfoManager() {
        this.size = 10;
        this.numUsers = 0;
        infos = new Info[this.size];
    }

    // 1. 회원 정보 등록
    public void joinInfo(int id, String name, int age) {
        if(this.numUsers == this.size) {    // if array is full, then resize array with double of current size
            this.size = this.size * 2;
            Info[] temp = new Info[this.size];
            for(int i = 0; i < this.numUsers; i++) {    // copy old data from old array to new array
                temp[i] = this.infos[i];
            }
            this.infos = temp;
        }
        this.infos[this.numUsers] = new Info(id, name, age);    // else just put data
        this.numUsers++;    // increase the number of user data
    }

    // 2-1. 회원 정보 전체 목록 확인
    public void showInfo() {
        if (this.numUsers != 0) {                
        	System.out.println("-----회원 정보 목록-----");
            for (int i = 0; i < this.numUsers; i++) {
                System.out.println("등록번호 : " + infos[i].getId());
                System.out.println("회원이름 : " +infos[i].getName());
                System.out.println("회원나이 : " +infos[i].getAge());
                System.out.println("*******************");
            }
        } else {
            System.out.println("등록된 회원 정보가 없습니다!");
        }
    }

    // 2-2. 개별 회원 정보 출력
    public void printInfo(Info info) {
    	if (info == null) {
    		System.out.println("찾으시는 정보가 없습니다!");
    		return;
    	}
        System.out.println("등록번호 : " + info.getId());
        System.out.println("이름 : " + info.getName());
        System.out.println("나이 : " + info.getAge());
    }

    // 3. 회원 정보 검색
    // 3-1. 회원 등록번호로 검색
    public Info searchById(int id) {
        for (int i = 0; i < this.numUsers; i++) {
            if (id == infos[i].getId()) {
                return infos[i];
            }
        }
        return null;
    }   

    // 3-2. 회원 이름으로 검색
    public Info searchByName(String name) {
        for (int i = 0; i < this.numUsers; i++) {
            if (name.equals(infos[i].getName())) {
                return infos[i];
            }
        }
        return null;
    }   

    // 3-3. 회원 나이로 검색
    public Info searchByAge(int age) {
        for (int i = 0; i < this.numUsers; i++) {
            if (age == infos[i].getAge()) {
                return infos[i];
            }
        }
        return null;
    }   

    // 4. 회원 정보 수정
    public void modifyInfo(int beforeId, int newId, String newName, int newAge) {
        this.searchById(beforeId).setInfo(newId, newName, newAge);
        System.out.println("학생 정보 수정을 완료했습니다!");
   }

    // 5. 회원 정보 삭제
    public void deleteInfo(int id) {
        int target = -1;
        for(int i = 0; i < this.numUsers; i++)    // find deleting target
            if(this.infos[i].getId() == id) {
                target = i;
                break;
            }
        if(target == -1) {    // if there is no target print error message and return
            System.out.println("해당 등록번호를 가진 회원은 없습니다!");
            return;
        }
        this.numUsers--;    // decrease the number of user data
        for(int i = target; i < this.numUsers; i++) {    // rearrange data
            this.infos[i] = this.infos[i + 1];
        }
        System.out.println("해당 회원 정보를 삭제했습니다!");

    }

}