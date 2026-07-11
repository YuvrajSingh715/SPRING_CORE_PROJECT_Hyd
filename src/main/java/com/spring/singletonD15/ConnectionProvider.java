package com.spring.singletonD15;

public class ConnectionProvider {}
  
 /* private static Connection connect;
 * 
 * private ConnectionProvider() {
 * 
 * }
 * 
 * public static Connection getObject() {
 * 
 * try { if (connect == null) {
 * 
 * // Class.forName("oracle.jdbc.OracleDriver");
 * 
 * connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
 * "yuvr@j32", "*******"); }
 * 
 * } catch (Exception e) { e.printStackTrace(); }
 * 
 * return connect;
 * 
 *   }
 * 
 * ==============================================================
 * public static void main(String[] args){
 * 
 * Connection c1 = ConnectionProvider.getObject(); 
 * Connection c2 = ConnectionProvider.getObject();
 * 
 * sysout(c1==c2); true
 * 
 *   } 
 * }
 * 
 */
//================================================================================================
/*
- Connection is an interface in the java.sql package.
- DriverManager is a utility class in the java.sql package.
- DriverManager contains the static getConnection() method.
- getConnection() creates and returns an object of a class 
  that implements the Connection interface (such as Oracle's JDBC connection class).
*/
