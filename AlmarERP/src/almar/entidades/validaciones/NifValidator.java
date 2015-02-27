package almar.entidades.validaciones;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NifValidator implements ConstraintValidator<Nif, String> {

    @Override
    public void initialize(Nif constraintAnnotation) {
    }

    @Override
    public boolean isValid(String nif, ConstraintValidatorContext context) {
        if (nif.isEmpty()) {
            System.out.println("Nif Vacio");
            return false;
        }
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int valor;

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
            //Es un NIF
            System.out.println("Es un NIF");
            valor = Integer.parseInt(nif.substring(0, nif.length() - 1));
        }

        String letraCorrecta = "" + letras.charAt(valor % 23);

        if (nif.endsWith(letraCorrecta) == true) {
            System.out.println("NIF CORRECTO");
            //El NIF es correcto
            return true;
        } else {

            System.out.println("NIF ERRONEO la letra correcta es: " + letraCorrecta);
            //El NIF es erroneo
            return false;
        }

    }
}
