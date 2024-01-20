package management_on_school.pojos.teacherManagement.TeacherGetSavedById;

import java.io.Serializable;
import java.util.List;

public class Objectpojo implements Serializable {
	private int id;
	private String username;
	private String name;
	private String surname;
	private String email;
	private String gender;
	private String birthPlace;
	private String phoneNumber;
	private String ssn;
	private String birthDay;
	private boolean isAdvisor;
	private List<LessonsProgramListPojo> lessonsProgramList;

	public Objectpojo() {
	}

	public Objectpojo(String username, String name, String surname, String email, String gender, String birthPlace, String phoneNumber, String ssn, String birthDay, boolean isAdvisor) {
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.gender = gender;
		this.birthPlace = birthPlace;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.birthDay = birthDay;
		this.isAdvisor = isAdvisor;
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

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
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

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setBirthDay(String birthDay){
		this.birthDay = birthDay;
	}

	public String getBirthDay(){
		return birthDay;
	}

	public void setIsAdvisor(boolean isAdvisor){
		this.isAdvisor = isAdvisor;
	}

	public boolean isIsAdvisor(){
		return isAdvisor;
	}

	public void setLessonsProgramList(List<LessonsProgramListPojo> lessonsProgramList){
		this.lessonsProgramList = lessonsProgramList;
	}

	public List<LessonsProgramListPojo> getLessonsProgramList(){
		return lessonsProgramList;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"id = '" + id + '\'' +
			",username = '" + username + '\'' +
			",name = '" + name + '\'' + 
			",surname = '" + surname + '\'' + 
			",email = '" + email + '\'' + 
			",gender = '" + gender + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",birthDay = '" + birthDay + '\'' + 
			",isAdvisor = '" + isAdvisor + '\'' + 
			",lessonsProgramList = '" + lessonsProgramList + '\'' + 
			"}";
		}
}