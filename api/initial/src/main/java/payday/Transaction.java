package payday;

public class Transaction {
	
	private final long id;
	private final int businessID;
	private final String content;
	private final long timeStamp;
	private final String category;
	private final String description;

	
	//public Transaction(long id, String content, int number) {
	//	this.id = id;
	//	this.content = content;
	//	this.timeStamp = number;
	//	this.category = "test";
	//	this.description = "description";
	//}

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
}
