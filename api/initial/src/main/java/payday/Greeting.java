package payday;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Greeting {
	
	private long id;
	private String content;
    private long timestamp;


    public Greeting(){

    }
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

    public Greeting(long id, String content, long timestamp){
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setTimestamp(long timestamp){
        this.timestamp = timestamp;
    }

	public long getId() {
		return id;
	}

	public String getContent(){
		return content;
	}

    public long getTimestamp() {
        return timestamp;
    }
}
