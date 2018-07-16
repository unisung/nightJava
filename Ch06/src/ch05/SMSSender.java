package ch05;

public class SMSSender extends MessageSender {
   //필드추가
	String returnPhoneNo;
	String message;
	
	public SMSSender(String title, String senderName) {
		super(title, senderName);
	}
    
	public SMSSender(String title, String senderName, String returnPhoneNo, String message) {
		this(title, senderName);
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}

	@Override
	void sendMessage(String recipient) {
		 System.out.println("----------------");
	     System.out.println("제목:"+title);
	     System.out.println("보내는사람:"+senderName);
	     System.out.println("전화번호:"+recipient);
	     System.out.println("회신 전화번호:"+returnPhoneNo);
	     System.out.println("메세지내용:"+message);
		
	}

}
