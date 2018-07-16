package ch05;
/**
 * abstract(추상)클래스는 추상메소드를 포함(일반메소드도 포함),
 * 추상메소드가 있는 클래스는 반드시 추상메소드(abstract)여야 함.
 * - 추상클래스는 instance할수 없음.
 * ->상속을 통해서 자식클래스에서 추상메소드의 실행부를 만들어야함.
 * */
public abstract class MessageSender {
   String title;
   String senderName;
public MessageSender(String title, String senderName) {
	this.title = title;
	this.senderName = senderName;
}
   //추상메소드
 abstract void sendMessage(String recipient);   
}
