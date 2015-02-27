package almar.controlador;

import almar.entidades.Usuario;
import almar.persistencia.dao.UsuarioDAO;
import almar.persistencia.dao.UsuarioDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;
import patronObserver.Subject;

public class UsuarioController extends Subject {

    UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAOImplHibernate();
    }

    public void guardar(Usuario usuario) throws BussinessException {
        usuarioDAO.saveOrUpdate(usuario);
        notifyObservers();
    }

    public void eliminar(Usuario usuario) throws BussinessException {
        usuarioDAO.delete(usuario.getIdUsuario());
        notifyObservers();
    }

    public void eliminarPorId(int i) throws BussinessException {
        usuarioDAO.delete(i);
        notifyObservers();
    }

    public Usuario buscarPorId(int id) throws BussinessException {
        return (Usuario) usuarioDAO.get(id);
    }

    public List listaUsuarios() throws BussinessException {
        return usuarioDAO.findAll();
    }

    public Usuario buscarPorLogin(String username, String password) throws BussinessException {
        return usuarioDAO.buscarPorLogin(username, password);
    }
}
