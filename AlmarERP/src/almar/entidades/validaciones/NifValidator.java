package almar.entidades.validaciones;

import javax.swing.JOptionPane;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NifValidator implements ConstraintValidator<Nif, String> {

    public static String letraCorrecta;

    @Override
    public void initialize(Nif constraintAnnotation) {
    }

    @Override
    public boolean isValid(String nif, ConstraintValidatorContext context) {

        if (nif.isEmpty()) {
            System.out.println("Nif Vacio");
            return false;
        } else if (nif.length() < 8 || nif.length() > 9) {
            System.out.println("Nif Tamaño Incorrecto");
            return false;
        } else {
            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            int valor = 0;
            if (nif.length() == 8) {
                if (nif.startsWith("X")) {
                    //Es un NIE
                    System.out.println("Es un NIE X");
                    valor = Integer.parseInt(nif.substring(1, nif.length() - 1));
                } else if (nif.startsWith("Y")) {
                    //Es un NIE
                    System.out.println("Es un NIE Y");
                    valor = 10000000 + Integer.parseInt(nif.substring(1, nif.length() - 1));
                } else if (nif.startsWith("Z")) {
                    //Es un NIE
                    System.out.println("Es un NIE Z");
                    valor = 20000000 + Integer.parseInt(nif.substring(1, nif.length() - 1));
                } else {
                    JOptionPane.showMessageDialog(null, "Es un NIE, debe empezar por X, Y, o Z");
                    return false;
                }
            } else if (nif.length() == 9) {
                //Es un NIF
                if (Character.isAlphabetic(nif.charAt(0))) {
                    System.out.println("Un NIF no puede empezar por letra, si es NIE solo pueden ser letra + 7 números");
                    return false;
                }
                System.out.println("Es un NIF");
                valor = Integer.parseInt(nif.substring(0, nif.length() - 1));
            } else {
                return false;
            }

            letraCorrecta = "" + letras.charAt(valor % 23);

            if (nif.endsWith(letraCorrecta) == true) {
                System.out.println("NIF CORRECTO");
                //El NIF es correcto
                return true;
            } else {
                if (nif.length() == 8) {
                    JOptionPane.showMessageDialog(null, "Es un NIE, la letra correcta es: " + letraCorrecta);
                } else {
                    JOptionPane.showMessageDialog(null, "La letra correcta es: " + letraCorrecta);
                }
                // JOptionPane.showMessageDialog(null, "La letra correcta es: " + letraCorrecta);
                System.out.println("NIF ERRONEO la letra correcta es: " + letraCorrecta);
                //El NIF es erroneo
                return false;
            }
        }
    }
}
