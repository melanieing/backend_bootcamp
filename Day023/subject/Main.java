package subject;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		SubjectDAO dao = new SubjectDAO();
		Scanner sc = new Scanner(System.in);
		
		// INSERT INTO "SUBJECT"
		System.out.print("등록할 과목을 입력하세요 : ");
		String inSubName = sc.next();

		SubjectVO insertVO = new SubjectVO(0L, inSubName);
		System.out.println(dao.insertSubject(insertVO));
		
		// SELECT * FROM "SUBJECT"
		System.out.println("전체 과목 리스트를 출력합니다!");
		List<SubjectVO> subjects = dao.selectAll();
		
		for (SubjectVO subject : subjects) {
			System.out.println(subject);
		}
		
		// SELECT * FROM "SUBJECT" WHERE "SUB_CODE"=?
		System.out.print("정보를 찾을 과목의 코드를 입력하세요 : ");
		int searchCode = sc.nextInt();
		List<SubjectVO> subjects2 = dao.searchByCode(searchCode);
		
		for (SubjectVO subject2 : subjects2) {
			System.out.println(subject2);
		}
		
		// SELECT * FROM "SUBJECT" WHERE "NAME"=?
		System.out.print("정보를 찾을 과목의 이름을 입력하세요 : ");
		String searchName = sc.next();
		List<SubjectVO> subjects3 = dao.searchByName(searchName);
		
		for (SubjectVO subject3 : subjects3) {
			System.out.println(subject3);
		}
		
		// DELETE FROM "SUBJECT" WHERE "SUB_CODE" == ?
		System.out.print("삭제하고 싶은 과목의 번호를 입력하세요 : ");
		int delCode = sc.nextInt();
		System.out.println(dao.deleteSubjectByCode(delCode)); 
		
		// UPDATE "SUBJECT" SET "SUB_CODE"=?, "NAME"=? WHERE "NAME"=?
		System.out.print("정보를 수정할 과목의 이름, 그리고 새로운 과목코드와 과목이름을 입력하세요 : ");
		String targetSubName = sc.next();
		int newSubCode = sc.nextInt();
		String newSubName = sc.next();
		System.out.println(dao.updateSubjectByName(targetSubName, newSubCode, newSubName));

	}
}
