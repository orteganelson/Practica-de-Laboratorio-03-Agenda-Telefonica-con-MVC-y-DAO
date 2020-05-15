/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;


import ec.edu.ups.idao.IDaoUsuario;
import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Ortega
 */
public class DaoUsuario implements IDaoUsuario{
    private  List <Usuario> listaUsuario;

    public DaoUsuario() {
        listaUsuario=new ArrayList<>();
    }

    @Override
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    @Override
    public Usuario read(String correo, String contra) {
         for (Usuario usuario : listaUsuario) {
            if (usuario.getCorreo().equals(correo)&&usuario.getContrasena().equals(contra)) {
                return usuario;
            }
        }
        return null;
        
    }

    @Override
    public void update(Usuario usuario) {
          for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = listaUsuario.get(i);
            if (u.getCedula().equals(usuario.getCedula())) {
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }

    @Override
    public void delete(Usuario usuario) {
        Iterator<Usuario> it = listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario u = it.next();
            if (u.getCedula().equals(usuario.getCedula())) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Usuario> findAll() {
        return listaUsuario;
        
    }
}
