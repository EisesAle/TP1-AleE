package resol.AleE;

import java.util.Scanner;

public class Ejercicio7 {
    public void mostrarMenu() {
        Scanner sc= new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n-- Menú de operaciones ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.println("Elige una opción: ");
            opcion = sc.nextInt();
        
            if(opcion == 0) {
                System.out.println("Saliendo del menu...");
                break;
            }
            System.out.println("Ingresa el primer número: ");
            double num1=sc.nextDouble();

            System.out.println("Ingresa el segundo número: ");
            double num2=sc.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1/num2));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion != 0);
sc.close(); }   
}
