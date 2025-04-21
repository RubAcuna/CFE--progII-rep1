import java.util.Scanner;

public class Rep2eje6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje. suma del 1al 100
        int suma = 0;

        // Ejecuto el for
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}
