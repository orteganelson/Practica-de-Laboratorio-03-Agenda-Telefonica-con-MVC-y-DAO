/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controladores;

import java.util.ArrayList;
import java.util.List;
import ups.edu.ec.modelo.Persona;

/**
 *
 * @author Usuario
 */
public class ControladorPersona {
    private List<Persona> personaList;
    
    public ControladorPersona(){
        this.personaList=new ArrayList();
    }
    
    public ControladorPersona(List<Persona> personaList){
        this.personaList=personaList;
    }
    
    public List<Persona> getPersonaList(){
        return personaList;
    }
    
    
    
    
    
    
}
