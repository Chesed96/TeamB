import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExJDBC {
	//Java <=> Oracle
	//Lib Api 가 반드시 필요하다. 
	//OracleDriverManager <-
	//File jar파일을 프로젝트에 추가한다.(프로젝트 마우스 오른쪽 클릭 -> Build Path -> Configure Build path
	//라이브러리 탭에서 external Jars . 파일 선택
	//프로젝트 밑에 ref lib <- 추가한 jar파일이 있는지 확인 
	//
	//pom.xml (Maven) Dependency (의존성) 
	//oracle.jdbc.driver.OracleDriver//<- Ojdbc.jar파일에 있는 클래스가 정상적으로 임포트(추가) 됐는지 확인
	//DB에 접속하는 방법들.
	//Mybatis(Xml,ConnectionPool,mapper) , JDBC ( Connection , PreparedStateMent , ResultSet )
	//Connection 연결 (DataBase와 연결 )
	Connection conn ;//oracle 접속(연결) 1.
	PreparedStatement ps;//sql문 실행(연결을 통해서 sql문을 전송해서)
	ResultSet rs; //전송한 결과를 출력하기 위한 객체 (결과 객체)
	
	//DB 초기화 식
	//DataBase에 접속 하기 위해서는 반드시 url , user , password 
	//Myssql , Mssql , MongDb , MariaDB  <- where employee_id = employee_id(+)
	
	public void getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hanul";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("열림");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
