package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class inicio {
    public static void main(String[] args) {
      /* Conexion obj = new Conexion();
       
       try {
       obj.get_connection();
       } catch(Exception e) {
           System.out.println(e);
       }*/
      
      Scanner sc = new Scanner(System.in);
      int opcion = 0;
 
      //Crear Menú de opciones
        do{
        System.out.println("-----------------------");
        System.out.println("1. Crear mensajes");
        System.out.println("2. Listar mensajes");
        System.out.println("3. Eliminar mensajes");
        System.out.println("4. Editar mensajes");
        System.out.println("5. Salir");  
        
        //Leer la opcion seleccionada por usuario
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1:
                MensajesService.crearMensaje();
                break;
            case 2:
                MensajesService.listarMensaje();
                break;
            case 3:
                MensajesService.editarMensaje();
                break;
            case 4:
                MensajesService.borrarMensaje();
                break;
            default:
                break;
        }
    }while(opcion != 5);
    
    }
   
}
