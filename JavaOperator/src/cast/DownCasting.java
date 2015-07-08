package cast;
/*
 * @Data : 2015.07.07
 * @Author : me
 * @Story : 다운 캐스팅 문법
 */
public class DownCasting {
	public static void main(String[] args) {
		/*
		 * Down - Casting(다운 캐스팅)
		 * -강제 형 변환
		 * -프로그램에서 데이터 타입이 큰 변수를 작은 변수로 할당하려 할 때
		 * 		ex) double -> int
		 *  명시적 (int) 로 타입을 지정하는 것
		 * 
		 * -다만, 데이터의 손실이 발생함.
		 * -개발자는 직접 다운 캐스팅을 하려고 하지 말고
		 *  이클립스를 통해 자동으로 add cast 한다.
		 */
		int a = 7;
		double b = 3.14D;
		
		a = (int) b; 
		
		System.out.println("다운 캐스팅 결과 : " + a);
		
	}
}
