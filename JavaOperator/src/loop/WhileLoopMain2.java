package loop;

public class WhileLoopMain2 {
	public static void main(String[] args) {
		
		
		int idx = 0;
		//index
		
		
		while (true) { //무한 LOOP 사용 선언
			
			idx ++;
			System.out.print(idx+"\t");
			// 아래 구문이 없으면 무한 loop
			
			if (idx == 10) { //only if
				break; // 멈춤
			}
		}//while 에서는 condition 이 틀리면 빠져 나온다
	}
}

//선언 연산(데이터가공) 출력부

//if , loop 합쳐서 제어문
// 조건 제어문 : if , if else, switch
//순환(반복) 제어문 : while loop, for loop
