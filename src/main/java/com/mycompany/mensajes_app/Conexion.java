package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Karina
 */
public class Conexion {
    /*TODO:
    1. Dependencies -> Add dependency -> query: mysql-connector-java
    */
    
    public Connection get_connection (){
        Connection conection = null;
        
        try {
        conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
        }catch(SQLException e){
            System.out.println(e);
        }
        return conection;
    }
    
     
    
}
