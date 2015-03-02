package almar.listmodels;

import almar.entidades.LineasPedido;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Alberto
 */
public class LineasPedidoListModel extends DefaultListModel {

    List datos;

    public void cargar(List lista) {
        datos = lista;
        this.fireContentsChanged(this, 0, size());
    }

    public int getSize() {
        return datos.size();

    }

    //que datos??
    @Override
    public Object getElementAt(int index) {
        LineasPedido temp = (LineasPedido) datos.get(index);
        String cadena = "Artículo: " + temp.getArticulo().getNombre() + "; Cantidad: " + temp.getNumArticulos() + "; Precio: " + temp.getArticulo().getPrecio() + "; Total: " + temp.getArticulo().getPrecio() * temp.getNumArticulos();
        return cadena;
    }

}
