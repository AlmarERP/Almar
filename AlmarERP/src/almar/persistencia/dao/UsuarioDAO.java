package almar.persistencia.dao;

import almar.entidades.Usuario;
import almar.excepciones.BussinessException;
import hibernate.dao.GenericDAO;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer> {

    public Usuario buscarPorLogin(String nombre, String password) throws BussinessException;
}
