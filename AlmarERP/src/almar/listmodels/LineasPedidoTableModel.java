package almar.listmodels;

import almar.entidades.LineasPedido;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Alberto
 */
public class LineasPedidoTableModel extends AbstractTableModel {

    Set lista;
    final String[] nombreColumnas = {"Artículo",
        "Cantidad",
        "Precio Unidad",
        "Precio Total"};

    public void cargar(Set lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public int getSize() {
        return lista.size();
    }
    
    //retornamos el elemento indicado
    @Override
    public String getColumnName(int col) {
        return nombreColumnas[col];
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineasPedido temp = (LineasPedido) lista.toArray()[rowIndex];
        switch (columnIndex) {
            case 0:
                return temp.getArticulo().getNombre();
            case 1:
                return temp.getNumArticulos();
            case 2:
                return temp.getArticulo().getPrecio();
            case 3:
                return temp.getArticulo().getPrecio() * temp.getNumArticulos();
            default:
                throw new AssertionError();
        }
    }
//    /*
//     * No tienes que implementar este método a menos que
//     * los datos de tu tabla cambien
//     */
//
//    @Override
//    public void setValueAt(Object value, int row, int col) {
//        System.out.println("Value= "+value.toString()+" Fila= "+row+" Columna= "+col);
//        fireTableCellUpdated(row, col);
//    }
//    /*
//     * No tienes que implementar este método a menos que
//     * las celdas de tu tabla sean Editables
//     */
//
//    @Override
//    public boolean isCellEditable(int row, int col) {
//        return true;
//    }
    /*
     * Este metodo sirve para determinar el editor predeterminado
     * para cada columna de celdas
     */

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
