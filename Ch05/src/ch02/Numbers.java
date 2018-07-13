package ch02;

public class Numbers {
	//필드
	int[] num;
	//생성자
	Numbers(int[] num){//이 생성자는 매개변수로 배열을 받음
		this.num=num;
	}
	//메소드
	int getTotal() {
		int total=0;
		for(int cnt=0;cnt<num.length;cnt++)
			total+=num[cnt];
		return total;
	}
	//평균 리턴하는 메소드
	int getAvg() {
		return getTotal()/num.length;
	}

}
