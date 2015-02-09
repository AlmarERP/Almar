package almar.controlador;

import almar.entidades.LineasPedido;
import almar.entidades.LineasPedidoId;
import almar.persistencia.dao.LineasPedidoDAO;
import almar.persistencia.dao.LineasPedidoDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class LineasPedidoController {

    LineasPedidoDAO lineasPedidoDAO;

    public LineasPedidoController() {
        lineasPedidoDAO = new LineasPedidoDAOImplHibernate();
    }

    public void guardar(LineasPedido lineasPedido) throws BussinessException {
        lineasPedidoDAO.saveOrUpdate(lineasPedido);
    }

    public void eliminar(LineasPedido lineasPedido) throws BussinessException {
        lineasPedidoDAO.delete(lineasPedido.getId());
    }

    public void eliminarPorId(int i) throws BussinessException {
        lineasPedidoDAO.delete(i);
    }

    public LineasPedido buscarPorId(int id) throws BussinessException {
        return (LineasPedido) lineasPedidoDAO.get(id);
    }

    public List listaLineasPedidos() throws BussinessException {
        return lineasPedidoDAO.findAll();
    }

}
