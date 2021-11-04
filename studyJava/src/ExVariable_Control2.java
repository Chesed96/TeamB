import java.util.Scanner;

public class ExVariable_Control2 {
	public static void main(String[] args) {
		//if(조건식1) { 참일때 실행되는 부분 }
		//else if(조건식 2) { 조건식 2가 참일 때 실행되는 부분 }
		//else if는 계속해서 연결 할 수 있다. 조건이 100개면 한개의 if와 99개의 else if
		//else if 뒤에도 모든 else if를 만족하지 못했을 때 else를 사용해서 마지막 처리를 하면 된다.
		//변수의 사용 범위(지역 변수) == 메소드 안에서 변수를 만들었을 때 local variable
		//블럭킹 == 중괄호 == { } 를 기준으로 어디에 있는냐에 따라 사용 범위가 달라진다.
		int num = 0;//<- 이변수는 어디까지 사용할 수 있을까?
		if(false) {
			int num2 = 1; //<- 어디까지 사용할 수 있을까?
			System.out.println("첫번째 if문"+ num2);
		} else if (false) {
			System.out.println("else if 문");
		} else if (false) {
			System.out.println("두번째 else if 문");
		} else {
			System.out.println("else 문");
		}
		System.out.println(num);
		//System.out.println(num2);
		//num2는 if문의 변수이기 때문에 if문의 블럭이 끝나면 사용이 불가하다.
		
		
		
		
		
		
	}	
}		
