package almar.listmodels;

import almar.entidades.Proveedor;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Alberto
 */
public class ProveedoresListModel extends DefaultListModel {

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
        Proveedor temp = (Proveedor) datos.get(index);
        String cadena = temp.getNombre();
        return cadena;

    }

}
