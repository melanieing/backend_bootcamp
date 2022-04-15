package student;

public class StudentManager {
	
	private Student[] students;
    private int numUsers;    // for indexing and checking the number of current users
    private int size;        // for resizing info array and checking current array size

    // basic menu
    public static void showMenu() {
        System.out.println("\n=====학생 정보 관리 프로그램=====");
        System.out.println("1. 학생 정보 등록");
        System.out.println("2. 학생 정보 확인");
        System.out.println("3. 학생 정보 검색");
        System.out.println("4. 학생 정보 수정");
        System.out.println("5. 학생 정보 삭제");
        System.out.println("0. 프로그램 종료");
    }

    // initializing constructor
    public StudentManager() {
        this.size = 10;
        this.numUsers = 0;
        students = new Student[this.size];
    }

    // 1. 학생 정보 등록
    public void joinInfo(int id, String name, int age, double kor, double eng, double mat) {
        if(this.numUsers == this.size) {    // if array is full, then resize array with double of current size
            this.size = this.size * 2;
            Student[] temp = new Student[this.size];
            for(int i = 0; i < this.numUsers; i++) {    // copy old data from old array to new array
                temp[i] = this.students[i];
            }
            this.students = temp;
        }
        this.students[this.numUsers] = new Student(id, name, age, kor, eng, mat);    // else just put data
        this.numUsers++;    // increase the number of user data
    }

    // 2-1. 학생 정보 전체 목록 확인
    public void showInfo() {
        if (this.numUsers != 0) {                
        	System.out.println("-----학생 정보 목록-----");
            for (int i = 0; i < this.numUsers; i++) {
                System.out.println("등록번호 : " + students[i].getId());
                System.out.println("학생이름 : " + students[i].getName());
                System.out.println("학생나이 : " + students[i].getAge());
                System.out.println("++++++++++++++++++++");
                System.out.println("국어성적 : " + students[i].getKor());
                System.out.println("영어성적 : " + students[i].getEng());
                System.out.println("수학성적 : " + students[i].getMat());
                System.out.println("성적평균 : " + students[i].getAvg());
                System.out.println("*******************");
            }
        } else {
            System.out.println("등록된 학생 정보가 없습니다!");
        }
    }

    // 2-2. 개별 학생 정보 출력
    public void printInfo(Student stu) {
    	if (stu == null) {
    		System.out.println("찾으시는 정보가 없습니다!");
    		return;
    	}
        System.out.println("등록번호 : " + stu.getId());
        System.out.println("이름 : " + stu.getName());
        System.out.println("나이 : " + stu.getAge());
    }

    // 3. 학생 정보 검색
    // 3-1. 학생 등록번호로 검색
    public Student searchById(int id) {
        for (int i = 0; i < this.numUsers; i++) {
            if (id == students[i].getId()) {
                return students[i];
            }
        }
        return null;
    }   

    // 3-2. 학생 이름으로 검색
    public Student searchByName(String name) {
        for (int i = 0; i < this.numUsers; i++) {
            if (name.equals(students[i].getName())) {
                return students[i];
            }
        }
        return null;
    }   

    // 3-3. 학생 나이로 검색
    public Student searchByAge(int age) {
        for (int i = 0; i < this.numUsers; i++) {
            if (age == students[i].getAge()) {
                return students[i];
            }
        }
        return null;
    }   

    // 4. 학생 정보 수정
    // 4-1. 인적사항 수정
    public void modifyInfo(int beforeId, int newId, String newName, int newAge) {
         this.searchById(beforeId).setPerson(newId, newName, newAge);
         System.out.println("학생 정보 수정을 완료했습니다!");
    }
    // 4-2. 성적 수정
    public void modifyInfo(int beforeId, double kor, double eng, double mat) {
        this.searchById(beforeId).setScore(kor, eng, mat);
        System.out.println("학생 정보 수정을 완료했습니다!");
   }
    
    // 5. 학생 정보 삭제
    public void deleteInfo(int id) {
        int target = -1;
        for(int i = 0; i < this.numUsers; i++)    // find deleting target
            if(this.students[i].getId() == id) {
                target = i;
                break;
            }
        if(target == -1) {    // if there is no target print error message and return
            System.out.println("해당 등록번호를 가진 학생은 없습니다!");
            return;
        }
        this.numUsers--;    // decrease the number of user data
        for(int i = target; i < this.numUsers; i++) {    // rearrange data
            this.students[i] = this.students[i + 1];
        }
        System.out.println("해당 학생 정보를 삭제했습니다!");

    }

	
}
