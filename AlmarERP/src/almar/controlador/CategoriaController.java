package almar.controlador;

import almar.entidades.Categoria;
import almar.persistencia.dao.CategoriaDAO;
import almar.persistencia.dao.CategoriaDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class CategoriaController {

    CategoriaDAO categoriaDAO;

    public CategoriaController() {
        categoriaDAO = new CategoriaDAOImplHibernate();
    }

    public void guardar(Categoria categoria) throws BussinessException {
        categoriaDAO.saveOrUpdate(categoria);
    }

    public void eliminar(Categoria categoria) throws BussinessException {
        categoriaDAO.delete(categoria.getIdCategoria());
    }

    public void eliminarPorId(int i) throws BussinessException {
        categoriaDAO.delete(i);
    }

    public Categoria buscarPorId(int id) throws BussinessException {
        return (Categoria) categoriaDAO.get(id);
    }

    public List listaCategorias() throws BussinessException {
        return categoriaDAO.findAll();
    }

}
