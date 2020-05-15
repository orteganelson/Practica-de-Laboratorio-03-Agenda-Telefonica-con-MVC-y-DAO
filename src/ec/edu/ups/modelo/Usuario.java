/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Ortega
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasena;
    
    private List <Telefono >telefonos;
    
    public Usuario(){        
    }

    public Usuario(String cedula, String nombre, String apellido,
            String correo, String contrasena) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        
        telefonos=new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void agregarTelefono(Telefono telefono){
        telefonos.add(telefono);
    }
    
    public void actualizarTelefono(Telefono telefono){       
        if (telefonos.contains(telefono)){
             int in = telefonos.indexOf(telefono);
            telefonos.set(in, telefono);
        }
    }
    
    public void eliminarTelefono(Telefono telefono){
         if (telefonos.contains(telefono)){             
            int in = telefonos.indexOf(telefono);
            telefonos.remove(in);  
        }    
    }
    public  List<Telefono>listar(){
        return telefonos;
    }    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre +
                ", apellido=" + apellido + ", correo=" + correo +
                ", contrasena=" + contrasena + '}';
    }
    
    
    
    
    
}
