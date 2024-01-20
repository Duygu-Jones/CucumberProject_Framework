package management_on_school.pojos.contact_management;

import java.io.Serializable;

public class ContactResponsePojo implements Serializable {
	private ContactObjectPojo object;
	private String message;
	private String httpStatus;

	public void setObject(ContactObjectPojo object){
		this.object = object;
	}

	public ContactObjectPojo getObject(){
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