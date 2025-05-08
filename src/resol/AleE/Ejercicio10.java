package resol.AleE;

public class Ejercicio10 {
    public void validarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;

        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                digitos++;
            }
        }

        if (mayusculas >= 2 && minusculas >= 3 && digitos >= 2) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña NO es segura.");
            System.out.println("- Mayúsculas: " + mayusculas + " (mínimo 2)");
            System.out.println("- Minúsculas: " + minusculas + " (mínimo 3)");
            System.out.println("- Dígitos: " + digitos + " (mínimo 2)");
        }
    }
}
