package info;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		InfoDAO dao = new InfoDAO();
		Scanner sc = new Scanner(System.in);
		
		// INSERT INTO "INFO"
		System.out.print("등록할 학생의 이름, 생일(yyyy-mm-dd), 혈액형을 입력하세요 : ");
		String inName = sc.next();
		String birth = sc.next();
		String blood = sc.next();
		InfoVO insertVO = new InfoVO(0L, inName, LocalDate.parse(birth), blood);
		System.out.println(dao.insertInfo(insertVO));
		
		// SELECT * FROM "INFO"
		System.out.println("전체 학생들의 인적사항을 출력합니다!");
		List<InfoVO> infos = dao.selectAll();
		
		for (InfoVO info : infos) {
			System.out.println(info);
		}
		
		// SELECT * FROM "INFO" WHERE "NAME"=?
		System.out.print("정보를 찾을 학생의 번호를 입력하세요 : ");
		int searchNum = sc.nextInt();
		List<InfoVO> infos2 = dao.searchByNum(searchNum);
		
		for (InfoVO info2 : infos2) {
			System.out.println(info2);
		}
		
		// DELETE FROM "INFO" WHERE "NUMBER" == ?
		System.out.print("삭제하고 싶은 학생의 번호를 입력하세요 : ");
		int delNum = sc.nextInt();
		System.out.println(dao.deleteInfoByNum(delNum)); 
		
		// UPDATE "INFO" SET "NUMBER"=?, "BIRTH"=?, "BLOOD_TYPE"=?, WHERE "NAME"=?
		System.out.print("정보를 수정할 학생의 이름, 그리고 새로 등록할 번호와 생일(yyyy-mm-dd), 혈액형을 입력하세요 : ");
		String upName = sc.next();
		int newNum = sc.nextInt();
		LocalDate newBirth = LocalDate.parse(sc.next());
		String newBloodType = sc.next();
		System.out.println(dao.updateInfoByName(upName, newNum, newBirth, newBloodType));

	}
}
