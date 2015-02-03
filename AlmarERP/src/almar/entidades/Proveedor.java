package almar.entidades;
// Generated 02-feb-2015 23:52:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer idProveedor;
     private String cif;
     private String nombre;
     private String telefono;
     private String email;
     private String direccion;
     private String ciudad;
     private String provincia;
     private String cp;
     private Set articulos = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String cif, String nombre, String telefono, String email, String direccion, String ciudad) {
        this.cif = cif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    public Proveedor(String cif, String nombre, String telefono, String email, String direccion, String ciudad, String provincia, String cp, Set articulos) {
       this.cif = cif;
       this.nombre = nombre;
       this.telefono = telefono;
       this.email = email;
       this.direccion = direccion;
       this.ciudad = ciudad;
       this.provincia = provincia;
       this.cp = cp;
       this.articulos = articulos;
    }
   
    public Integer getIdProveedor() {
        return this.idProveedor;
    }
    
    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getCif() {
        return this.cif;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public Set getArticulos() {
        return this.articulos;
    }
    
    public void setArticulos(Set articulos) {
        this.articulos = articulos;
    }




}

