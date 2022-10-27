/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Emily Barrientos
 */
public class UsuarioDTO {
    private int Id;
    private String nombre;
    private String correo;
    private String password;
    
        public UsuarioDTO() {
    }

    public UsuarioDTO(int Id) {
        this.Id = Id;
    }
    
    public UsuarioDTO(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }
    
    public UsuarioDTO(int Id, String nombre, String correo, String password) {
        this.Id = Id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }
    
    

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "Id=" + Id + ", nombre=" + nombre + ", correo=" + correo + ", password=" + password + '}';
    }
    
}
