
public class ExVariable_Control2 {
	public static void main(String[] args) {
		// if(조건식) { 조건식이 참일 때 실행되는 부분}
		// else if(조건식2) { 조건식2 가 참일 때 실행되는 부분}
		// else if는 계속해서 연결 할수가 있다. 조건이 100개며 한개의 if와 99개의 else if
		// else if 뒤에도 모든 else if를 만족하지 못했을 때 else를 사용해서 마지막 처리를 하면된다.
		// 변수의 사용범위 (지역 변수) == 메소드 안에서 변수를 만들었을 때. local variable
		//블럭킹 == 중괄호 == {} 를 기주능로 어디에 있느냐에 따라서 사용 범위가 달라진다.
		int num1 = 0; //← 이 변수는 어디까지 사용할 수 있을까? : main 중괄호가 끝나기 전
		if (false) {
			int num2 = 1; // ← 이 변수는 어디까지 사용할 수 있을까??
			System.out.println("첫 번째 if문" + num2);
		} else if (false) {
			System.out.println("else if문");
		} else if (true) {
			System.out.println("두번 째else if문");
		} else {
			System.out.println("else문");
		}
		System.out.println(num1);
		//System.out.println(num2); //num2변수는 if문의 지역변수이기 때문에 if문의 블럭이 끝나는 순간 사용이 불가능하다.
		//
	}
}
