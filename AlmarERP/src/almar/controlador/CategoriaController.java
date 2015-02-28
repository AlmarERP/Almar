package almar.controlador;

import almar.entidades.Categoria;
import almar.persistencia.dao.CategoriaDAO;
import almar.persistencia.dao.CategoriaDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import patronObserver.Subject;

public class CategoriaController extends Subject {

    CategoriaDAO categoriaDAO;

    public CategoriaController() {
        categoriaDAO = new CategoriaDAOImplHibernate();
    }

    public void guardar(Categoria categoria) throws BussinessException {
        categoriaDAO.saveOrUpdate(categoria);
        notifyObservers();
    }

    public void eliminar(Categoria categoria) throws BussinessException {
        categoriaDAO.delete(categoria.getIdCategoria());
        notifyObservers();
    }

    public void eliminarPorId(int i) throws BussinessException {
        categoriaDAO.delete(i);
        notifyObservers();
    }

    public Categoria buscarPorId(int id) throws BussinessException {
        return (Categoria) categoriaDAO.get(id);
    }

    public List listaCategorias() throws BussinessException {
        return categoriaDAO.findAll();
    }

}
