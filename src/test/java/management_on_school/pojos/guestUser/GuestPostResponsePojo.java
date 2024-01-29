package management_on_school.pojos.guestUser;

import java.io.Serializable;

public class GuestPostResponsePojo implements Serializable {
	private GuestPostObjectPojo object;
	private String message;
	private String httpStatus;

	public GuestPostResponsePojo() {
	}

	public GuestPostResponsePojo(GuestPostObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(GuestPostObjectPojo object){
		this.object = object;
	}

	public GuestPostObjectPojo getObject(){
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
			"GuestPostResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}