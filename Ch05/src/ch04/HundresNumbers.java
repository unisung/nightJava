package ch04;

public class HundresNumbers {
	//instance필드
	//-객체가 생성될때마다
	//새로생기는 필드입니다.
	//클래스가 사용되기 전에 자바 가상 기계에 의해 단 한 번 호출됨
	//정적 필드의 초기값 설정에 주로 사용됨
	int arr[];
	//static필드
	//최초 한번만 생성됩니다.
	static int arr2[];
	//초기화 블럭
	{
		arr=new int[100];
		for(int cnt=0;cnt<100;cnt++)
			arr[cnt]=cnt;
	}
	//static초기화 블럭
	//static초기화 블럭에도 객체필드(instance)필드가 올수 없다.
	static{
		//arr=new int[100];
		arr2=new int[100];
		for(int cnt=0;cnt<100;cnt++)
			arr2[cnt]=cnt;
	}

}
