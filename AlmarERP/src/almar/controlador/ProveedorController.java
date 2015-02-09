package almar.controlador;

import almar.entidades.Proveedor;
import almar.persistencia.dao.ProveedorDAO;
import almar.persistencia.dao.ProveedorDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class ProveedorController {

    ProveedorDAO proveedorDAO;

    public ProveedorController() {
        proveedorDAO = new ProveedorDAOImplHibernate();
    }

    public void guardar(Proveedor proveedor) throws BussinessException {
        proveedorDAO.saveOrUpdate(proveedor);
    }

    public void eliminar(Proveedor proveedor) throws BussinessException {
        proveedorDAO.delete(proveedor.getIdProveedor());
    }

    public void eliminarPorId(int i) throws BussinessException {
        proveedorDAO.delete(i);
    }

    public Proveedor buscarPorId(int id) throws BussinessException {
        return (Proveedor) proveedorDAO.get(id);
    }

    public List listaProveedors() throws BussinessException {
        return proveedorDAO.findAll();
    }

}
