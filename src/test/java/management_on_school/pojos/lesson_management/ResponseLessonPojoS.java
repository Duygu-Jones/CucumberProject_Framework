package management_on_school.pojos.lesson_management;

import java.io.Serializable;

public class ResponseLessonPojoS implements Serializable {
	private ObjectPojoS object;
	private String message;
	private String httpStatus;

	public void setObject(ObjectPojoS object){
		this.object = object;
	}

	public ObjectPojoS getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	public ResponseLessonPojoS() {
	}

	public ResponseLessonPojoS(ObjectPojoS object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}