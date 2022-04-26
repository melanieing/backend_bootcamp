package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day019_FileInfo {
	public static void main(String[] args) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년/MM월/dd일");
		// 파일이름 입력받아서 새로운 파일 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("파일경로(절대경로) 혹은 파일이름(상대경로)을 입력하세요 : ");
		String fileName = sc.next();
		File file = new File(fileName);
		
		// 파일 속성 나타내는 변수 선언 및 초기화
		String size = ""; // 파일의 크기
		long fileCnt = 0; // 디렉터리 내 파일의 개수
		long dirCnt = 0; // 디렉터리 내 폴더 개수
		
		if (file.exists()) {
			if (file.isFile()) {
				long fileSize = file.length();
				size = Long.toString(fileSize) + "bytes";
				System.out.println("파일의 크기 : " + size);
				System.out.println("파일의 마지막 수정 시간 : " + dateFormat.format(new Date(file.lastModified())));
				System.out.println("파일이 실행가능한지 여부 : " + file.canExecute());
				System.out.println("파일이 쓰기가능한지 여부 : " + file.canWrite());
				System.out.println("숨김파일인지 여부 : " + file.isHidden());
			} else if (file.isDirectory()) {
				System.out.println("디렉터리 내부의 폴더와 파일명 보기");
				File[] listFiles = file.listFiles();
				for (int i = 0; i < listFiles.length; i++) {
					if (listFiles[i].isFile()) {
						fileCnt++;
						System.out.println(listFiles[i]);
					} else {
						dirCnt++;
						System.out.println(listFiles[i]);
					}
				}
				System.out.println("디렉터리 내의 디렉터리의 개수 : " + dirCnt);
				System.out.println("디렉터리 내의 파일의 개수 : " + fileCnt);
			}
		} else {
			System.out.println("지정한 파일이 없음");
		}
		
	}
}
