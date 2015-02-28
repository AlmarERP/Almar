package almar.controlador;

import almar.entidades.Pedido;
import almar.persistencia.dao.PedidoDAO;
import almar.persistencia.dao.PedidoDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import patronObserver.Subject;

public class PedidoController extends Subject {

    PedidoDAO pedidoDAO;

    public PedidoController() {
        pedidoDAO = new PedidoDAOImplHibernate();
    }

    public void guardar(Pedido pedido) throws BussinessException {
        pedidoDAO.saveOrUpdate(pedido);
        notifyObservers();
    }

    public void eliminar(Pedido pedido) throws BussinessException {
        pedidoDAO.delete(pedido.getIdPedido());
        notifyObservers();
    }

    public void eliminarPorId(int i) throws BussinessException {
        pedidoDAO.delete(i);
        notifyObservers();
    }

    public Pedido buscarPorId(int id) throws BussinessException {
        return (Pedido) pedidoDAO.get(id);
    }

    public List listaPedidos() throws BussinessException {
        return pedidoDAO.findAll();
    }

}
