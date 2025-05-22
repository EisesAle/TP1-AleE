package resol.AleE;

import java.util.Scanner;

public class Ejercicio12 {

    public void manejarArreglo() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        System.out.println("\nNúmeros ordenados de mayor a menor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
sc.close(); }
}