package operator;
/*
 * @Data : 2015.07.08
 * @Author : me
 * @Story : 삼항 연산자 문법
 */
public class Ternary {
	public static void main(String[] args) {
		
		int left = 1, right = 0;
		int result =0; // 지역변수 초기화
		boolean bool = true;
		/*
		 * 삼항 연산자는 if-else 의 축약문으로
		 * 
		 * 조건식(bool)은
		 * true값이면 left값을 출력하고
		 * false 이면 right값을 출력한다. 
		 */
		
		result = bool ? left : right;
		// 세개의 항으로 식을 만들 었기 때문에 삼항연산자라고 부른다.
		
		System.out.println("참 거짓 결과 : " + result);
	}
}
