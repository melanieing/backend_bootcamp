package score;

// VALUE OBJECT

public class ScoreVO {
	
	private long scoreNum;
	private long infoNum;
	private long subCode;
	private double subScore;
	
	public ScoreVO() {
		
	}
	
	public ScoreVO(long scoreNum, long infoNum, long subCode, double subScore) {
		super();
		this.scoreNum = scoreNum;
		this.infoNum = infoNum;
		this.subCode = subCode;
		this.subScore = subScore;
	}

	public long getScoreNum() {
		return scoreNum;
	}

	public void setScoreNum(long scoreNum) {
		this.scoreNum = scoreNum;
	}

	public long getInfoNum() {
		return infoNum;
	}

	public void setInfoNum(long infoNum) {
		this.infoNum = infoNum;
	}

	public long getSubCode() {
		return subCode;
	}

	public void setSubCode(long subCode) {
		this.subCode = subCode;
	}

	public double getSubScore() {
		return subScore;
	}

	public void setSubScore(long subScore) {
		this.subScore = subScore;
	}

	@Override
	public String toString() {
		return "ScoreVO [scoreNum=" + scoreNum + ", infoNum=" + infoNum + ", subCode=" + subCode + ", subScore="
				+ subScore + "]";
	}
	
}
