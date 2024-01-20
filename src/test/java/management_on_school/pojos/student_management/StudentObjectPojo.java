package management_on_school.pojos.student_management;

import java.io.Serializable;


public class StudentObjectPojo implements Serializable {
	private int id;
	private String username;
	private String ssn;
	private String name;
	private String surname;
	private String birthDay;
	private String birthPlace;
	private String phoneNumber;
	private String gender;
	private String motherName;
	private String fatherName;
	private int studentNumber;
	private int advisorTeacherId;
	private String advisorTeacherName;
	private String advisorTeacherSurname;
	private String advisorTeacherEmail;
	private String email;
	private boolean active;

	public StudentObjectPojo() {
	}

	public StudentObjectPojo(int id, String username, String ssn, String name, String surname, String birthDay, String birthPlace, String phoneNumber, String gender, String motherName, String fatherName, int studentNumber, int advisorTeacherId, String advisorTeacherName, String advisorTeacherSurname, String advisorTeacherEmail, String email, boolean active) {
		this.id = id;
		this.username = username;
		this.ssn = ssn;
		this.name = name;
		this.surname = surname;
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.motherName = motherName;
		this.fatherName = fatherName;
		this.studentNumber = studentNumber;
		this.advisorTeacherId = advisorTeacherId;
		this.advisorTeacherName = advisorTeacherName;
		this.advisorTeacherSurname = advisorTeacherSurname;
		this.advisorTeacherEmail = advisorTeacherEmail;
		this.email = email;
		this.active = active;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return username;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public String getSurname(){
		return surname;
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

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return phoneNumber;
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

	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}

	public String getFatherName(){
		return fatherName;
	}

	public void setStudentNumber(int studentNumber){
		this.studentNumber = studentNumber;
	}

	public int getStudentNumber(){
		return studentNumber;
	}

	public void setAdvisorTeacherId(int advisorTeacherId){
		this.advisorTeacherId = advisorTeacherId;
	}

	public int getAdvisorTeacherId(){
		return advisorTeacherId;
	}

	public void setAdvisorTeacherName(String advisorTeacherName){
		this.advisorTeacherName = advisorTeacherName;
	}

	public String getAdvisorTeacherName(){
		return advisorTeacherName;
	}

	public void setAdvisorTeacherSurname(String advisorTeacherSurname){
		this.advisorTeacherSurname = advisorTeacherSurname;
	}

	public String getAdvisorTeacherSurname(){
		return advisorTeacherSurname;
	}

	public void setAdvisorTeacherEmail(String advisorTeacherEmail){
		this.advisorTeacherEmail = advisorTeacherEmail;
	}

	public String getAdvisorTeacherEmail(){
		return advisorTeacherEmail;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setActive(boolean active){
		this.active = active;
	}

	public boolean isActive(){
		return active;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"id = '" + id + '\'' + 
			",username = '" + username + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",name = '" + name + '\'' + 
			",surname = '" + surname + '\'' + 
			",birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",gender = '" + gender + '\'' + 
			",motherName = '" + motherName + '\'' + 
			",fatherName = '" + fatherName + '\'' + 
			",studentNumber = '" + studentNumber + '\'' + 
			",advisorTeacherId = '" + advisorTeacherId + '\'' + 
			",advisorTeacherName = '" + advisorTeacherName + '\'' + 
			",advisorTeacherSurname = '" + advisorTeacherSurname + '\'' + 
			",advisorTeacherEmail = '" + advisorTeacherEmail + '\'' + 
			",email = '" + email + '\'' + 
			",active = '" + active + '\'' + 
			"}";
		}
}