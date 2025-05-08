package resol.AleE;

public class Ejercicio4 {
    public void contarVocales(String palabra) {
        int contador=0;
        
        palabra = palabra.toLowerCase();
        
        for(int i=0; i<palabra.length();i++) {
            char c=palabra.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                contador++;
            }
        }
        System.out.println("La palabra \"" + palabra + "\" tiene " + contador + " vocales.");
    }
}
