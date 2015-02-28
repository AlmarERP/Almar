package almar.listmodels;

import almar.entidades.Articulo;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Alberto
 */
public class ArticulosListModel extends DefaultListModel {

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
        Articulo temp = (Articulo) datos.get(index);
        String cadena = temp.getIdArticulo() + "-" + temp.getNombre();
        return cadena;

    }

}
