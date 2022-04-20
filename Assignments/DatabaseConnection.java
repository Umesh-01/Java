package database;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



public class DatabaseConnection {



public static void main(String[] args) throws SQLException {

Connection conn = null;



try {

Class.forName("oracle.jdbc.driver.OracleDriver");

conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "CSE15A", "@college");

System.out.println("Connection Established successfully");

} catch (Exception e) {

System.out.println("Connection could not be established");

} finally {

if (conn != null) conn.close();

}

}



}
