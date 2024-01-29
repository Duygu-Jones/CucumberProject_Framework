package management_on_school.pojos.guestUser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GuestGetAllResponseBodyPojo implements Serializable {
	private List<GuestGetAllContentListPojo> content;

	public GuestGetAllResponseBodyPojo() {
	}

	public GuestGetAllResponseBodyPojo(List<GuestGetAllContentListPojo> content) {
		this.content = content;
	}

	public void setContent(List<GuestGetAllContentListPojo> content){
		this.content = content;
	}

	public List<GuestGetAllContentListPojo> getContent(){
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