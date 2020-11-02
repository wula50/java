package base;
import java.sql.*;

public class jdbc {
	
	//数据库连接
	public static Connection connectDB() {
		try {
			//为了兼容老版本写forName方法
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.println("Loading Fail!");
		}
		Connection connection=null;
		try {
			//hncu 是数据库名称，采用默认编码，还可以采用指定编码连接hncu?useUnicode=true&characterEncoding=utf-8
			//后两个参数是用户名和密码
			Connection connect=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hncu","root","");
			System.out.println("Success connect Mysql server!");
			return connect;
		}catch(Exception e) {
			System.out.println("Connect Fail!");
		}
		return connection;
		
	}
	
	//数据库按条件查询
    public static ResultSet selectResultSet(Connection connection, String sql) throws SQLException {
    	//获取语句对象
    	
		Statement stmtStatement=connection.createStatement();
		//查询
		ResultSet rSet=stmtStatement.executeQuery(sql);
		
    	return rSet;
    }
    
    //增删改
    public static void query(Connection connection, String sql) throws SQLException {
    	Statement statement=connection.createStatement();
    	statement.execute(sql);
    }
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=connectDB();
		showAll(connection);
		System.out.println();
		String insertSql="insert into stud values('1012','杨过',26,'武侠')";
		query(connection, insertSql);
		showAll(connection);
		
		
		

	}
	
	//显示数据库中所有数据
	public static void showAll(Connection connection) throws SQLException {
		String sql="select * from stud";
		ResultSet rSet=selectResultSet(connection,sql);
		System.out.println("id"+"----"+"姓名"+"----"+"年龄"+"----"+"地址");
		while(rSet.next()) {
				
				System.out.println(rSet.getString("sno")+"----"+rSet.getString("sname")+"----"+rSet.getByte("age")+"----"+rSet.getString("saddress"));
			}
	}

}
