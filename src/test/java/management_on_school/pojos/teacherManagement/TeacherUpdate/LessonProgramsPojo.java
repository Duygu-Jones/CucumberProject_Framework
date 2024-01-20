package management_on_school.pojos.teacherManagement.TeacherUpdate;

import java.io.Serializable;
import java.util.List;

public class LessonProgramsPojo implements Serializable {
	private String day;
	private EducationTermPojo educationTerm;
	private int id;
	private List<LessonPojo> lesson;
	private String startTime;
	private String stopTime;
	private List<StudentsPojo> students;
	private List<TeachersPojo> teachers;

	public void setDay(String day){
		this.day = day;
	}

	public String getDay(){
		return day;
	}

	public void setEducationTerm(EducationTermPojo educationTerm){
		this.educationTerm = educationTerm;
	}

	public EducationTermPojo getEducationTerm(){
		return educationTerm;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setLesson(List<LessonPojo> lesson){
		this.lesson = lesson;
	}

	public List<LessonPojo> getLesson(){
		return lesson;
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

	public void setStudents(List<StudentsPojo> students){
		this.students = students;
	}

	public List<StudentsPojo> getStudents(){
		return students;
	}

	public void setTeachers(List<TeachersPojo> teachers){
		this.teachers = teachers;
	}

	public List<TeachersPojo> getTeachers(){
		return teachers;
	}

	@Override
 	public String toString(){
		return 
			"LessonProgramsPojo{" + 
			"day = '" + day + '\'' + 
			",educationTerm = '" + educationTerm + '\'' + 
			",id = '" + id + '\'' + 
			",lesson = '" + lesson + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",stopTime = '" + stopTime + '\'' + 
			",students = '" + students + '\'' + 
			",teachers = '" + teachers + '\'' + 
			"}";
		}
}