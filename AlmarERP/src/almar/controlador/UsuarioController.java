package almar.controlador;

import almar.entidades.Usuario;
import almar.persistencia.dao.UsuarioDAO;
import almar.persistencia.dao.UsuarioDAOImplHibernate;
import almar.excepciones.BussinessException;
import java.util.List;

public class UsuarioController {

    UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAOImplHibernate();
    }

    public void guardar(Usuario usuario) throws BussinessException {
        usuarioDAO.saveOrUpdate(usuario);
    }

    public void eliminar(Usuario usuario) throws BussinessException {
        usuarioDAO.delete(usuario.getIdUsuario());
    }

    public void eliminarPorId(int i) throws BussinessException {
        usuarioDAO.delete(i);
    }

    public Usuario buscarPorId(int id) throws BussinessException {
        return (Usuario) usuarioDAO.get(id);
    }

    public List listaUsuarios() throws BussinessException {
        return usuarioDAO.findAll();
    }

}
