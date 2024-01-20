package management_on_school.pojos.student_management;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(ignoreUnknown = true)
public class StudentResponsePojo implements Serializable {
	private StudentObjectPojo object;
	private String message;

	public StudentResponsePojo() {

	}

	public StudentResponsePojo(StudentObjectPojo object, String message) {
		this.object = object;
		this.message = message;
	}


	public void setObject(StudentObjectPojo object){
		this.object = object;
	}

	public StudentObjectPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}