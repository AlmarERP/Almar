package almar.controlador;

import almar.entidades.Articulo;
import almar.persistencia.dao.ArticuloDAO;
import almar.persistencia.dao.ArticuloDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import java.util.ListIterator;
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
    //Buscar orquesta por nombre y pasarle el indice donde se encuentra:
    public int buscarArticulo(List listaArticulos,String nomArticulo) throws BussinessException {
        ListIterator<Articulo> it = listaArticulos.listIterator();
        Articulo temp;
        int indice;
        while (it.hasNext()) {
            indice = it.nextIndex();
            temp = it.next();
            
            if (temp.getNombre().toLowerCase().contains(nomArticulo.toLowerCase())) {
                return indice;
            }
        }
        return -1;
    }
}
