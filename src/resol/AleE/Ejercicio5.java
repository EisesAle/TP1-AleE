package resol.AleE;

public class Ejercicio5 {
    public void verificarPalindromo(String palabra) {
        palabra = palabra.toLowerCase();
        int izquierda = 0;
        int derecha = palabra.length() - 1;

        boolean esPalindromo = true;

        while(izquierda < derecha) {
            if(palabra.charAt(izquierda)!= palabra.charAt(derecha)) {
                esPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }
        if(esPalindromo) {
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }
    }
}
