package almar.entity;
// Generated 28-ene-2015 14:00:51 by Hibernate Tools 4.3.1



/**
 * LineasPedidoId generated by hbm2java
 */
public class LineasPedidoId  implements java.io.Serializable {


     private byte idLinea;
     private byte idPedido;

    public LineasPedidoId() {
    }

    public LineasPedidoId(byte idLinea, byte idPedido) {
       this.idLinea = idLinea;
       this.idPedido = idPedido;
    }
   
    public byte getIdLinea() {
        return this.idLinea;
    }
    
    public void setIdLinea(byte idLinea) {
        this.idLinea = idLinea;
    }
    public byte getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(byte idPedido) {
        this.idPedido = idPedido;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof LineasPedidoId) ) return false;
		 LineasPedidoId castOther = ( LineasPedidoId ) other; 
         
		 return (this.getIdLinea()==castOther.getIdLinea())
 && (this.getIdPedido()==castOther.getIdPedido());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdLinea();
         result = 37 * result + this.getIdPedido();
         return result;
   }   


}

