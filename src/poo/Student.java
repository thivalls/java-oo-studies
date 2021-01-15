package poo;

import java.util.List;

public class Student extends Person{

	private String registration;
	private String schoolName;
	private String year;
	private List<Topic> topics;
	
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public List<Topic> getTopics() {
		return topics;
	}
	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	
	@Override
	public String toString() {
		return "Student [registration=" + registration + ", schoolName=" + schoolName + ", year=" + year + ", topics="
				+ topics + ", toString()=" + super.toString() + "]";
	}	
	
	
}
