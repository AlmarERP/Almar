package pruebas;

import almar.controlador.EmpleadoController;
import almar.excepciones.BussinessException;
import almar.excepciones.BussinessMessage;
import hibernate.util.HibernateUtil;

public class Main {

    public static void main(String[] args) {

        HibernateUtil.buildSessionFactory();

        try {
            HibernateUtil.openSessionAndBindToThread();

            EmpleadoController empleadoController = new EmpleadoController();
            //Empleado empleado = new Empleado("44453838J", "Alberto", "García Olivero", "639333905", "Av. Novo Mesoiro", "A Coruña", "A Coruña", "15190", "albertogodeveloper@gmail.com", true, null, null);
            //empleadoController.guardar(empleado);
            //empleadoController.eliminarPorId(3);
            System.out.println(empleadoController.listaEmpleados().size());

        } catch (BussinessException be) {
            System.out.println("No se ha podido guardar el empleado.Se han producido los siguientes errores:");
            for (BussinessMessage bussinessMessage : be.getBussinessMessages()) {
                System.out.println(bussinessMessage.toString());
            }
        } finally {
            HibernateUtil.closeSessionAndUnbindFromThread();
        }

        HibernateUtil.closeSessionFactory();
    }
}
