package resol.AleE;

public class Ejercicio9 {
    public void contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            System.out.println("No se ingresó ningún texto.");
            return;
        }

        String[] palabras = texto.trim().split("[\\s\\p{Punct}]+");

        System.out.println("Cantidad de palabras: " + palabras.length);
    }
}
