package management_on_school.pojos.dean_management;

import java.io.Serializable;

public class DeanResponsePojo implements Serializable {
	private DeanObjectPojo object;
	private String message;
	private String httpStatus;

	public DeanResponsePojo() {
	}

	public DeanResponsePojo(DeanObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(DeanObjectPojo object){
		this.object = object;
	}

	public DeanObjectPojo getObject(){
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