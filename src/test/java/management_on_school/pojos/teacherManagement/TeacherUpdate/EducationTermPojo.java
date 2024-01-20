package management_on_school.pojos.teacherManagement.TeacherUpdate;

import java.io.Serializable;

public class EducationTermPojo implements Serializable {
	private String endDate;
	private int id;
	private String lastRegistrationDate;
	private String startDate;
	private String term;

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLastRegistrationDate(String lastRegistrationDate){
		this.lastRegistrationDate = lastRegistrationDate;
	}

	public String getLastRegistrationDate(){
		return lastRegistrationDate;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setTerm(String term){
		this.term = term;
	}

	public String getTerm(){
		return term;
	}

	@Override
 	public String toString(){
		return 
			"EducationTermPojo{" + 
			"endDate = '" + endDate + '\'' + 
			",id = '" + id + '\'' + 
			",lastRegistrationDate = '" + lastRegistrationDate + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",term = '" + term + '\'' + 
			"}";
		}
}