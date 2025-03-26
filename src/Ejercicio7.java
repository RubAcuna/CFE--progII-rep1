import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner numérico
        Scanner entradastring = new Scanner(System.in); // scanner caracteres

        // Ejercicio 7 información de usuario
        // Declaro y escaneo

        System.out.println("Ingresa tu nombre  \n");
        String nombre = entradastring.nextLine();
        System.out.println("Ingresa tu edad  \n");
        int edad = scanner.nextInt();
        System.out.println("Ingresa tu cuidad  donde resides  \n");
        String ciudad = entradastring.nextLine();
        System.out.println("Hola "+nombre+" tienes la edad de "+ edad +" y vives en " +ciudad );



    }



}
