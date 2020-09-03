package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
         Conexion db_connect = new Conexion();
         
         PreparedStatement ps = null;
         ResultSet rs = null;
         
         try (Connection conexion = db_connect.get_connection()) {
           String query = "SELECT * FROM mensajes";
           ps = conexion.prepareStatement(query);
           rs = ps.executeQuery();
           
           while(rs.next()) {
               System.out.println("ID: " + rs.getInt("id_mensaje"));
               System.out.println("Mensaje: " + rs.getString("mensaje"));
               System.out.println("Autor: " + rs.getString("autor_mensaje"));
               System.out.println("Fecha: " + rs.getDate("fecha_mensaje"));  
               System.out.println("**********************");
           }   
         }catch(SQLException e) {
             System.out.println("No se pudieron obtener los datos");
           System.out.println(e);
        }      
    }
    
    public static void borrarMensajesDB(int id_mensaje) {
        
    }
    
    public static void actualizarMensajeDB(){
        
    }
    
}
