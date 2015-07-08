package variable;

public class Total {
	
	public static void main(String[] args) {
		
		//국어 점수는 데이터 타입이 정수이다.
		//변수명은 kor
		//할당된 값은 80
		
			//int kor = 80;
				//int kor; kor=80; 과 동일
			//int eng = 70;
			//int math = 50;
			
			//같은 데이터 타입의 변수를 여러가지 
			//선언과 할당할 때에는 다음과 같이 한다.
			
		int kor = 60, eng = 60, math = 60;
		int total = 0; // 지역 변수 초기화
		
		total = kor + eng + math; // 지역 변수 연산
		
		int avg = 0; // 지역 변수 초기화
		// 평균 구하기 : 총점 / 과목 수
		avg = total / 3;
		
		System.out.println("총점 : " + total); // total 
		System.out.println("평균 : " + avg); // avg
	}
}
