package almar.entidades;
// Generated 02-feb-2015 23:52:32 by Hibernate Tools 4.3.1

import almar.excepciones.Caption;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Empleado generated by hbm2java
 */
public class Empleado implements java.io.Serializable {

    private Integer idEmpleado;
    @NotBlank
    @Caption("Nif")
    private String nif;
    @NotBlank
    @Caption("Nombre")
    private String nombre;
    @NotBlank
    @Caption("Apellidos")
    private String apellidos;
    @NotBlank
    @Caption("Telefono")
    private String telefono;
    @NotBlank
    @Caption("Direccion")
    private String direccion;
    @NotBlank
    @Caption("Ciudad")
    private String ciudad;
    private String provincia;
    private String cp;
    @NotBlank
    @Caption("Email")
    private String email;
    private boolean estado;
    private Set usuarios = new HashSet(0);
    private Set pedidos = new HashSet(0);

    public Empleado() {
    }

    public Empleado(String nif, String nombre, String apellidos, String telefono, String direccion, String ciudad, String email, boolean estado) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.email = email;
        this.estado = estado;
    }

    public Empleado(String nif, String nombre, String apellidos, String telefono, String direccion, String ciudad, String provincia, String cp, String email, boolean estado, Set usuarios, Set pedidos) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.cp = cp;
        this.email = email;
        this.estado = estado;
        this.usuarios = usuarios;
        this.pedidos = pedidos;
    }

    public Integer getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Set getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

    public Set getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", ciudad=" + ciudad + ", provincia=" + provincia + ", cp=" + cp + ", email=" + email + ", estado=" + estado + ", usuarios=" + usuarios + ", pedidos=" + pedidos + '}';
    }

}