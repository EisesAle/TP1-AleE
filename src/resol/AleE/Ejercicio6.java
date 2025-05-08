package resol.AleE;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio6 {
    public void jugarAdivinaNumero() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int intentosRealizados = 0;

        System.out.println("¡Adivina el número secreto entre 1 y 100!");

        do {
            System.out.println("Tu intento: ");
            intento = sc.nextInt();
            intentosRealizados++;

            if(intento < numeroSecreto) {
                System.out.println("Mas alto.");
            } else if (intento > numeroSecreto) {
                System.out.println("Mas bajo.");
            } else {
                System.out.println("¡Correcto! Adivinaste en " + intentosRealizados + " Intentos.");
            }
        } while (intento != numeroSecreto);
    
    sc.close();}
}
