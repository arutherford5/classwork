package payday;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Transaction {
	
	private long id;
	private int businessID;
	private String content;
	private long timeStamp;
	private String category;
	private String description;

	
	//public Transaction(long id, String content, int number) {
	//	this.id = id;
	//	this.content = content;
	//	this.timeStamp = number;
	//	this.category = "test";
	//	this.description = "description";
	//}

    public Transaction(){

    }

	public Transaction(long id, int businessID, String content, int number, String category, String description) {
		this.id = id;
		this.businessID = businessID;
		this.content = content;
		this.timeStamp = number;
		this.category = category;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public int getBusinessID(){
		return businessID;
	}

	public String getContent(){
		return content;
	}

	public long getTimeStamp(){
		return timeStamp;
	}

	public String getCategory(){
		return category;
	}
	public String getdescription(){
		return description;
	}

    public void setId(long id){
        this.id = id;
    }

    public void setBusinessID(int businessID){
        this.businessID=businessID;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setTimeStamp(long timeStamp){
        this.timeStamp = timeStamp;

    }

    public void setCategory(String category){
        this.category = category;
    }

    public void setDescription(String description){
        this.description = description;
    }

}
