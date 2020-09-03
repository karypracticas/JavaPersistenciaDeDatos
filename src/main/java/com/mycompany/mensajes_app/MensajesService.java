package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class MensajesService {
    //Clase que pide los datos que se van a almacenar en la BD
    
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje:");
        String mensaje = sc.nextLine();
        System.out.println("Escribe tu nombre:");
        String autor = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autor);
        MensajesDAO.crearMensajesDB(registro);
        
    }
    public static void listarMensaje() {
        MensajesDAO.leerMensajesDB();
        
    }
    public static void borrarMensaje() {
        
    }
    public static void editarMensaje() {
        
    }   
}
