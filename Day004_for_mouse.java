package forHW;
// 쌀 100통(한 통은 80kg)이 저장되어 있는 창고에 암수 1쌍의 쥐가 있음
// 쥐 한 마리가 하루에 20g의 쌀을 먹고 10일마다 쥐의 수가 2배 증가함
// 며칠 만에 창고의 쌀이 모두 쥐의 먹이가 될까?
// 쥐는 총 몇 마리인가?
public class Day004_for_mouse {
	public static void main(String[] args) {

		int day;
		int mouse = 2;
		int rice = 8000000;
		
		for (day = 0; rice > 0; day++) {
			rice -= mouse * 20;
			if (day % 10 == 0 && day != 0) {
				mouse *= 2;
			}
		}
		System.out.printf("쌀이 다 떨어지는 날 : %d일, 쥐 마리 수 : %d마리", day, mouse);
	}
}
