package almar.controlador;

import almar.entidades.Empleado;
import almar.persistencia.dao.EmpleadoDAO;
import almar.persistencia.dao.EmpleadoDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class EmpleadoController {

    EmpleadoDAO empleadoDAO;

    public EmpleadoController() {
        empleadoDAO = new EmpleadoDAOImplHibernate();
    }

    public void guardar(Empleado empleado) throws BussinessException {
        empleadoDAO.saveOrUpdate(empleado);
    }

    public void eliminar(Empleado empleado) throws BussinessException {
        empleadoDAO.delete(empleado.getIdEmpleado());
    }

    public void eliminarPorId(int i) throws BussinessException {
        empleadoDAO.delete(i);
    }

    public Empleado buscarPorId(int id) throws BussinessException {
        return (Empleado) empleadoDAO.get(id);
    }

    public List listaEmpleados() throws BussinessException {
        return empleadoDAO.findAll();
    }

}
