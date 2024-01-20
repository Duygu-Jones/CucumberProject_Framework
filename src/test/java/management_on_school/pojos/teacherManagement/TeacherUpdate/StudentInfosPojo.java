package management_on_school.pojos.teacherManagement.TeacherUpdate;

import java.io.Serializable;

public class StudentInfosPojo implements Serializable {
	private int absentee;
	private EducationTermPojo educationTerm;
	private int examAverage;
	private int finalExam;
	private int id;
	private String infoNote;
	private LessonPojo lesson;
	private String letterGrade;
	private int midtermExam;
	private StudentPojo student;

	public void setAbsentee(int absentee){
		this.absentee = absentee;
	}

	public int getAbsentee(){
		return absentee;
	}

	public void setEducationTerm(EducationTermPojo educationTerm){
		this.educationTerm = educationTerm;
	}

	public EducationTermPojo getEducationTerm(){
		return educationTerm;
	}

	public void setExamAverage(int examAverage){
		this.examAverage = examAverage;
	}

	public int getExamAverage(){
		return examAverage;
	}

	public void setFinalExam(int finalExam){
		this.finalExam = finalExam;
	}

	public int getFinalExam(){
		return finalExam;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setInfoNote(String infoNote){
		this.infoNote = infoNote;
	}

	public String getInfoNote(){
		return infoNote;
	}

	public void setLesson(LessonPojo lesson){
		this.lesson = lesson;
	}

	public LessonPojo getLesson(){
		return lesson;
	}

	public void setLetterGrade(String letterGrade){
		this.letterGrade = letterGrade;
	}

	public String getLetterGrade(){
		return letterGrade;
	}

	public void setMidtermExam(int midtermExam){
		this.midtermExam = midtermExam;
	}

	public int getMidtermExam(){
		return midtermExam;
	}

	public void setStudent(StudentPojo student){
		this.student = student;
	}

	public StudentPojo getStudent(){
		return student;
	}

	@Override
 	public String toString(){
		return 
			"StudentInfosPojo{" + 
			"absentee = '" + absentee + '\'' + 
			",educationTerm = '" + educationTerm + '\'' + 
			",examAverage = '" + examAverage + '\'' + 
			",finalExam = '" + finalExam + '\'' + 
			",id = '" + id + '\'' + 
			",infoNote = '" + infoNote + '\'' + 
			",lesson = '" + lesson + '\'' + 
			",letterGrade = '" + letterGrade + '\'' + 
			",midtermExam = '" + midtermExam + '\'' + 
			",student = '" + student + '\'' + 
			"}";
		}
}