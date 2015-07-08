package cast;
/*
 * @Data : 2015.07.07
 * @Author : me
 * @Story : 업캐스팅 문법
 */
public class UpCasting {
	public static void main(String[] args) {
		/*
		 UpCasting(업캐스팅)
		 -변환(conversion)
		 -묵시적 자동 변환
		 -데이터 타입이 선언된 두 변수가 있을 때
		 -크기가 작은 데이터 타입의 변수값을
		 -크기가 큰 데이터 타입의 변수값에 할당 할 때
		 **/
		
		int a = 3; // 정수
		double b = 3.14D; // 실수
		b= a; // 64bit data tybe에 32비트 데이터 타입을 담는 경우
		//이를 업 캐스팅 이라고 한다.
		
		System.out.println("업캐스팅 결과 : "+ b);
		
	}
}
