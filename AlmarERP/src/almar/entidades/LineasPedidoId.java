package almar.entidades;
// Generated 05-feb-2015 0:39:43 by Hibernate Tools 4.3.1

/**
 * LineasPedidoId generated by hbm2java
 */
public class LineasPedidoId implements java.io.Serializable {

    private int idLinea;
    private int idPedido;

    public LineasPedidoId() {
    }

    public LineasPedidoId(int idPedido) {//Para probar la creación de una linea desde el form.
        this.idPedido = idPedido;
    }
    
    public LineasPedidoId(int idLinea, int idPedido) {
        this.idLinea = idLinea;
        this.idPedido = idPedido;
    }

    public int getIdLinea() {
        return this.idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public int getIdPedido() {
        return this.idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public boolean equals(Object other) {
        if ((this == other)) {
            return true;
        }
        if ((other == null)) {
            return false;
        }
        if (!(other instanceof LineasPedidoId)) {
            return false;
        }
        LineasPedidoId castOther = (LineasPedidoId) other;

        return (this.getIdLinea() == castOther.getIdLinea())
                && (this.getIdPedido() == castOther.getIdPedido());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getIdLinea();
        result = 37 * result + this.getIdPedido();
        return result;
    }

    @Override
    public String toString() {
        return ""+idLinea;
    }

}
