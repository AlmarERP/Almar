package almar.entidades;
// Generated 05-feb-2015 0:39:43 by Hibernate Tools 4.3.1

import almar.entidades.validaciones.Nif;
import almar.excepciones.Caption;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.validator.constraints.*;

/**
 * Cliente generated by hbm2java
 */
public class Cliente implements java.io.Serializable {

    private Integer idCliente;
    @NotBlank
    @Caption("Nif")
    @Nif
    private String nif;
    private String nombre;
    private String apellidos;
    private String telefono;
    @Email
    private String email;
    private String direccion;
    private String ciudad;
    private String provincia;
    private String cp;
    private Set pedidos = new HashSet(0);

    public Cliente() {
    }

    public Cliente(String nif, String nombre, String apellidos, String telefono, String email, String direccion, String ciudad) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public Cliente(String nif, String nombre, String apellidos, String telefono, String email, String direccion, String ciudad, String provincia, String cp, Set pedidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.cp = cp;
        this.pedidos = pedidos;
    }

    public Integer getIdCliente() {
        return this.idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return this.provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCp() {
        return this.cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Set getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion + ", ciudad=" + ciudad + ", provincia=" + provincia + ", cp=" + cp + ", pedidos=" + pedidos + '}';
    }

}
