/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

import datos.Conexion;
import datos.UsuarioDAO;
import datos.UsuarioDaoJDBC;
import dominio.UsuarioDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Emily Barrientos
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Connection conexion = null;
         System.out.println("DENTRO");
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioDTO usr = new UsuarioDTO();
            usr.setNombre("uno");
            usr.setPassword("clave");
            
            
            UsuarioDAO usuarioDao = new UsuarioDaoJDBC(conexion);

            usuarioDao.insert(usr);
            
            
            
            List<UsuarioDTO> usuarios = usuarioDao.select();

            for (UsuarioDTO usuario : usuarios) {
                System.out.println("Usuario DTO:" + usuario);
            }

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        System.out.println("Fin del programa");
    }
        
//        Connection conexion = null;
//        try {
//            conexion = Conexion.getConnection();
//            System.out.println("SE HA CONECTADO");
//            //el autocommit por default es true, lo pasamos a false
//            if (conexion.getAutoCommit()) {
//                conexion.setAutoCommit(false);
//            }
//
//            UsuarioDaoJDBC UsuarioDaoJDBC = new UsuarioDaoJDBC(conexion) {};
//            
//            List<UsuarioDTO> usuarios = UsuarioDaoJDBC.select();
//            
//         for(UsuarioDTO usuario : usuarios){
//             System.out.println("Uuario DTO:"+ usuario);
//            
//        }
//         conexion.commit();
//            System.out.println("Se ha hecho commit de la transaccion");
//        } catch (SQLException ex) {
//            ex.printStackTrace(System.out);
//            System.out.println("Entramos al rollback");
//            try {
//                conexion.rollback();
//            } catch (SQLException ex1) {
//                ex1.printStackTrace(System.out);
//            }
//    }
    
    
}
