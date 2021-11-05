
public class ExVariable_Control3 {
	public static void main(String[] args) {
		//반복문 - 제어문의 종류 중에 어떠한 것을 반복하기 위한 문자.
		//사용을 하는 목적( 어떤 동작을 계속해서 개발자가 원하는 횟수만큼 반복을 하고 싶을 때)
		//반복되는 코드에서 규칙을 찾아서 반복문으로 만들 수 있다.
		
		//for ( 반복문에서 사용할 변수 초기화 ; <- 변수를 이용한 조건식 ; 증감식 ; ) {
		//      반복이되는 구간( 조건식이 TRUE 일때 ) 
		//}
		for (int i = 0; i < 10 ; i++) {
		}//i는 메모리에서 사라짐
		//for문이 1개 일때 한방향으로만 접근이 가능함. 1~100 (행 또는 열)
		//for문이 2개 일때 두방향으로 접근이 가능함. 1~10...(행, 열)
		//for문 이용해서 2단부터 ~ 9단까지 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
			//	System.out.println( i + " X " + j + " = " + (i * j));
			}
		}
		
		//while <- for문은 정해진 횟수가 있을때 많이 사용한다면,
		//while 문은 정해진 횟수를 잘 모를때 어떠한 조건을 주고 많이 사용을 한다.
		//while ( 조건식, if문이랑 똑같이 생각하면 됨) {        }
		boolean iswhile = true;
		while(iswhile) {//무한 반복, 조건식이 true 일 동안 반복하는 while 문장인데
					 //어떠한 경우에도 조건식은 true이기 때문에 무한 반복을 한다.
		//	System.out.println();
			iswhile = false;
		}
		int i = 0;//for문 주고와 똑같이 만들어 보기
		while(i < 10) {
		//	System.out.println(1 + " * " + (i+1) + " = " + ((i+1)*1));
			i++;
		}
		
		//while문을 중첩시켜서 구구단 2단 ~ 9단까지 출력
		i = 2;
		while (i < 10) {
			int j = 1;
			while(j < 10) {
				System.out.println( i + " X " + j + " = " + (i * j));
				j++;
			}
			i++;
		}
	}	
}		
