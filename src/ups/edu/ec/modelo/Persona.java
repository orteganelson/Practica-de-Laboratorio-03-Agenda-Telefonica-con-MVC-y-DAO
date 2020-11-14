/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Persona {
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private double sueldo;
    private int horasLaborales;
    
    public Persona(){
        id=-1;
        nombre="";
        apellido="";
        fechaNacimiento= new Date();
        sueldo=0;
        horasLaborales=0;
        cedula="";
    }

    public Persona(int id, String cedula, String nombre, String apellido, Date fechaNacimiento, double sueldo, int horasLaborales) {
        this.id = id;
        this.cedula=cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
        this.horasLaborales = horasLaborales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasLaborales() {
        return horasLaborales;
    }

    public void setHorasLaborales(int horasLaborales) {
        this.horasLaborales = horasLaborales;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.id;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        hash = 59 * hash + Objects.hashCode(this.apellido);
        hash = 59 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        hash = 59 * hash + this.horasLaborales;
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
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (this.horasLaborales != other.horasLaborales) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", sueldo=" + sueldo + ", horasLaborales=" + horasLaborales + '}';
    }
    
    
    
    
}
