package management_on_school.pojos.teacherManagement.TeacherUpdate;

import java.io.Serializable;
import java.util.List;

public class ObjectPojo implements Serializable {
	private boolean advisorTeacher;
	private String birthDay;
	private String birthPlace;
	private String email;
	private String gender;
	private List<LessonProgramsPojo> lessonPrograms;
	private String name;
	private String phoneNumber;
	private String ssn;
	private String surname;
	private int userId;
	private String username;

	public ObjectPojo() {
	}

	public ObjectPojo(boolean advisorTeacher, String birthDay, String birthPlace, String email, String gender, String name, String phoneNumber, String ssn, String surname, String username) {
		this.advisorTeacher = advisorTeacher;
		this.birthDay = birthDay;
		this.birthPlace = birthPlace;
		this.email = email;
		this.gender = gender;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.ssn = ssn;
		this.surname = surname;
		this.username = username;
	}

	public void setAdvisorTeacher(boolean advisorTeacher){
		this.advisorTeacher = advisorTeacher;
	}

	public boolean isAdvisorTeacher(){
		return advisorTeacher;
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

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setLessonPrograms(List<LessonProgramsPojo> lessonPrograms){
		this.lessonPrograms = lessonPrograms;
	}

	public List<LessonProgramsPojo> getLessonPrograms(){
		return lessonPrograms;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
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

	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getUserId(){
		return userId;
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
			"ObjectPojo{" + 
			"advisorTeacher = '" + advisorTeacher + '\'' + 
			",birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",email = '" + email + '\'' + 
			",gender = '" + gender + '\'' + 
			",lessonPrograms = '" + lessonPrograms + '\'' + 
			",name = '" + name + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",surname = '" + surname + '\'' + 
			",userId = '" + userId + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}