package grp.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectDatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb","postgres","Prajwal@123");
        Statement stmt = con.createStatement();
        boolean flag = true;
        System.out.println("1.Create Table 2.Insert Data 3.Update Data 4.Delete data 5.Shows Data 6.Exit");
        int value = sc.nextInt();
         do{
        	switch (value) {
			case 1:
				stmt.executeUpdate("");
				break;
			case 2:
				stmt.executeUpdate("INSERT INTO customer values();");
				break;
			case 3:
				stmt.executeUpdate("UPDATE table_name SET value WHERE ");

			default:
				break;
			}
        }while(flag);
	}
	

}
