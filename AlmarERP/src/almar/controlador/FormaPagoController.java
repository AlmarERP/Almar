package almar.controlador;

import almar.entidades.FormaPago;
import almar.persistencia.dao.FormaPagoDAO;
import almar.persistencia.dao.FormaPagoDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class FormaPagoController {

    FormaPagoDAO formaPagoDAO;

    public FormaPagoController() {
        formaPagoDAO = new FormaPagoDAOImplHibernate();
    }

    public void guardar(FormaPago formaPago) throws BussinessException {
        formaPagoDAO.saveOrUpdate(formaPago);
    }

    public void eliminar(FormaPago formaPago) throws BussinessException {
        formaPagoDAO.delete(formaPago.getIdFormaPago());
    }

    public void eliminarPorId(int i) throws BussinessException {
        formaPagoDAO.delete(i);
    }

    public FormaPago buscarPorId(int id) throws BussinessException {
        return (FormaPago) formaPagoDAO.get(id);
    }

    public List listaFormaPagos() throws BussinessException {
        return formaPagoDAO.findAll();
    }

}
