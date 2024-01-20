package management_on_school.pojos.teacherManagement.TeacherPost;

import java.io.Serializable;

public class PostObjectPojo implements Serializable {
	private int userId;
	private String username;
	private String name;
	private String surname;
	private String birthDay;
	private String ssn;
	private String birthPlace;
	private String phoneNumber;
	private String gender;
	private String email;
	private boolean advisorTeacher;

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

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
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

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setAdvisorTeacher(boolean advisorTeacher){
		this.advisorTeacher = advisorTeacher;
	}

	public boolean isAdvisorTeacher(){
		return advisorTeacher;
	}

	@Override
 	public String toString(){
		return 
			"ObjectPojo{" + 
			"userId = '" + userId + '\'' + 
			",username = '" + username + '\'' + 
			",name = '" + name + '\'' + 
			",surname = '" + surname + '\'' + 
			",birthDay = '" + birthDay + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",birthPlace = '" + birthPlace + '\'' + 
			",phoneNumber = '" + phoneNumber + '\'' + 
			",gender = '" + gender + '\'' + 
			",email = '" + email + '\'' + 
			",advisorTeacher = '" + advisorTeacher + '\'' + 
			"}";
		}
}