package datatype;
/*
 * @Data : 2015.07.07
 * @Author : me
 * @Story : 데이터 타입에 대한 문법
 */
public class DataType {
	/*
	 
	 1. 데이터 타입이란?
	 -메모리를 생성하기 위한 도구
	 -메모리의 크기와 메모리의 형태를 지정하기 위한 도구
	 
	 2. 메모리를 얻고 사용하는 방법
	 -데이터 타입을 설정
	 -데이터 타입에 맞는 변수 선언
	 -변수에 값 할당
	 
	 * */
	public static void main(String[] args) {
		// 데이터 타입 + 변수 형태
		// 성 + 이름
		// 변수형태는 데이터 타입과 달라야한다
		// main 메소드 안에서 동일한 이름이 있으면 안된다.
		
		byte bt; // byte는 정수형 8bit
		short sh; // short는 정수형 16bit
		int a; // int는 정수형 32bit
		long lo; // long는 정수형 64bit
		
		float f; // float 는 실수형 숫자
		double d; // double 은 실수형 숫자 (무한대의 개념)
		
		char c; // char 는 알파벳 / 문자형
		
		boolean b; // 참이냐 거짓이냐를 나타낼 때
		
		int a2;
		a2=5; // 인트형 변수 a2 에 숫자 5를 할당한다.
		//메모리를 설정하고 데이터 또는 출력이 없으면 경고
		
		int a3 =5;
		System.out.println(a3);
		//변수를 선언하고 , 할당, 출력 이 하나의 연산이 된다.
	}
}
