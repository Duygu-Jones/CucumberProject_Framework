package management_on_school.pojos.guestUser;

import java.io.Serializable;

public class GuestResponsePojo implements Serializable {
	private GuestObjectPojo object;
	private String message;
	private String httpStatus;

	public GuestResponsePojo(GuestObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public GuestResponsePojo() {
	}




	public void setObject(GuestObjectPojo object){
		this.object = object;
	}

	public GuestObjectPojo getObject(){
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