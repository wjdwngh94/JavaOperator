package datatype;
/*
 * @Data : 2015.07.07
 * @Author : me
 * @Story : String 타입 문법
 */
public class StringDemo {
	public static void main(String[] args) {
		// 맨 끝에 있는 ; 세미컬럼 을 '구분자' 라고 부른다. (문장의 마침표)
		char c = 'c'; 
		//char data type의 c변수에 알파벳 c값을 할당함.
		System.out.println(c);
		//char 형은 알파벳 하나만 출력가능
		
		String s = "abc";
		System.out.println(s);
		//알파벳 하나만 출력할 경우에는 char타입을 사용하고
		//하나이상의 문자열을 출력할 때에는 String타입을 사용한다.
		//주의할 점은 싱글 쿼터와 더블 쿼터에 유의.
		
		System.out.println("abc");
		//String을 주지않고 바로
	}
}
