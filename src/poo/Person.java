package poo;

public class Person {
	private String name;
	private int age;
	private String birthday;
	private String cpf;
	private String motherName;
	private String fatherName;
	
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthday=" + birthday + ", cpf=" + cpf + ", motherName="
				+ motherName + ", fatherName=" + fatherName + "]";
	}
	
}
