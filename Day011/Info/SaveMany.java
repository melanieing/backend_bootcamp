package info;

public class SaveMany {
	public static void main(String[] args) {
		
		// 여러 명의 이름과 나이를 저장
		Info[] infos = new Info[4];
		
		infos[0] = new Info();
		infos[0].name = "WINTER";
		infos[0].age = 23;
		
		infos[1] = new Info();
		infos[1].name = "KARINA";
		infos[1].age = 22;
		
		infos[2] = new Info();
		infos[2].name = "NING NING";
		infos[2].age = 21;
		
		infos[3] = new Info();
		infos[3].name = "GISELLE";
		infos[3].age = 23;
		
		for (int i = 0; i< infos.length; i++) {
			infos[i].printInfo();
			System.out.println(infos[i].infoToString());
		}

	}
}
