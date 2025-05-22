package resol.AleE;

import java.util.Scanner;

public class Ejercicio11 {
    
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void mostrarSerie() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos de la serie Fibonacci querés mostrar? ");
        int cantidad = sc.nextInt();

        System.out.println("Serie de Fibonacci hasta el término " + cantidad + ":");
        for (int i = 1; i <= cantidad; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
sc.close();  }
}
