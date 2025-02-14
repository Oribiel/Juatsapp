/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
/**
 *
 * @author filor
 */
public class UsuarioColeccion {
    private ObjectId id;
    private String usuario;
    private String contraseña;
    private String telefono;
    private String sexo;
    private DireccionColeccion direccion;
    private Date fechaNacimiento;
    private String fotoPerfil;
    private List<String> contactos;

    public UsuarioColeccion() {
    }

    public UsuarioColeccion(String usuario, String contraseña, String telefono, String sexo, DireccionColeccion direccion, Date fechaNacimiento, String fotoPerfil) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.sexo = sexo;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fotoPerfil = fotoPerfil;
    }

    public UsuarioColeccion(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
        
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public DireccionColeccion getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionColeccion direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public List<String> getContactos() {
        return contactos;
    }

    public void setContactos(List<String> contactos) {
        this.contactos = contactos;
    }

    

    @Override
    public String toString() {
        return "UsuarioColeccion{" + "id=" + id + ", usuario=" + usuario + ", telefono=" + telefono + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
