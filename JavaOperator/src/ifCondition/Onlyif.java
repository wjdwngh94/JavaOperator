package ifCondition;

/*
 * @Data : 2015.07.08
 * @Author : me
 * @Story : if 만 있는 구문에 관한 문법
 */
public class Onlyif {
	public static void main(String[] args) {
		/*
		 * 구문(statement)
		 * 
		 * 자바 연산식에서 3가지 종류의 구문으로 나누니다.
		 * 1. 조건문/조건식
		 * 	if, if-else, switch
		 * 
		 * 2. 반복문
		 *  while, do-while, for
		 *  
		 * 3. 기타 구문
		 *  continue, break, return
		 */
		
		int x=0, y=0;//지변 초기화 - 가독성
		//x=y는 입력
		if (x==y) { //숫자 값의 비교 연산자 ==
			System.out.println("숫자 x와 y의 값은 같다.");
		}
		if (x!=y) { // !는 부정 not 이다.
			System.out.println("숫자 x와 y의 값은 다르다.");
		}
		if (x > y) {
			System.out.println("숫자 x는 y보다 값이 크다.");
		}
		if (x < y) {
			System.out.println("숫자 x는 y보다 값이 작다.");
		}
		if (x >= y) {
			System.out.println("숫자 x는 y보다 값이 크거나 같다.");
		}
		if (x <= y) {
			System.out.println("숫자 x는 y보다 값이 작거나 같다.");
		}
		/*
		 * 한 구문은 반드시 하나의 결과만을 리턴하게끔 코딩되어야 한다.
		 * 따라서 only if문을 코딩할 때에는 개발자가 단 한가지 케이스 만을
		 * 출력할 것이라는 확인이 있을 떄 다룬다.
		 */
	}
}
