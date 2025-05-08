package resol.AleE;

import java.util.Scanner;

public class Ejercicio8 {
    public void convertirTemperatura() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("\n--- Conversor de Temperatura ---");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa la temperatura en Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " °C son " + fahrenheit + " °F.");
                break;

            case 2:
                System.out.print("Ingresa la temperatura en Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " °F son " + celsius + " °C.");
                break;

            default:
                System.out.println("Opción no válida.");
        }
sc.close();  }
}
