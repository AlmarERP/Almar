package almar.persistencia.dao;

import almar.entidades.Usuario;
import almar.excepciones.BussinessException;
import hibernate.dao.GenericDAOImplHibernate;
import hibernate.util.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UsuarioDAOImplHibernate extends GenericDAOImplHibernate<Usuario, Integer> implements UsuarioDAO {

    SessionFactory sessionFactory;

    private final static Logger LOGGER = Logger.getLogger(UsuarioDAOImplHibernate.class.getName());

    public UsuarioDAOImplHibernate() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public Usuario buscarPorLogin(String nombre, String password) throws BussinessException {
        Session session = sessionFactory.getCurrentSession();

        Usuario usuario = null;

        try {
            session.beginTransaction();
            Query query = session.createQuery("FROM Usuario u WHERE u. nombre = :nombreUsuario AND u. password = :password");
            query.setParameter("nombreUsuario", nombre);
            query.setParameter("password", password);

            usuario = (Usuario) query.uniqueResult();
            return usuario;
        } catch (javax.validation.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new BussinessException(cve);
        } catch (org.hibernate.exception.ConstraintViolationException cve) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new BussinessException(cve);
        } catch (org.hibernate.exception.JDBCConnectionException cve) {//Para la excepción de conexión a la bd.
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new BussinessException(cve);
        } catch (RuntimeException ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw ex;
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                LOGGER.log(Level.WARNING, "Falló al hacer un rollback", exc);
            }
            throw new RuntimeException(ex);
        }
    }

}
