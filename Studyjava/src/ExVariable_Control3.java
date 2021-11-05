
public class ExVariable_Control3 {
	public static void main(String[] args) {
		//반복문 - 제어문의 종류 중에 어떤 것을 반복하기 위한 문장.
		//사용을 하는 목적 ( 어떤 동작을 계속해서 개발자가 원하는 횟수만큼 반복을 하고 싶을 때 )
		System.out.println(1 * 1);
		System.out.println(1 * 2);
		System.out.println(1 * 3);
		System.out.println(1 * 4);//반복되는 코드에서 규칙을 찾아서 반복문으로 만들 수가 있다.
		//for(반복문에서 사용할 변수 초기화; <- 변수를 이용한 조건식; 증감식;) {
			//반복이 되는 구간( 조건식이 TRUE일 때) FALSE = x
		//}
		for(int i = 0; i < 10; i++) {
			
			System.out.println(1 + "*" + (i+1) + "=" + ((i+1)*1) );
			
		}//i는 메모리에서 사라짐.
		//for문이 1개 있을 때 한 방향으로만 접근이 가능함. 1~100 (행 또는 열)
		//for문이 2개 있을 때 두 방향으로 접근이 가능함. 1~10.. (행, 열)
		//for문 이용해서 2단 부터 ~ 9단까지 출력
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j+"="+ i*j+" ");
			}
			System.out.println();
		}
		
		//while <- for문은 정해진 횟수가 있을 때 많이 사용한다면
		//while문은 정해진 횟수를 잘 모를 때 어떠한 조건을 주고 많이 사용을 한다.
		//while( 조건식, if문이랑 똑같이 생각하면 됨 ) {       }
		boolean isWhile = true;
		while(isWhile) {//무한반복, 조건식이 true일 동안 반복을 하는 while문장인데
					 //어떠한 경우에도 조건식은 true이기 때문에 무한 반복을 한다.
			System.out.println("dd");
			isWhile = false;
			
		}
		int i = 0; //for문 구조와 똑같이 만들어 보기.
		while(i<10) {
			System.out.println(1 + "*" + (i+1) + "=" + ((i+1)*1) );
			i++;
		}
		i = 2;
		int j = 1;
		
		System.out.println("================================");
		//while문을 중첩시켜서 구구단 2~9단까지 출력 while문만 사용할 것
		while(i<10) {
			
			while(j<10) {
				System.out.print(i + "*" + j+"="+ i*j+" ");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}
		
	}
}
