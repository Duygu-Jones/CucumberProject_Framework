package management_on_school.pojos.lesson_management;

import java.io.Serializable;

public class ResponseGetAllPojoS implements Serializable {
	private boolean compulsory;
	private int creditScore;
	private int lessonId;
	private String lessonName;

	public ResponseGetAllPojoS() {
	}

	public ResponseGetAllPojoS(boolean compulsory, int creditScore, int lessonId, String lessonName) {
		this.compulsory = compulsory;
		this.creditScore = creditScore;
		this.lessonId = lessonId;
		this.lessonName = lessonName;
	}

	public void setCompulsory(boolean compulsory){
		this.compulsory = compulsory;
	}

	public boolean isCompulsory(){
		return compulsory;
	}

	public void setCreditScore(int creditScore){
		this.creditScore = creditScore;
	}

	public int getCreditScore(){
		return creditScore;
	}

	public void setLessonId(int lessonId){
		this.lessonId = lessonId;
	}

	public int getLessonId(){
		return lessonId;
	}

	public void setLessonName(String lessonName){
		this.lessonName = lessonName;
	}

	public String getLessonName(){
		return lessonName;
	}

	@Override
 	public String toString(){
		return 
			"ResponseGetAllPojoS{" + 
			"compulsory = '" + compulsory + '\'' + 
			",creditScore = '" + creditScore + '\'' + 
			",lessonId = '" + lessonId + '\'' + 
			",lessonName = '" + lessonName + '\'' + 
			"}";
		}
}