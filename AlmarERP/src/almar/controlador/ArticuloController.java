package almar.controlador;

import almar.entidades.Articulo;
import almar.persistencia.dao.ArticuloDAO;
import almar.persistencia.dao.ArticuloDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import patronObserver.Subject;

public class ArticuloController extends Subject {

    ArticuloDAO articuloDAO;

    public ArticuloController() {
        articuloDAO = new ArticuloDAOImplHibernate();
    }

    public void guardar(Articulo articulo) throws BussinessException {
        articuloDAO.saveOrUpdate(articulo);
        notifyObservers();
    }

    public void eliminar(Articulo articulo) throws BussinessException {
        articuloDAO.delete(articulo.getIdArticulo());
        notifyObservers();
    }

    public void eliminarPorId(int i) throws BussinessException {
        articuloDAO.delete(i);
        notifyObservers();
    }

    public Articulo buscarPorId(int id) throws BussinessException {
        return (Articulo) articuloDAO.get(id);
    }

    public List listaArticulos() throws BussinessException {
        return articuloDAO.findAll();
    }

}
