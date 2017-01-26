/**
* jdbc操作
*/
import java.sql.*;

public class MysqlDb{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载mysql驱动");
		}catch(ClassNotFoundException e){
			System.out.println("找不到mysql驱动");
			e.printStackTrace();
		}

	    String url="jdbc:mysql://cp01-aijia-1.epc.baidu.com:3306/ihouse";    //JDBC的URL    
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, "uoOlPta6116","PvI2FDrIUOLyIKEkJ");

            //创建一个Statement对象
            Statement stmt = conn.createStatement(); //创建Statement对象
            System.out.println("成功连接到数据库！");

			String sql = "select * from review limit 10";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				System.out.print(rs.getString("loanerName") + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString(3));
			}

			rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
	}
}
