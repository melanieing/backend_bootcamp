package info_hashset;

public class Info {
	
	private String name;
	private int age;
	
	public Info(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Info[name=" + name + ",age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
//		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Info other = (Info)obj;
		if (age != other.age)
			return false;
		if (name == null) { // 기준 객체의 name이 비었는데,
			if (other.name != null) // 비교 객체의 name은 값이 있다면,
				return false;
		} else if (!name.equals(other.name)) // 기준객체와 비교객체의 name'값'이 다르다면,
			return false;
		return true;
	}
		
	
}
