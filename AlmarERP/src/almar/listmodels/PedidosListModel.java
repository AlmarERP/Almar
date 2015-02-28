package almar.listmodels;

import almar.entidades.Pedido;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Alberto
 */
public class PedidosListModel extends DefaultListModel {
    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
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
        Pedido temp = (Pedido) datos.get(index);
        String cadena = temp.getIdPedido() + "-" + formateador.format(temp.getFecha());
        return cadena;
    }

}
