package student;

public class Student {

	private int id;
	private String name;
	private int age;
	private double kor, eng, mat;
	private double avg; 
	
	// constructor
	public Student() {	}
	
	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student(int id, String name, int age, double kor, double eng, double mat) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	// setter
	public void setPerson(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void setScore(double kor, double eng, double mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	public void setKor(double kor) {
		this.kor = kor;
	}
	public void setEng(double eng) {
		this.eng = eng;
	}	
	public void setMat(double mat) {
		this.mat = mat;
	}	

	// getter
	public int getId() {
		return id;
	}	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getKor() {
		return kor;
	}
	public double getEng() {
		return eng;
	}
	public double getMat() {
		return mat;
	}	
	public double getAvg() {
		return Math.round((((this.kor + this.eng + this.mat) / 3.0) * 100) / 100.0);
	}
}
