package resol.AleE;

import java.util.Scanner;

public class Principal {   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("1 - Ejercicio1");
        System.out.println("2 - Ejercicio2");
        System.out.println("3 - Ejercicio3");
        System.out.println("4 - Ejercicio4");
        System.out.println("5 - Ejercicio5");
        System.out.println("6 - Ejercicio6");
        System.out.println("7 - Ejercicio7");
        System.out.println("8 - Ejercicio8");
        System.out.println("9 - Ejercicio9");
        System.out.println("10 - Ejercicio10");
        System.out.println("11 - Ejercicio11");
        System.out.println("12 - Ejercicio12");
        System.out.println("13 - Ejercicio13");
        System.out.println("14 - Ejercicio14");
        System.out.println("Seleccione el numero de ejercicio a ejecutar:");

        int opcion=sc.nextInt();
        
        switch(opcion) {
            case 1:
            System.out.println("Ingrese su nombre:");
            String nombre= sc.next();
            Ejercicio1 ej1= new Ejercicio1();
            ej1.MostrarMensaje(nombre);
            break;
        
            case 2:
            System.out.println("Ingrese un número:");
            int numero=sc.nextInt();
            Ejercicio2 ej2= new Ejercicio2();
            ej2.verificarParidad(numero);
            break;
        
            case 3:
            System.out.println("Ingrese un número:");
            int numTabla=sc.nextInt();
            Ejercicio3 ej3=new Ejercicio3();
            ej3.mostrarTabla(numTabla);
            break;
        
            case 4:
            System.out.println("Ingrese una palabra:");
            String palabras=sc.next();
            Ejercicio4 ej4=new Ejercicio4();
            ej4.contarVocales(palabras);
            break;
        
            case 5:
            System.out.println("Ingrese la palabra:");
            String palabraP= sc.next();
            Ejercicio5 ej5=new Ejercicio5();
            ej5.verificarPalindromo(palabraP);
            break;
        
            case 6:
            Ejercicio6 ej6 = new Ejercicio6();
            ej6.jugarAdivinaNumero();
            break;

            case 7:
            Ejercicio7 ej7= new Ejercicio7();
            ej7.mostrarMenu();
            break;

            case 8:
            Ejercicio8 ej8 = new Ejercicio8();
            ej8.convertirTemperatura();
            break;

            case 9:
            System.out.print("Ingrese un texto: ");
            sc.nextLine();
            String texto = sc.nextLine();
            Ejercicio9 ej9 = new Ejercicio9();
            ej9.contarPalabras(texto);
            break;

            case 10:
            System.out.print("Ingrese una contraseña: ");
            sc.nextLine();
            String contrasena = sc.nextLine();
            Ejercicio10 ej10 = new Ejercicio10();
            ej10.validarContrasena(contrasena);
            break;
        
            case 11:
            Ejercicio11 ej11 = new Ejercicio11();
            ej11.mostrarSerie();
            break;
        
            case 12:
            Ejercicio12 ej12 = new Ejercicio12();
            ej12.manejarArreglo();
            break;
        
            case 13:
            Ejercicio13 ej13 = new Ejercicio13();
            ej13.mostrarPromedios();
            break;
        
            case 14:
            Ejercicio14 ej14 = new Ejercicio14();
            ej14.ejecutar();
            break;
        }        
sc.close();  }
}
