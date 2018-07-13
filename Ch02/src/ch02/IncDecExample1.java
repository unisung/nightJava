package ch02;

public class IncDecExample1 {
	public static void main(String[] args) {
		int num=0;//로컬변수 선언및 초기화
		//변수++;++변수;처럼 단독으로 사용될때는
		//둘다 동일한 결과가 나옴.
	    num++;//num=num+1;//1
	    System.out.println(num);
	    ++num;//num=num+1;//2
	    System.out.println(num);
	    num--;//num=num-1;//1
	    System.out.println(num);
	    --num;//num=num-1;//0
	    System.out.println(num);
	    
	    num=0;
	    //다른 함수나 연산자내에서 같이 사용될때는
	    //num++는 연산처리후 증가
	    //++num은 증가후 연산에 참가
	    System.out.println(num++);//num은 0으로 출력후 1로 증가
	    System.out.println(++num);//현재1에서2로증가후 출력
	    System.out.println(num--);//현재값2출력후 1로 감소
	    System.out.println(--num);//현개값1에서 0으로 감소 후 출력
	    
  
	}
}
