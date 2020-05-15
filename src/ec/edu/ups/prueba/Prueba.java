/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.controlador.ControladorTelefono;
import ec.edu.ups.controlador.ControladorUsuario;
import ec.edu.ups.dao.DaoTelefono;
import ec.edu.ups.dao.DaoUsuario;
import ec.edu.ups.vista.VistaTelefono;
import ec.edu.ups.vista.VistaUsuario;
import java.util.Scanner;

/**
 *
 * @author Ortega
 */
public class Prueba {
    public static void main(String[] args) {
   
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
  
        VistaUsuario vistaU = new VistaUsuario();
        VistaTelefono vistaT = new VistaTelefono();
   
        DaoUsuario usuarioDao = new DaoUsuario();
        DaoTelefono telefonoDao = new DaoTelefono();

        ControladorUsuario controlUsuario = new ControladorUsuario(vistaU, vistaT, usuarioDao, telefonoDao);
        ControladorTelefono controlTelefono = new ControladorTelefono(vistaT, telefonoDao);

        int op; 

        while (salir!=true) {
            System.out.println("Agenda Telefonica");

            System.out.println("1. Registrarse ");
            System.out.println("2. Iniciar Sesion");
            System.out.println("3. Salir");
           
                System.out.println("Escoge una opcion");
                op = entrada.nextInt();
                switch (op) {
                    case 1:
                        controlUsuario.registrarUsuario();
                        break;
                    case 2:
                        boolean log,
                         sal = false;
                        controlUsuario.ingresoUsuario();
                        log = controlUsuario.isLog();
                        if (log == true) {
                            System.out.println("Inicio de sesion existoso");
                            while (sal!=true) {
                                System.out.println("1. Actualizar Datos Personales");
                                System.out.println("2. Registrar Telefono");
                                System.out.println("3. Actualizar Telefono");
                                System.out.println("4. Buscar Telefono");
                                System.out.println("5. Listar Telefonos");
                                System.out.println("6. Eliminar Telefono");
                                System.out.println("7. Eliminar Cuenta");
                                System.out.println("8. Cerrar Sesion");
                                    System.out.println("Escoge una opcion");
                                    int op2 = entrada.nextInt();
                                    switch (op2) {
                                        case 1:
                                            controlUsuario.actualizarUsuario();
                                            break;
                                        case 2:
                                            controlTelefono.registrarTelefono();
                                            controlUsuario.agregarTelefono();
                                            break;
                                        case 3:
                                            controlTelefono.actualizarTelefono();
                                            break;
                                        case 4:
                                            controlTelefono.verTelefono();
                                            break;
                                        case 5:
                                            controlTelefono.verTelefonos();
                                            break;
                                        case 6:
                                            controlTelefono.eliminarTelefono();
                                            break;
                                        case 7:
                                            controlUsuario.eliminarUsuario();
                                            break;
                                        case 8:
                                            sal = true;
                                            break;
                                    }
                            }
                        }
                        break;
                    case 3:
                        salir = true;
                        break;
                }
        }
    }

}
