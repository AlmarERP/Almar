package almar.controlador;

import almar.entidades.LineasPedido;
import almar.entidades.LineasPedidoId;
import almar.persistencia.dao.LineasPedidoDAO;
import almar.persistencia.dao.LineasPedidoDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import patronObserver.Subject;

public class LineasPedidoController extends Subject {

    LineasPedidoDAO lineasPedidoDAO;

    public LineasPedidoController() {
        lineasPedidoDAO = new LineasPedidoDAOImplHibernate();
    }

    public void guardar(LineasPedido lineasPedido) throws BussinessException {
        lineasPedidoDAO.saveOrUpdate(lineasPedido);
        notifyObservers();
    }

    public void eliminar(LineasPedidoId lineasPedidoId) throws BussinessException {
        lineasPedidoDAO.delete(lineasPedidoId.getIdLinea());//Revisar...
        notifyObservers();
    }

    public void eliminarPorId(int i) throws BussinessException {
        lineasPedidoDAO.delete(i);
        notifyObservers();
    }

    public LineasPedido buscarPorId(int id) throws BussinessException {
        return (LineasPedido) lineasPedidoDAO.get(id);
    }

    public List listaLineasPedidos() throws BussinessException {
        return lineasPedidoDAO.findAll();
    }

}
