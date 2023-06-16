package clases_y_ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
     //Metodo de conexion
    public static Connection getConnection(){
    
    //Cadena de conexion
        String conexionURL = "jdbc:sqlserver://localhost:50214;" +
            "databaseName=Remedial04;" +
            "user=sa;" +
            "password=itr2023;" +
            "encrypt=true;trustServerCertificate=true";
        
    //Devuelve la conexion
    try{
        Connection conn = DriverManager.getConnection(conexionURL);
        return conn;
    }
    catch(SQLException ex){
        System.out.println("ERROR En la conexion: " + ex.toString());
        return null;
    }   
    }   
}
