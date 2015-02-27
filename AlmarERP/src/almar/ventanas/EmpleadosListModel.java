package almar.ventanas;

import almar.entidades.Empleado;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author dam105
 */
public class EmpleadosListModel extends DefaultListModel {

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
        Empleado temp = (Empleado)datos.get(index);
        String cadena = temp.getNombre()+" "+temp.getApellidos();
        return cadena;

    }

}
