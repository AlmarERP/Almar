package almar.controlador;

import almar.entidades.Cliente;
import almar.persistencia.dao.ClienteDAO;
import almar.persistencia.dao.ClienteDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class ClienteController {

    ClienteDAO clienteDAO;

    public ClienteController() {
        clienteDAO = new ClienteDAOImplHibernate();
    }

    public void guardar(Cliente cliente) throws BussinessException {
        clienteDAO.saveOrUpdate(cliente);
    }

    public void eliminar(Cliente cliente) throws BussinessException {
        clienteDAO.delete(cliente.getIdCliente());
    }

    public void eliminarPorId(int i) throws BussinessException {
        clienteDAO.delete(i);
    }

    public Cliente buscarPorId(int id) throws BussinessException {
        return (Cliente) clienteDAO.get(id);
    }

    public List listaClientes() throws BussinessException {
        return clienteDAO.findAll();
    }

}
