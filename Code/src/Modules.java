import java.io.Serializable;

public class Modules implements Serializable {
	

	private boolean exclusionL4=false;
	public boolean getExclusionL4() {
		return exclusionL4;
	}

	public void setExclusionL4(boolean exclusionL4) {
		this.exclusionL4 = exclusionL4;
	}
	private boolean exclusionL5=false;
	public boolean getExclusionL5() {
		return exclusionL5;
	}

	public void setExclusionL5(boolean exclusionL5) {
		this.exclusionL5 = exclusionL5;
	}
	private boolean exclusionL6=false;
	public boolean getExclusionL6() {
		return exclusionL6;
	}

	public void setExclusionL6(boolean exclusionL6) {
		this.exclusionL6 = exclusionL6;
	}
	private boolean certHEEligibility=false;
	public boolean getCertHEEligibility() {
		return certHEEligibility;
	}

	public void setCertHEEligibility(boolean certHEEligibility) {
		this.certHEEligibility = certHEEligibility;
	}
	private boolean dipHEEligibility=false;
	public boolean getDipHEEligibility() {
		return dipHEEligibility;
	}

	public void setDipHEEligibility(boolean dipHEEligibility) {
		this.dipHEEligibility = dipHEEligibility;
	}
	private boolean nonHonsEligibility=false;
	public boolean getNonHonsEligibility() {
		return nonHonsEligibility;
	}

	public void setNonHonsEligibility(boolean nonHonsEligibility) {
		this.nonHonsEligibility = nonHonsEligibility;
	}
	private String certHEClass="-";
	public String getCertHEClass() {
		return certHEClass;
	}

	public void setCertHEClass(String certHEClass) {
		this.certHEClass = certHEClass;
	}
	private String dipHEClass="-";
	public String getDipHEClass() {
		return dipHEClass;
	}

	public void setDipHEClass(String dipHEClass) {
		this.dipHEClass = dipHEClass;
	}
	private String nonHonsClass="-";
	public String getNonHonsClass() {
		return nonHonsClass;
	}

	public void setNonHonsClass(String nonHonsClass) {
		this.nonHonsClass = nonHonsClass;
	}
	private int condonedCredits=0;
	public int getCondonedCredits() {
		return condonedCredits;
	}

	public void setCondonedCredits(int condonedCredits) {
		this.condonedCredits = condonedCredits;
	}
	private int creditsL4=0;
	public int getCreditsL4() {
		return creditsL4;
	}

	public void setCreditsL4(int creditsL4) {
		this.creditsL4 = creditsL4;
	}
	private int creditsL5=0;
	public int getCreditsL5() {
		return creditsL5;
	}

	public void setCreditsL5(int creditsL5) {
		this.creditsL5 = creditsL5;
	}
	private int creditsL6=0;
	public int getCreditsL6() {
		return creditsL6;
	}

	public void setCreditsL6(int creditsL6) {
		this.creditsL6 = creditsL6;
	}
	private double averageL4=04;
	public double getAverageL4() {
		return averageL4;
	}

	public void setAverageL4(double averageL4) {
		this.averageL4 = averageL4;
	}
	private double averageL5=0;
	public double getAverageL5() {
		return averageL5;
	}

	public void setAverageL5(double averageL5) {
		this.averageL5 = averageL5;
	}
	private double averageL6=0;
	public double getAverageL6() {
		return averageL6;
	}

	public void setAverageL6(double averageL6) {
		this.averageL6 = averageL6;
	}
private boolean eligibilityL5;
public boolean getEligibilityL5() {
	return eligibilityL5;
}

public void setEligibilityL5(boolean eligibilityL5) {
	this.eligibilityL5 = eligibilityL5;
}
private boolean eligibilityL6;
public boolean getEligibilityL6() {
	return eligibilityL6;
}

public void setEligibilityL6(boolean eligibilityL6) {
	this.eligibilityL6 = eligibilityL6;
}


	// Module name setter and getter
	private String name;

	public void setModName(String name) {
		this.name = name;
	}

	public String getModName() {
		return name;
	}

	// module average setter and getter
	private double average;

	public void setAverage(double average) {
		this.average = average;
	}

	public double getAverage() {
		return average;
	}

	// module pass/fail status getter and setter
	private boolean pass;

	public void setPass(boolean value) {
		this.pass = value;
	}

	public boolean getPass() {
		return pass;
	}

	// module condone pending status setter and getter
	private boolean condonePendingStatus = false;

	public void setCondonePendingStatus(boolean value) {
		this.condonePendingStatus = value;
	}

	public boolean getCondonePendingStatus() {
		return condonePendingStatus;
	}

	// module condone pass/fail status setter and getter
	private boolean condonedPassed = false;

	public void setCondonedPassed(boolean value) {
		this.condonedPassed = value;
	}

	public boolean getCondonedPassed() {
		return condonedPassed;
	}

	// module attempt setter and getter
	private int attempt = 1;

	public void setAttempt(boolean status) {
		this.attempt = attempt + 1;
	}

	public int getAttempt() {
		return attempt;
	}
	
	private String level4Status;
	public void setLevel4Status(String status) {
		this.level4Status = status;
	}

	public String getLevel4Status() {
		return level4Status;
	}
	private String level5Status;
	public void setLevel5Status(String status) {
		this.level5Status = status;
	}

	public String getLevel5Status() {
		return level5Status;
	}
	private String level6Status;
	public void setLevel6Status(String status) {
		this.level6Status = status;
	}

	public String getLevel6Status() {
		return level6Status;
	}



}
