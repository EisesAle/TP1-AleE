package resol.AleE;

import java.util.ArrayList;

public class Ejercicio14 {

    public void ejecutar() {
        int[][] original = {
            {1, 2, 0, 3, 0, 7},
            {0, 0, 0, 0},
            {0, 6, 9, 8, 0, 9, 6},
            {0, 0, 0, 0, 7, 9, 0, 0},
            {0, 0, 0, 0, 0},
            {8, 7, 0, 8, 9, 0, 8}
        };

        System.out.println("Arreglo original:");
        mostrar(original);

        ArrayList<int[]> resultado = new ArrayList<>();

        for (int[] fila : original) {
            ArrayList<Integer> nuevaFila = new ArrayList<>();
            for (int valor : fila) {
                if (valor != 0) {
                    nuevaFila.add(valor);
                }
            }
            if (!nuevaFila.isEmpty()) {
                int[] filaLimpia = nuevaFila.stream().mapToInt(i -> i).toArray();
                resultado.add(filaLimpia);
            }
        }

        System.out.println("\nArreglo resultante (sin ceros ni líneas vacías):");
        mostrar(resultado.toArray(new int[0][]));
    }

    public void mostrar(int[][] arreglo) {
        for (int[] fila : arreglo) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
