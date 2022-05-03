package score;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		ScoreDAO dao = new ScoreDAO();
		Scanner sc = new Scanner(System.in);
		
		// INSERT INTO "SCORE" VALUES(INFO_NUM, SUB_CODE, SUB_SCORE)
		System.out.print("성적을 등록할 학생의 번호, 과목번호, 점수를 입력하세요 : ");
		
		long infoNum = sc.nextInt();
		long subCode = sc.nextInt();
		double subScore = sc.nextDouble();
		ScoreVO insertVO = new ScoreVO(0L, infoNum, subCode, subScore);
		System.out.println(dao.insertScore(insertVO));
		
		// INSERT INTO "SCORE" VALUES(INFO_NAME, SUB_NAME, SUB_SCORE) (***DON'T USE FOR NOW***)
//		System.out.print("성적을 등록할 학생의 이름, 과목이름, 점수를 입력하세요 : ");
//		
//		String infoName = sc.next();
//		String subName= sc.next();
//		double subScore2 = sc.nextDouble();
//		
//		// 이럴바에야 아싸리 ScoreVO(long number, String infoName, long subCode, double subScore)
//		// 만들면 되지 않나...?
//		ScoreVO insertVO2 = new ScoreVO(0L, infoNum2, subCode2, subScore2);
//		System.out.println(dao.insertScore(insertVO));
		
		// SELECT * FROM "SCORE"
		System.out.println("등록된 학생 점수 목록을 모두 출력합니다!");
		List<ScoreVO> scores = dao.selectAll();
		
		for (ScoreVO score : scores) {
			System.out.println(score);
		}
		
		// SELECT * FROM "SCORE" WHERE "INFO_NUMBER"=?
		System.out.print("점수목록을 볼 학생의 번호를 입력하세요 : ");
		long searchInfoNum = sc.nextLong();
		List<ScoreVO> scores2 = dao.searchByInfoNum(searchInfoNum);
		
		for (ScoreVO score2  : scores2 ) {
			System.out.println(score2 );
		}
		
		// SELECT * FROM "SCORE" WHERE "SUBJECT_CODE"=?
		System.out.print("점수목록을 볼 과목의 코드를 입력하세요 : ");
		long searchSubCode = sc.nextLong();
		List<ScoreVO> scores3 = dao.searchBySubjectCode(searchSubCode);
		
		for (ScoreVO score3 : scores3) {
			System.out.println(score3);
		}
		
		// DELETE FROM "SCORE" WHERE "INFO_NUMBER" == ?
		System.out.print("점수를 삭제하고 싶은 학생의 번호를 입력하세요 : ");
		long delInfoNum = sc.nextLong();
		System.out.println(dao.deleteScoreByInfoNum(delInfoNum)); 
		
		// UPDATE "SCORE" SET "NUMBER"=?, "INFO_NUMBER"=?, "SUBJECT_CODE"=?, "SUBJECT_SCORE"=? WHERE "INFO_NUMBER"=?
		System.out.print("점수 정보를 수정할 학생의 번호, 수정할 과목의 코드, 새로운 점수를 차례대로 입력하세요 : "); // NUMBER는 받을 필요 없음
		long upInfoNum = sc.nextLong();
		long upSubCode = sc.nextLong();
		double newSubScore = sc.nextDouble();
		System.out.println(dao.updateScoreByInfoNum(upInfoNum, upSubCode, newSubScore));

	}
}
