package ch05;

public class ExmailSender extends MessageSender {
	//필드추가
	String senderAddr;
	String emailBody;
	
	public ExmailSender(String title, String senderName) {
		super(title, senderName);
	}
	//자기 클래스 내의 생성자의호출 this() 
	public ExmailSender(String title, String senderName, String senderAddr, String emailBody) {
		this(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

	@Override
	void sendMessage(String recipient) {
	     System.out.println("----------------");
	     System.out.println("제목:"+title);
	     System.out.println("보내는사람:"+senderName+" "+senderAddr);
	     System.out.println("받는사람:"+recipient);
	     System.out.println("내용:"+emailBody);

	}

}
