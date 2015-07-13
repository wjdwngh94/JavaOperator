package array;
/*
 * @Data : 2015.07.07
 * @Author : me
 * @Story : array, 선언, 객체지향 자바
 */
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[100000];
		//위 문장을 하나로 합치면 아래와 같다.
		int[] arr2 = new int[100000];
		Scanner scanner = new Scanner(System.in);
		
		// int 는 new로 선언하지 않았기 때문에 객체가 아니다.
		// new로 선언하여 가져오는것이 객체다.
		
		/*
		 * 자바는 객체지향 언어입니다.
		 * 이말은 프로그램 모양을 객체화 시켜서
		 * 사용한다는 뜻과 동ㅇ일합니다.
		 * 
		 * 그럼 객체화 시킨다는 말은 무엇이냐면
		 * 좁은 의미에서 보자면 메인을 해체시키고
		 * 단 하나의 메인만 프로그램에서 존재시키고
		 * 나머지는 클래스화 하여 필요할 떄에만
		 * 그 기능을 호출해서 사용하겠다는 의미입니다.
		 * 호출방법은 공식으로 굳어졌는데
		 * 클래스 이름 객체이름 = 뉴 클래스이름();
		 * ==()안에 있는변수는 파라미터라고 하는데
		 * ==필요에 따라 있을 수도 있고 없을 수도 있습니다.
		 * ==단, 클래스 이름, 객체이름, new,  클래스이름()
		 * ==은 반드시 필요합니다. 그리고 이때 객체이름을 
		 * ==참조변수라고 합니다.
		 */
	}
}