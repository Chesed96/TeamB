import java.util.ArrayList;

public class ExClass_Method1 {
	public static void main(String[] args) {
		//Class는 객체다, String, int, double, array 등 여러가지 데이터 타입을
		//하나의 객체로 묶어놓고 한 번에 사용할 때
		//Class의 규칙
		//1.첫글자가 대문자로 시작하는 경우
		//2.new라는 키워드를 통해서 인스턴스화 식이 있는 경우.
		String str = new String();
		
		//모든 필드에 값을 할당하고 출력
		//ArrayList의 경우 어떤 값을 주든 상관없음 (list)
		ExDTO dto = new ExDTO();
		dto.field1 = 10;
		dto.field2 = "choi";
		dto.field3 = 3.14;
		dto.field4 = new ArrayList<>();//list를 사용할 수 있게 초기화
		//null.add, ArayList.add
		dto.field4.add("seonguk");
		dto.field4.add("choi");
		System.out.println(dto.field4.get(0));
		System.out.println(dto.field4.get(1));
		
		//dto.sfield1 = 1;
		//static은 이미 메모리에 있기 때문에
		//객체화 (new) 를 통해서 메모리를 낭비할 필요없다.		
		ExDTO.sfield1 = 10;
		ExDTO.sfield2 = "choi";
		ExDTO.sfield3 = 3.14;
		ExDTO.sfield4 = new ArrayList<>();
		ExDTO.sfield4.add(10);
		ExDTO.sfield4.add(11);
		System.out.println(ExDTO.sfield4.get(0));
		System.out.println(ExDTO.sfield4.get(1));
		
		
		
	}	
}		
