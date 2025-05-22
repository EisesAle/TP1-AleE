package resol.AleE;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio12 {
    public void manejarArreglo() {
        Scanner sc = new Scanner(System.in);
        Integer[] numeros = new Integer[5];

        System.out.println("Ingresá 5 números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        Integer[] numerosOrdenados = Arrays.copyOf(numeros, numeros.length);
        
        Arrays.sort(numerosOrdenados, Collections.reverseOrder());

        System.out.println("\nNúmeros ingresados:");
        System.out.println(Arrays.toString(numeros));

        System.out.println("Números ordenados de mayor a menor:");
        System.out.println(Arrays.toString(numerosOrdenados));
sc.close();  }
}
