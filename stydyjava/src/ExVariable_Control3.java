
public class ExVariable_Control3 {
	public static void main(String[] args) {
		//반복문 - 제어문의 종류중에 어떠한 것을 반복하기위한 문장.
		//사용을 하는 목적 ( 어떤 동작을 계속해서 개발자가 원하는 횟수만큼 반복을 하고싶을때. )
		System.out.println("1 * 1 = " + 1 );
		System.out.println("1 * 2 = " + 2 );
		System.out.println("1 * 3 = " + 3 );
		System.out.println("1 * 4 = " + 4 );//반복되는 코드에서 규칙을 찾아서 반복문으로 만들수가있다.
		//for ( 반복문에서 사용할변수 초기화 ; <-변수를 이용한 조건 식 ; 증감식 ; ) {
			// 반복이 되는 구간 ( 조건식이 TRUE일때 ) FALSE =x
		//}
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.println(1 + " * " + (i+1) + " = " + ((i+1)*1));
		}//i는 메모리에서 사라짐.
		
		//for문이 1개 있을때 한방향으로만 접근이 가능함 . 1~100 (행 또는 열) 
		//for문이 2개 있을때 두방향으로 접근이 가능함 . 1~10.. (행 , 열 )
		//for문 이용해서 2단부터 ~ 9단까지 출력하시오.
		for (int j = 2; j < 10; j++) {
			for (int j2 = 1; j2 < 10; j2++) {
				System.out.println(j*j2);
			}
	
		}
		
		//while <- for문은 정해진 횟수가 있을때 많이 사용한다면,
		//while문은 정해진 횟수를 잘 모를때 어떠한 조건을 주고 많이 사용을 한다.
		//while( 조건식 ,if문이랑 똑같이 생각면 됨 ) {           }
		
		boolean isWhile = true;
		while(isWhile) {// 무한반복 , 조건식이 true일동안 반복을하는 while문장인데 
					//어떠한 경우에도 조건식은 true이기때문에 무한 반복을 한다.
			System.out.println("dd");
			isWhile = false;
		}
		int i = 0; //for문 구조와 똑같이 만들어 보기.
		while(i<10) {
			System.out.println(1 + " * " + (i+1) + " = " + ((i+1)*1));
			i++;
		}
		//while문을 중첩시켜서 구구단 2~9단까지 출력 while문만 사용할것!
		System.out.println("==========여기서 와일쓸꺼임");
		
		for (int j = 2; j < 10; j++) {
			for (int j2 = 1; j2 < 10; j2++) {
				System.out.println(j*j2);
			}
		}
		
		int j = 2;
		while(j<10) {
			int j2 = 1;
			while(j2<10) {
				System.out.println(j*j2);
				j2++;
			}
			j++;
		}
		
		
		
		
		
		
		
		
		
	}
}
