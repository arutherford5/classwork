package payday;

public class Transaction {
	
	private final long id;
	private final String content;
	
	public Transaction(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent(){
		return content;
	}
}
