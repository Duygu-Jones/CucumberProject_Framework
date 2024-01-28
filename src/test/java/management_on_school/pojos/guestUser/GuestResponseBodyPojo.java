package management_on_school.pojos.guestUser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuestResponseBodyPojo implements Serializable {
	private List<GuestContentBodyPojo> content;

	public GuestResponseBodyPojo() {
	}

	public GuestResponseBodyPojo(List<GuestContentBodyPojo> content) {
		this.content = content;
	}

	public void setContent(List<GuestContentBodyPojo> content){
		this.content = content;
	}

	public List<GuestContentBodyPojo> getContent(){
		return content;
	}

	@Override
 	public String toString(){
		return 
			"GuestResponseBodyPojo{" + 
			"content = '" + content + '\'' + 
			"}";
		}
}