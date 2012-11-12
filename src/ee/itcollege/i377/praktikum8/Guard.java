package ee.itcollege.i377.praktikum8;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Guard {
	
	@Size(min=2, max=20)
	private String name;
	
	@Min(15)
	private int age;
	
	@Size(min=11, max=11)
	private String identificationCode;
	
	@Pattern(regexp="^\\+?\\d+")
	private String phoneNumber;
	
	@DateTimeFormat(pattern="dd.MM.yyyy")
	private Date startDate;
	
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
