package ee.itcollege.i377.praktikum8;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Guard {
	
	@Size(min=2, max=20)
	private String name;
	
	@Min(15)
	private int age;
	
	@Size(min=11, max=11)
	private String identificationCode;
	
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
	public String getIdentificationCode() {
		return identificationCode;
	}
	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}

}
