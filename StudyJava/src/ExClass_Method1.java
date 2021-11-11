import java.util.ArrayList;

public class ExClass_Method1 {
	public static void main(String[] args) {
		//Class는 객체다. String, int, double, array등등 여러가지 데이터 타입을
		//하나의 객체로 묶어놓고 한번에 사용할 때.
		//Class의 규칙
		//1. 첫 글자가 대문자로 시작하는 경우
		//2. new라는 키워드를 통해서 인스턴스화 식이 있는경우.
		//모든 필드에 값을 할당하고 출력하시오.
		//ArrayList의 경우 어떤 값을 주든 상관 없음.
		
		ExDTO dto = new ExDTO();
		
		dto.field1 = 10;
		dto.field2 = "String";
		dto.field3 = 3.14;
		
		dto.field4 = new ArrayList<>();//list를 사용할 수 있게 초기화
		dto.field4.add("a");
		dto.field4.add("b");	
		
		
		System.out.println(dto.field1);
		System.out.println(dto.field2);
		System.out.println(dto.field3);
		System.out.println(dto.field4.get(0));
		System.out.println(dto.field4.get(1));
		
		ExDTO.sfield1 = 11;
		ExDTO.sfield2 = "문자";
		ExDTO.sfield3 = 3.15;
		ExDTO.sfield4 = new ArrayList<>();
		ExDTO.sfield4.add("c");
		ExDTO.sfield4.add("d");
		//static은 이미 메모리에 올라와 있기에
		//객체화(new)를 통해서 메모리를 더 낭비할 필요가 없다.
		
		
		System.out.println(ExDTO.sfield1);
		System.out.println(ExDTO.sfield2);
		System.out.println(ExDTO.sfield3);
		System.out.println(ExDTO.sfield4.get(0));
		System.out.println(dto.sfield4.get(1));
		
	}
}
