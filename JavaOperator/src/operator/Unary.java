package operator;
/*
 * @Data : 2015.07.08
 * @Author : me
 * @Story : 단항 연산자 연립
 */
public class Unary {
	/*
	 * 단항 연산자
	 * i++(후위 연산자), ++i(전위 연산자)
	 */
	public static void main(String[] args) {
		
		int i=5, j=0, x=5, y=0; // 지역 변수는 디폴트 값으로 초기화
	
		j= i++;		//기존 값에서 더해나가다.
		//후위형은 i의 값을 읽어온 후 연산한다.
		//i의 값을 j에 읽어오고 +
		System.out.println("j의 값:\t" + j);
		
		//처음의 디폴트 값을 가져오기위해서 후위형을 많이 쓴다.
		
		
		//전위형은 x의 값을 증가시키고 연산한다.
		//y= y+1;
		y= ++x;
		// + 하고 그 값을 y에 읽어온다.
		System.out.println("y의 값:\t" + y);
	}
}
