package pubsub_gradle;

public class GCPMessageModel {
	
	private String messageID;
	private String messageBody;
	private String acknl;

	public String getMessageID() {
		return messageID;
	}
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}
	public String getMessageBody() {
		return messageBody;
	}
	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}
	public String getAcknl() {
		return acknl;
	}
	public void setAcknl(String acknl) {
		this.acknl = acknl;
	}
	
	@Override
	public String toString() {
		return "MyAppGCPMessage [MessageID=" + messageID + ", messageBody=" + messageBody + ", acknl=" + acknl + "]";
	}
}
