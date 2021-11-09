import java.util.ArrayList;

public class ExClass_Method1 {
	public static void main(String[] args) {
		//Class는 객체다 , String , int , double , array 등등 여러가지 데이터 타입을 
		//하나의 객체로 묶어놓고 한번에 사용할때 .
		//Class의 규칙 
		//1.첫글자가 대문자로 시작하는 경우 
		//2.new라는 키워드를 통해서 인스턴스화 식이 있는경우.
		
		//모든 필드에 값을 할당하고 출력하시오.
		//ArrayList의 경우 어떤 값을 주든 상관없음 (list)
		ExDTO dto = new ExDTO();
		dto.field1 = 1;
		dto.field2 = "str";
		dto.field3 = 1.5;
		dto.field4 = new ArrayList<>();//list를 사용할수있게 초기화
		//null.add != ArrayList.add
		dto.field4.add("a");
		dto.field4.add("b");
		System.out.println(dto.field4.get(0));
		System.out.println(dto.field4.get(1));
		
		dto.sfield1 = 1;
		ExDTO.sfield2 = "b";
		ExDTO.sfield3 = 3.5;
		ExDTO.sfeild4 = new ArrayList<>();
		ExDTO.sfeild4.add(1);
		ExDTO.sfeild4.add(2);
		//static은 이미 메모리에 있기때문에
		//객체화 (new) 를 통해서 메모리를 더 낭비할 필요가 없다.
		
		
		
		
		
		
		
	}
}
