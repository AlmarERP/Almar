package almar.listmodels;

import almar.entidades.Cliente;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Alberto
 */
public class ClientesListModel extends DefaultListModel {

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
        Cliente temp = (Cliente) datos.get(index);
        String cadena = temp.getNombre() + " " + temp.getApellidos();
        return cadena;

    }

}
