package grp.JDBCDemo;


import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
    	Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Prajwal@123");
        //PreparedStatement stmt = con.prepareStatement("Select * from customer");
        Statement stmt = con.createStatement();
        //stmt.executeUpdate("insert into customer values(8,'kanta','7386869622');");
        stmt.executeUpdate("DELETE FROM customer WHERE c_id = 2");
        System.out.println("Query successful");
        ResultSet resultSet = stmt.executeQuery("Select * from customer");
        while(resultSet.next()) {
        	System.out.print(resultSet.getInt(1)+" ");
        	System.out.print(resultSet.getString(2)+" ");
        	System.out.print(resultSet.getString(3)+" ");
        	System.out.println();
        }
    }
}
