package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Karina
 */
public class MensajesDAO {
    //Clase que ejecuta las instrucciones SQL
    
    public static void crearMensajesDB(Mensajes mensaje){
       Conexion db_connect = new Conexion();
     
       try (Connection conexion = db_connect.get_connection()) {
           PreparedStatement ps = null;
           try{
               String query = "INSERT into mensajes (mensaje,autor_mensaje) VALUES(?,?) ";
               ps = conexion.prepareStatement(query);
               ps.setString(1, mensaje.getMensaje());
               ps.setString(2, mensaje.autor_mensaje);
               ps.executeUpdate();
               System.out.println("Insert en Bd exitoso");
           }catch(SQLException ex){
               System.out.println("ex");
           }
       } catch(SQLException e) {
           System.out.println(e);
       }
    }
    
    public static void leerMensajesDB(){
        
    }
    
    public static void borrarMensajesDB(int id_mensaje) {
        
    }
    
    public static void actualizarMensajeDB(){
        
    }
    
}
