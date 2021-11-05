import java.util.ArrayList;

public class ExDTO2 {
	//1.class의 블록킹 안에 있는지
	//2.ExDTO2의 멤버다.
	//3.인스턴스 멤버, 스테틱 맴버
	//4.메소드의 경우 void인가 void가 아닌가
	//5.new를 통해 인스턴스화를 하면
	//인스턴스화 한 객체에 점.을 찍으면 멤버가 보인다.
	void voidMethod() {
		//void라는 건 리턴타입이 없다
		System.out.println("voidMethod");
	}
	
	//인자값을 입력받는 형태의 메소드
	void voidMethod2(String a) {
		System.out.println(a);
	}
	void voidMethod3(String a, ArrayList<String> blist) {
		System.out.println(a);
		for(String dtos : blist) {
			System.out.println(dtos.toString());						
		}
	}
	
	//void가 아닌 메소드 전부 return이 있음.
	//return이라는 키워드가 반드시 들어가고
	//키워드 뒤에는 int에 담을 수 있는 값이 있어야한다.
	//int == method1
	int rtnMethod1() {
		//return ""; -X int만 리턴가능
		return 40;
	}
	
	//String = rtnMethod2
	String rtnMethod2() {
		return null;
	}
	
	//메소드 오버로링
	//같은 이름의 메소드에 매게변수 타입이나
	//갯수를 달리해서 사용하는것
	//같은 이름으로 여러가지 기능을 만들기 위해 사용
	int rtnMethod1(int a, int b) {
		return a+b;
	}
	
	
	
	
	
	
}//ExDTO2 블록킹		
