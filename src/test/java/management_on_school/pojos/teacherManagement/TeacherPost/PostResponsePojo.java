package management_on_school.pojos.teacherManagement.TeacherPost;

import java.io.Serializable;

public class PostResponsePojo implements Serializable {
	private PostObjectPojo object;
	private String message;
	private String httpStatus;

	public PostResponsePojo() {
	}

	public PostResponsePojo(PostObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(PostObjectPojo object){
		this.object = object;
	}

	public PostObjectPojo getObject(){
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