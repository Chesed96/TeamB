import java.util.ArrayList;

public class ExDTO {
	//ExDTO의 멤버
	//멤버 영역( 인스턴스 멤버(동적), 스태틱 멤버(정적) )
	//필드 부분(static이 붙어있는지의 유무에 따라서 멤버를 따로 구분할 수가 있다.)
	//1. 객체가 가지는 속성을 의미함 ( 기능 x, 어떤 값을 담을 수 있는 그릇 )
	//2. 대부분 알고있는 데이터타입 모든 것들은 필드 부분에 올 수 있다.
	//3. 필드들에 별도의 접근 제한자를 두지 않는 이상은 바로 접근이 가능하다.
	int field1;
	String field2;
	double field3;
	//ExVariable_Control ec;
	ArrayList<String> field4;
	
	static int sfield1;
	static String sfield2;
	static double sfield3;
	static ArrayList<String> sfield4;
	
	
}
