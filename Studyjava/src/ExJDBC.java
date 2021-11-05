import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExJDBC {
	//Java <=> Oracle
	//Lib Api가 반드시 필요하다.
	//OracleDriverManager <-
	//File jar파일을 프로젝트에 추가한다.(프로젝트 마우스 오른쪽 -> Build Path -> Configure Build path
	//pom.xml (Maven) Dependency (의존성)
	//라이브러리 탭에서 external Jars. 파일선택
	//프로젝트 밑에 ref lib <- 추가한 jar파일이 있는지 확인
	//oracle.jdbc.driver.OracleDriver// <- Ojdbc.jar 파일에 있는 클래스가 정상적으로 임포트(추가) 됐는지 확인
	//DB에 접속하는 방법들.
	//Mybatis(Xml, ConnectionPool,mapper), JDBC ( Connection, PreparedStateMent, ResultSet )
	//Connection 연결 (DataBase와 연결)
	
	
	Connection conn;//oracle 접속(연결)
	PreparedStatement ps;//sql문 실행(연결을 통해서 sql문을 전송해서)
	ResultSet rs;//전송한 결과를 출력하기 위한 객체(결과 객체)
	
	//DB 초기화 식
	//DataBase에 접속 하기 위해서는 반드시 url, user, password
	//Mysql, Mssql, MongDB, MariaDB 
	
	public void getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "hr";
		String password = "0000";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			if(!conn.isClosed()) {
				System.out.println("열림");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void dbClose() {
		try {
			if(rs != null) {
			rs.close();
			}
			if(ps != null) {
			ps.close();
			}
			if(conn != null) {
			conn.close();
			}
			System.out.println("db닫힘");
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
	}
	
	public void Select() {
		getConn();
		
		String sql = "SELECT  e.employee_id, e.first_name || ' ' || e.last_name, e.email, e2.max_sal , e.salary, e2.min_sal , d.department_name, e.manager_id, m.first_name||' '||m.last_name managername, e.department_id, e1.dmax_sal, e.salary, e1.dmin_sal" + 
				" FROM    employees e LEFT OUTER JOIN employees m" + 
				" ON      e.manager_id = m.employee_id" + 
				" LEFT OUTER JOIN departments d" + 
				" ON      e.department_id = d.department_id" + 
				" LEFT OUTER JOIN (SELECT department_id, MAX(salary) dmax_sal, MIN(salary) dmin_sal FROM employees  GROUP BY department_id) e1" + 
				" ON      e.department_id = e1.department_id" + 
				",(SELECT MAX(salary) max_sal, MIN(salary) min_sal FROM employees) e2";
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				for(int i = 1; i <= 13; i++) {
				System.out.print(rs.getString(i)+" ");
			
				}
				System.out.println();
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		dbClose();
	}
	public static void main(String[] args) {
		ExJDBC db = new ExJDBC();
		db.getConn();
		db.Select();
	}
}
