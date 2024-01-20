package management_on_school.pojos.student_management;

import java.io.Serializable;

public class StudentRequestPojo implements Serializable {
	private int advisorTeacherId;
	private String birthDay;
	private String birthPlace;
	private String email;
	private String fatherName;
	private String gender;
	private String motherName;
	private String name;
	private String password;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private String username;

	public StudentRequestPojo() {
	}

	public StudentRequestPojo(int advisorTeacherId, String birthDay, String birthPlace, String email, String fatherName, String gender, String motherName, String name, String password, String phoneNumber, String ssn, String surname, String username) {
		this.advisorTeacherId = advisorTeacherId;
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.email = email;
		this.fatherName = fatherName;
		this.gender = gender;
		this.motherName = motherName;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
	}

	public void setAdvisorTeacherId(int advisorTeacherId){
		this.advisorTeacherId = advisorTeacherId;
	}

	public int getAdvisorTeacherId(){
		return advisorTeacherId;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setBirthPlace(String birthPlace){
		this.birthPlace = birthPlace;
	}

	public String getBirthPlace(){
		return birthPlace;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}

	public String getFatherName(){
		return fatherName;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setMotherName(String motherName){
		this.motherName = motherName;
	}

	public String getMotherName(){
		return motherName;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	@Override
 	public String toString(){
		return 
			"StudentPostPojo{" + 
			"advisorTeacherId = '" + advisorTeacherId + '\'' + 
			",birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",email = '" + email + '\'' + 
			",fatherName = '" + fatherName + '\'' + 
			",gender = '" + gender + '\'' + 
			",motherName = '" + motherName + '\'' + 
			",name = '" + name + '\'' + 
			",password = '" + password + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}