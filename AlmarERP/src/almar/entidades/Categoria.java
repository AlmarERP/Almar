package almar.entidades;
// Generated 05-feb-2015 0:39:43 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.Size;
/**
 * Categoria generated by hbm2java
 */
public class Categoria implements java.io.Serializable {

    private Integer idCategoria;
    @Size(min = 2, max = 20)
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

    public Categoria(Integer idCategoria, String nombre) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
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

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombre=" + nombre + ", articulos=" + articulos + '}';
    }

}
