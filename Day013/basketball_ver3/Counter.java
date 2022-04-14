package basketball_ver3;

public class Counter {
	private int count;
	private int interval;
	
	// 기본으로 생성하면 간격은 1
	public Counter() { 
		interval = 1; 
	}
	// 간격을 설정하여 객체 생성 가능
	public Counter(int interval) {
		this.interval = interval;
	}
	// 간격과 횟수를 설정해 객체 생성 가능
	public Counter(int interval, int count) {
		this.interval = interval;
		this.count = count;
	}
	
	// 간격 설정
	public void setInterval(int interval) {
		this.interval = interval;
	}
	// 횟수 설정
	public void setCount(int count) {
		this.count = count;
	}
	
	// 간격 반환
	public int getInterval() {
		return interval;
	}
	// 횟수 반환
	public int getCount() {
		return count;
	}
	
	// 간격만큼 횟수를 증가시키기
	public void increment() {
		count += interval;
	}
	// 간격만큼 횟수를 감소시키기
	public void decrement() {
		count -= interval;
	}
	
}












