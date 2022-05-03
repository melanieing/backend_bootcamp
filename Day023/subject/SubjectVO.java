package subject;

// VALUE OBJECT

public class SubjectVO {
	
	private long subCode;
	private String subName;

	public SubjectVO() {
		
	}
	
	public SubjectVO(long subCode, String subName) {
		super();
		this.subCode = subCode;
		this.subName = subName;
	}

	public long getSubCode() {
		return subCode;
	}

	public void setSubCode(long subCode) {
		this.subCode = subCode;
	}

	public String getsubName() {
		return subName;
	}

	public void setsubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "SubjectVO [subCode=" + subCode + ", subName=" + subName + "]";
	}

	
	
	
	
	
}
