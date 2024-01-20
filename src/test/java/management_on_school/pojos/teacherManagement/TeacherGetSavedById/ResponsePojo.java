package management_on_school.pojos.teacherManagement.TeacherGetSavedById;

import java.io.Serializable;

public class ResponsePojo implements Serializable {
	private Objectpojo object;
	private String message;
	private String httpStatus;

	public ResponsePojo() {
	}

	public ResponsePojo(Objectpojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(Objectpojo object){
		this.object = object;
	}

	public Objectpojo getObject(){
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