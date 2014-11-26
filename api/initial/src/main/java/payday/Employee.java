package payday;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Employee {
	
	private long id;
	private String content;

    public Employee(){

    }
	
	public Employee(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent(){
		return content;
	}

    public void setId(long id){
        this.id = id;
    }

    public void setContent(String content){
        this.content = content;
    }
}
