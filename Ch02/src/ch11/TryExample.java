package ch11;
/**
 * 예외 처리 try{}catch(예외객체){처리블럭}catch(예외객체){처리블럭}...
 * */
public class TryExample {
	public static void main(String[] args) {
		int divisor[] = {5,4,3,2,1,0};
		for(int cnt=0;cnt<10;cnt++) {//반복문 블럭 시작
			try {
				int share = 100/divisor[cnt];//0,1,2,3,4,5일때 나누기 오류, 
				System.out.println("cnt="+cnt+"결과="+share);
			}catch(java.lang.ArithmeticException e) {
				System.out.println("잘못된 연산입니다.");
			}catch(ArrayIndexOutOfBoundsException e) {//6일때 배열의 범위를 벗어난오류
				System.out.println("잘못된 인덱스입니다.");
			}catch(Exception e) {
				System.out.println("더많은 예외 발생");
			}
			finally {
			}
		}//반복문 블럭끝.
		System.out.println("Done.");
	}

}
