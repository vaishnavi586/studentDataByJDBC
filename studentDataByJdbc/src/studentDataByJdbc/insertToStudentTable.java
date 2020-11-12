package studentDataByJdbc;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class insertToStudentTable {

	public static void main(String[] args) throws Exception{
		String query ="select * from data";
		String url = "jdbc:mysql://localhost:3306/student";
		String username ="root";
		String password ="Vaishnavi@1998";
		int new_student_rollnumber = 7;
		String new_student_name = "rhymond";
		String Query ="insert into data values ("+new_student_rollnumber+",'"+new_student_name+"')";
	    Class.forName("com.mysql.jdbc.Driver"); //registering driver
		Connection con = DriverManager.getConnection(url,username,password);
		// establishing connection
		Statement st = con.createStatement();
		int count=st.executeUpdate(Query);
		System.out.println(count +"row/s affected"); 
		ResultSet rs = st.executeQuery(query); //rs holds the resultant table along with table headings
	    while(rs.next())
	    {
		String dataData= rs.getInt(1)+"	: "+rs.getString(2);//fetching data in form of table
		System.out.println(dataData);	
	    }
	    st.close();
		con.close();
	}



	}


