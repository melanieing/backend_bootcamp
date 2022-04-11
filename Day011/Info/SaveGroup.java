package info;

public class SaveGroup {
	public static void main(String[] args) {
		
		InfoGroup ig = new InfoGroup();
		ig.infos = new Info[4];
		
		ig.infos[0] = new Info();
		ig.infos[0].name = "WINTER";
		ig.infos[0].age = 23;
		
		ig.infos[1] = new Info();
		ig.infos[1].name = "KARINA";
		ig.infos[1].age = 22;
		
		ig.infos[2] = new Info();
		ig.infos[2].name = "NING NING";
		ig.infos[2].age = 21;
		
		ig.infos[3] = new Info();
		ig.infos[3].name = "GISELLE";
		ig.infos[3].age = 23;
		
		for (int i = 0; i< ig.infos.length; i++) {
			ig.infos[i].printInfo();
		}
	}
}
