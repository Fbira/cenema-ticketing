package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBService {
	
	public static String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static String URL = "jdbc:mysql://localhost:3306/CinemaTicketing";
    public static String USER = "root";
    public static String PASSWORD = "1234";
    
    public static Connection openConnection() {
    	
    	Connection conn = null;
    	
        try {
        	System.out.println("beginning database connection...");
        	
        	Class.forName(DRIVER);
                        
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        
        return conn;
    }   
}
