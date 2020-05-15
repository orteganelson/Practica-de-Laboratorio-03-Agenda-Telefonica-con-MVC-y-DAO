/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Telefono;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ortega
 */
public class VistaTelefono {
      private Scanner leer;

    public VistaTelefono() {
        leer=new Scanner(System.in);
    }
    
    
    public Telefono registrarTelefono(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese codigo ");
        int id=leer.nextInt();
        System.out.println("Ingrese numero");
        String numero=leer.next();
        System.out.println("Ingrese tipo:"+ "celular / convencional");
        String tipo=leer.next();
        System.out.println("Ingrese operadora");
        String operadora=leer.next();
        return  new Telefono (id,numero,tipo,operadora);
    
    }
    
    
    public Telefono actualizarTelefono(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese codigo del telefono que desea actualizar ");
        int id =leer.nextInt();
        System.out.println("Ingrese el nuevo numero");
        String numero=leer.next();
        System.out.println("Ingrese de que tipo es:"+ "celular / convencional");
        String tipo=leer.next();
        System.out.println("Ingrese la operadora");
        String operadora=leer.next();
        return  new Telefono (id,numero,tipo,operadora);    
    }
    
    
    public Telefono eliminarTelefono(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese el id del telefono a eliminar");
        int id = leer.nextInt();
        return new Telefono (id,null,null,null);
    }
    
    
    public int buscarTelefono(){        
        leer=new Scanner(System.in);
        System.out.println("Ingrese id del telefono");
        int id = leer.nextInt();
        return id;
    }
    
    
    public void verTelefono(Telefono telefono){        
        System.out.println("Datos telefono :"+telefono);    
    }
    
    
    public void validarRegistro(Telefono telefono){            
        if (telefono==null){         
            System.out.println("No existe registro de telefono para este usuario");
        }            
     }
    
    
    public void verTelefonos(List <Telefono> telefonos){
        for (Telefono telefono : telefonos) {        
            System.out.println("Datos : " + telefono);
        }        
    }  
    
}
