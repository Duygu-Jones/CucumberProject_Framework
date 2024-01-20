package management_on_school.pojos.lesson_management;

import java.io.Serializable;
import java.util.ArrayList;

public class LessonProgramPojo implements Serializable {
    private String day;
    private Integer educationTermId;

    private ArrayList<Integer> lessonIdList;

    private String startTime;
    private String stopTime;

    public LessonProgramPojo() {
    }
    public LessonProgramPojo(String day, Integer educationTermId, ArrayList<Integer> lessonIdList, String startTime, String stopTime) {
        this.day = day;
        this.educationTermId = educationTermId;
        this.lessonIdList = lessonIdList;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getEducationTermId() {
        return educationTermId;
    }

    public void setEducationTermId(Integer educationTermId) {
        this.educationTermId = educationTermId;
    }


    public ArrayList<Integer> getLessonIdList() {
        return lessonIdList;
    }

    public void setLessonIdList(ArrayList<Integer> lessonIdList) {
        this.lessonIdList = lessonIdList;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    @Override
    public String toString() {
        return "LessonProgromPojo{" +
                "day='" + day + '\'' +
                ", educationTermId=" + educationTermId +
                ", lessonIdList=" + lessonIdList +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                '}';
    }

}
