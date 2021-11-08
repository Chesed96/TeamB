import java.util.ArrayList;

public class ExClass_Method2 {
	public static void main(String[] args) {
		//1.voiMethod 호출하기.
		//2.10번 호출하기.
		ExDTO2 dto = new ExDTO2();
		for (int i = 0; i < 10; i++) {
			dto.voidMethod();
		}
		dto.voidMethod2(null);
		dto.voidMethod2("문자열");
		dto.voidMethod2((1+1)+"");
		dto.voidMethod2((3.5+1.1)+"");
		ArrayList<String> blist = new ArrayList<>();
		dto.voidMethod3("", blist);
		//인자값에 값을 할당하는 초기화식
		//String b = "";
		//ArrayList<String> blist = "a";
		System.out.println("====return타입 없는거했음↑");
		
		//1.40을 출력하시오(rtnMethod1을 호출해서)
		//2.그리고 rtnMethod1이 준값에 10을 더한값을 출력
		dto.rtnMethod1();//<=int
		//int a = 40 ; == dto.rtnMethod1;
		System.out.println(dto.rtnMethod1());
		System.out.println(dto.rtnMethod1()+10);
		System.out.println(dto.rtnMethod2()+"efg");
		System.out.println("abc" + "efg");
		//System.out.println(dto.voidMethod());//
		//return이없는 void메소드 이기때문에 출력 x↑
		//메소드 실행결과도 받을수가 없다.
		
		//1.rtnMethod1을 오버로딩시켜서
		//파라메터 int값 두개를 넘겼을때 두수의 합을 구하는
		//메소드를 완성하고 호출하기.
		
		//2.+ 20을해서 출력하기.
		
		dto.rtnMethod1(10, 20);
		//==return타입이 있는 메소드는 int
		System.out.println(dto.rtnMethod1(10, 20)+20);
		System.out.println(10+20+20);
		
		
		
		
		
		
		
		
		
	}
}
