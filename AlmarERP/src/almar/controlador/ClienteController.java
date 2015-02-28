package almar.controlador;

import almar.entidades.Cliente;
import almar.persistencia.dao.ClienteDAO;
import almar.persistencia.dao.ClienteDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import patronObserver.Subject;

public class ClienteController extends Subject {

    ClienteDAO clienteDAO;

    public ClienteController() {
        clienteDAO = new ClienteDAOImplHibernate();
    }

    public void guardar(Cliente cliente) throws BussinessException {
        clienteDAO.saveOrUpdate(cliente);
        notifyObservers();
    }

    public void eliminar(Cliente cliente) throws BussinessException {
        clienteDAO.delete(cliente.getIdCliente());
        notifyObservers();
    }

    public void eliminarPorId(int i) throws BussinessException {
        clienteDAO.delete(i);
        notifyObservers();
    }

    public Cliente buscarPorId(int id) throws BussinessException {
        return (Cliente) clienteDAO.get(id);
    }

    public List listaClientes() throws BussinessException {
        return clienteDAO.findAll();
    }

}
