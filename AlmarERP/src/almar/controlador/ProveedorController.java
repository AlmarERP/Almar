package almar.controlador;

import almar.entidades.Proveedor;
import almar.persistencia.dao.ProveedorDAO;
import almar.persistencia.dao.ProveedorDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import patronObserver.Subject;

public class ProveedorController extends Subject {

    ProveedorDAO proveedorDAO;

    public ProveedorController() {
        proveedorDAO = new ProveedorDAOImplHibernate();
    }

    public void guardar(Proveedor proveedor) throws BussinessException {
        proveedorDAO.saveOrUpdate(proveedor);
        notifyObservers();
    }

    public void eliminar(Proveedor proveedor) throws BussinessException {
        proveedorDAO.delete(proveedor.getIdProveedor());
        notifyObservers();
    }

    public void eliminarPorId(int i) throws BussinessException {
        proveedorDAO.delete(i);
        notifyObservers();
    }

    public Proveedor buscarPorId(int id) throws BussinessException {
        return (Proveedor) proveedorDAO.get(id);
    }

    public List listaProveedores() throws BussinessException {
        return proveedorDAO.findAll();
    }

}
