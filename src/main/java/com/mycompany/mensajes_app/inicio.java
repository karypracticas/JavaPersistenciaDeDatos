package com.mycompany.mensajes_app;

/**
 *
 * @author Karina
 */
public class inicio {
    public static void main(String[] args) {
       Conexion obj = new Conexion();
       
       try {
       obj.get_connection();
       } catch(Exception e) {
           System.out.println(e);
       }
    }
   
}
