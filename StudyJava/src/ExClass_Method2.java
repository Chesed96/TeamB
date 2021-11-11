import java.util.ArrayList;

public class ExClass_Method2 {
	public static void main(String[] args) {
		//1. voidMethod 호출하기.
		//2. 10번 호출하기.
		
		ExDTO2 dto = new ExDTO2();
		
		dto.voidMethod();
		
		for(int i = 1; i <= 10; i++) {
			dto.voidMethod();
			
		}
		
		
		dto.voidMethod2(null);
		dto.voidMethod2("문자");
		dto.voidMethod2((1+1)+"");
		dto.voidMethod3("b", new ArrayList<>());
		//인자값에 값을 할당하는 초기화식
		//String b = "";
		//ArrayList<String> blist = null;
		System.out.println("======return 타입 없는 거=======");
		
		
		//1. 40을 출력하시오(rtnMethod1을 호출해서)
		//2. 그리고 rtnMethod1이 준 값에 10을 더한 값을 출력.
		
		System.out.println(dto.rtnMethod1());
		System.out.println(dto.rtnMethod1()+10);
		System.out.println(dto.rtnMethod2());
		
		//rtnMethod1을 오버로딩시켜서
		//파라매터 int값 두 개를 넘겼을 때 두 수의 합을 구하는
		//메소드를 완성하고 호출하기.
		
		//2. + 20을 해서 출력하기.
		
		System.out.println(dto.rthMethod1(10, 11));
		System.out.println(dto.rthMethod1(10, 11)+20);
		
	}
}
