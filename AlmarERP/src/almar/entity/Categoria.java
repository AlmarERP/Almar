package almar.entity;
// Generated 28-ene-2015 14:00:51 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Categoria generated by hbm2java
 */
public class Categoria  implements java.io.Serializable {


     private Byte idCategoria;
     private String nombre;
     private Set articulos = new HashSet(0);

    public Categoria() {
    }

	
    public Categoria(String nombre) {
        this.nombre = nombre;
    }
    public Categoria(String nombre, Set articulos) {
       this.nombre = nombre;
       this.articulos = articulos;
    }
   
    public Byte getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(Byte idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getArticulos() {
        return this.articulos;
    }
    
    public void setArticulos(Set articulos) {
        this.articulos = articulos;
    }




}

