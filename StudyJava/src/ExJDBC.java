import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExJDBC {
	//java <-> Oracle
	//lib Api가 반드시 필요하다.
	//OracleDriverManager 가 필요
	//File jar파일을 프로젝트에 추가
	//pom.xml (Maven) Dependency (의존성) - 요즘 방법
	//프로젝트 마우스 오른쪽 클릭 -> Build Path -> Configure Build Path
	//라이브러리 탭 에서 External Jars . 파일 선택
	//프로젝트 밑에 ref lib <- 추가한 jar 파일 확인
	//oracle.jdbc.driver.OracleDriver// <- Ojdbc.jar 파일에 있는 클래스가 정상적으로 임포트(추가) 됐는지 확인
	
	//DB에 접속 방법
	//Mybatis(Xml, ConnetionPool, mapper), JDBC( Connection, PreparedStateMent, ResultSet )
	
	//Connection 연결 (DataBase와 연결)
	Connection conn; //oracle 접속(연결)
	PreparedStatement pr; //sql문 실행(연결을 통해서 sql문을 전송해서)
	ResultSet rs; //전송한 결과를 출력하기 위한 객체 (결과 객체)
	
	//DB 초기화식
	//DataBase에 접속하기 위해서는 반드시 url, user, password
	//Myssql, mssql, MongDb, MariaDB <- where employee_id = employee_id(+)
	
	public Connection getConn() {
		//String url = "jdbc:oracle:thin:@호스트주소:포트번호:XE";
		String url = "jdbc:oracle:thin:@192.168.0.12:1521:xe";
		String user = "hr";
		String password = "0000";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
//			if(!conn.isClosed()) {
//				System.out.println("열림");
//			} else {
//				System.out.println("닫힘");				
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public void Intsert() {
		conn = getConn();
		String sql = "insert into employees ( employee_id, first_name, last_name, email, salary, hire_date, job_id) " + 
				"values (207, 'seonguk', 'choi', 'canbin2351@gamil.com', 10000, sysdate, 'AD_PRES')";
		try {
			pr = conn.prepareStatement(sql);
			int result = pr.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void select() {

		conn = getConn();
		String sql = "select e.first_name || ' ' || e.last_name name, e.email, e2.max_sal, e2.min_sal, d.department_name, e1.first_name || ' ' || e1.last_name manager " + 
				"from   employees e, employees e1, " + 
				"       (select  max(salary *12) max_sal, min(salary*12) min_sal from employees) e2, " + 
				"       (select department_id, department_name from   departments) d " + 
				"where  nvl(e.department_id,0) = nvl(d.department_id,0) " + 
				"and    e.manager_id = e1.employee_id";
		try {
			pr = conn.prepareStatement(sql);
			rs = pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getString("email") + " " + rs.getString("max_sal") + " " +
						rs.getString("min_sal") + " " + rs.getString("department_name") + " " + rs.getString("manager"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		ExJDBC jdbc = new ExJDBC();
		jdbc.select();
	}
}
