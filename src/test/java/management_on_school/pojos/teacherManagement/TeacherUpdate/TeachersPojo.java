package management_on_school.pojos.teacherManagement.TeacherUpdate;

import java.io.Serializable;
import java.util.List;

public class TeachersPojo implements Serializable {
	private AdvisorTeacherPojo advisorTeacher;
	private String birthDay;
	private String birthPlace;
	private String email;
	private String gender;
	private int id;
	private boolean isAdvisor;
	private List<Object> lessonsProgramList;
	private String name;
	private String phoneNumber;
	private String ssn;
	private List<StudentInfosPojo> studentInfos;
	private String surname;
	private String username;

	public void setAdvisorTeacher(AdvisorTeacherPojo advisorTeacher){
		this.advisorTeacher = advisorTeacher;
	}

	public AdvisorTeacherPojo getAdvisorTeacher(){
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

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setIsAdvisor(boolean isAdvisor){
		this.isAdvisor = isAdvisor;
	}

	public boolean isIsAdvisor(){
		return isAdvisor;
	}

	public void setLessonsProgramList(List<Object> lessonsProgramList){
		this.lessonsProgramList = lessonsProgramList;
	}

	public List<Object> getLessonsProgramList(){
		return lessonsProgramList;
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

	public void setStudentInfos(List<StudentInfosPojo> studentInfos){
		this.studentInfos = studentInfos;
	}

	public List<StudentInfosPojo> getStudentInfos(){
		return studentInfos;
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
			"TeachersPojo{" + 
			"advisorTeacher = '" + advisorTeacher + '\'' + 
			",birthDay = '" + birthDay + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",email = '" + email + '\'' + 
			",gender = '" + gender + '\'' + 
			",id = '" + id + '\'' + 
			",isAdvisor = '" + isAdvisor + '\'' + 
			",lessonsProgramList = '" + lessonsProgramList + '\'' + 
			",name = '" + name + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",studentInfos = '" + studentInfos + '\'' + 
			",surname = '" + surname + '\'' + 
			",username = '" + username + '\'' + 
			"}";
		}
}