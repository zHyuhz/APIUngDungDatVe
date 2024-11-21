package trash;

import java.sql.Date;

import jakarta.persistence.*;
@Entity
@Table(name = "users")
public class User {
	@Id
	@Column(name = "username", length = 50, nullable = false)
	private String userName;
	@Column(name = "fullname", length = 100, nullable = false)
	private String fullName;
	@Column(name = "phonenumber", length = 15)
	private String phoneNumber;
	@Column(name = "birthday")
	private Date birthDay;
	@Column(name = "gender")
	private Boolean gender;
	@Column(name = "city")
	private String city;
 

public User() {
	super();
}


public User(String userName, String fullName, String phoneNumber, Date birthDay, Boolean gender, String city) {
	super();
	this.userName = userName;
	this.fullName = fullName;
	this.phoneNumber = phoneNumber;
	this.birthDay = birthDay;
	this.gender = gender;
	this.city = city;
}

public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getFullName() {
	return fullName;
}


public void setFullName(String fullName) {
	this.fullName = fullName;
}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public Date getBirthDay() {
	return birthDay;
}


public void setBirthDay(Date birthDay) {
	this.birthDay = birthDay;
}


public Boolean getGender() {
	return gender;
}


public void setGender(Boolean gender) {
	this.gender = gender;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


 
}
