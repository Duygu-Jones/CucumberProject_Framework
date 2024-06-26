package management_on_school.pojos.teacherManagement.TeacherUpdate;

import java.io.Serializable;

public class UpdateResponsePojo implements Serializable {
	private String httpStatus;
	private String message;
	private ObjectPojo object;

	public UpdateResponsePojo() {
	}

	public UpdateResponsePojo(String httpStatus, String message, ObjectPojo object) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.object = object;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setObject(ObjectPojo object){
		this.object = object;
	}

	public ObjectPojo getObject(){
		return object;
	}

	@Override
 	public String toString(){
		return 
			"UpdateResponsePojo{" + 
			"httpStatus = '" + httpStatus + '\'' + 
			",message = '" + message + '\'' + 
			",object = '" + object + '\'' + 
			"}";
		}
}