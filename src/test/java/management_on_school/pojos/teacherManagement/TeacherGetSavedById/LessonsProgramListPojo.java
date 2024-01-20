package management_on_school.pojos.teacherManagement.TeacherGetSavedById;

import java.io.Serializable;
import java.util.List;

public class LessonsProgramListPojo implements Serializable {
	private int id;
	private String day;
	private String startTime;
	private String stopTime;
	private List<LessonPojo> lesson;

	public LessonsProgramListPojo() {
	}

	public LessonsProgramListPojo(int id, String day, String startTime, String stopTime, List<LessonPojo> lesson) {
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.lesson = lesson;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
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

	public void setLesson(List<LessonPojo> lesson){
		this.lesson = lesson;
	}

	public List<LessonPojo> getLesson(){
		return lesson;
	}

	@Override
 	public String toString(){
		return 
			"LessonsProgramListPojo{" + 
			"id = '" + id + '\'' + 
			",day = '" + day + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",lesson = '" + lesson + '\'' + 
			"}";
		}
}