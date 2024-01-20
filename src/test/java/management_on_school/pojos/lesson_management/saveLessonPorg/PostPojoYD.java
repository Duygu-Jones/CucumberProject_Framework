package management_on_school.pojos.lesson_management.saveLessonPorg;

import java.io.Serializable;
import java.util.List;

public class PostPojoYD implements Serializable {
	private String day;
	private int educationTermId;
	private List<Integer> lessonIdList;
	private String startTime;
	private String stopTime;

	public PostPojoYD() {
	}

	public PostPojoYD(String day, int educationTermId, List<Integer> lessonIdList, String startTime, String stopTime) {
		this.day = day;
		this.educationTermId = educationTermId;
		this.lessonIdList = lessonIdList;
		this.startTime = startTime;
		this.stopTime = stopTime;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setEducationTermId(int educationTermId){
		this.educationTermId = educationTermId;
	}

	public int getEducationTermId(){
		return educationTermId;
	}

	public void setLessonIdList(List<Integer> lessonIdList){
		this.lessonIdList = lessonIdList;
	}

	public List<Integer> getLessonIdList(){
		return lessonIdList;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setStopTime(String stopTime){
		this.stopTime = stopTime;
	}

	public String getStopTime(){
		return stopTime;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"day = '" + day + '\'' + 
			",educationTermId = '" + educationTermId + '\'' + 
			",lessonIdList = '" + lessonIdList + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			"}";
		}
}