import java.util.ArrayList;

public class ExClass_Method2 {
	public static void main(String[] args) {
		//1.voidMethod 호출하기
		//2.10번 호출하기
		ExDTO2 dto = new ExDTO2();
		for (int i = 0; i < 10; i++) {
			dto.voidMethod();
		}
		
		dto.voidMethod2("choi");
		
		//dto.voidMethod3("", null);
		//인자값에 값을 할당하는 초기화식
		String b = "choi";
		ArrayList<String> blist = new ArrayList<>();
		blist.add("seong");
		blist.add("uk");
		dto.voidMethod3(b, blist);
		
		//1.40d을 출력하시오
		//2.그리고 rtnMethod1이 준 값에 10을 더한 값을 출력
		dto.rtnMethod1(); //<- int
		//int a = 40; == dto.rtnMethod1
		System.out.println(dto.rtnMethod1());
		System.out.println(dto.rtnMethod1() + 10);
		System.out.println(dto.rtnMethod2() + "efg");		
		System.out.println("abc" + "egf");
		//System.out.println(dto.voidMethod());
		//return이 없는 void 메소드이기 때문에 출력이 안됨.
		//메소드 실행결과를 받을 수 없다.
		
		//rtnMethod1을 오버로딩시켜서
		//파라메터 int값 두개를 넘겼을 때 두수의 합을 구하는
		//메소드를 완성하고 호출
		// + 20을 출력
		
		System.out.println(dto.rtnMethod1(1, 2));
		//==return타입이 있는 메소드는 int
		System.out.println(dto.rtnMethod1(1, 2) + 20);
		
		
		
	}	
}		
