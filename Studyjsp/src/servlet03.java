

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanul.study.memberDTO;

@WebServlet("/s03.do")
public class servlet03 extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		// ① 클라이언트의 요청을 받는다 : 폼에서 입력한 매개변수를 가져온다.
		request.setCharacterEncoding("utf-8");
		/* DTO 클래스의 초기화된 생성자 메소드를 이용하여 DTO 객체를 생성하는 방법
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		int age = Integer.parseInt(request.getParameter("age"));
		String addr = request.getParameter("addr");
		String tel = request.getParameter("tel");
		memberDTO dto = new memberDTO(name, id, pw, age, addr, tel);
		*/
		
		//디폴트 생성자 메소드 이용하여 DTO 객체 생성하는 방법
		memberDTO dto = new memberDTO();
		dto.setName(request.getParameter("name"));
		dto.setId(request.getParameter("id"));
		dto.setPw(request.getParameter("pw"));
		dto.setAge(Integer.parseInt(request.getParameter("age")));
		dto.setAddr(request.getParameter("addr"));
		dto.setTel(request.getParameter("tel"));
		
		// ② 비즈니스 로직 : DAO 클래스를 통해서 DataBase 연동
		
		
		
		//③ 
		
		
	}

}
