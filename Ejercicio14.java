package resol.AleE;

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
        
        System.out.println("\nArreglo sin ceros:");
        for (int i= 0; i< original.length; i++) {
            int count= 0;
        for (int j= 0; j < original[i].length; j++) {
            if (original[i][j] != 0) {
                count++;
            }
            }

        if (count> 0) {
            int[] nuevaFila = new int[count];
            int k= 0;
            for (int j= 0; j < original[i].length; j++) {
                if (original[i][j] != 0) {
                    nuevaFila[k++]= original[i][j];
                    }
                }

            for (int val : nuevaFila) {
                System.out.print(val + " ");
            }
                System.out.println();
            }
        }
    }

    public static void mostrar(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}

