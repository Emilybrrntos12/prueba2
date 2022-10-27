/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import dominio.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Emily Barrientos
 */
public interface UsuarioDAO {
    
    public List<UsuarioDTO> select() throws SQLException;
   public int insert(UsuarioDTO usuario) throws SQLException;
   public int update(UsuarioDTO usuario) throws SQLException;
   public int delete(UsuarioDTO usuario) throws SQLException;
}
