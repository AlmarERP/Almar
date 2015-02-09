package almar.controlador;

import almar.entidades.Pedido;
import almar.persistencia.dao.PedidoDAO;
import almar.persistencia.dao.PedidoDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class PedidoController {

    PedidoDAO pedidoDAO;

    public PedidoController() {
        pedidoDAO = new PedidoDAOImplHibernate();
    }

    public void guardar(Pedido pedido) throws BussinessException {
        pedidoDAO.saveOrUpdate(pedido);
    }

    public void eliminar(Pedido pedido) throws BussinessException {
        pedidoDAO.delete(pedido.getIdPedido());
    }

    public void eliminarPorId(int i) throws BussinessException {
        pedidoDAO.delete(i);
    }

    public Pedido buscarPorId(int id) throws BussinessException {
        return (Pedido) pedidoDAO.get(id);
    }

    public List listaPedidos() throws BussinessException {
        return pedidoDAO.findAll();
    }

}
