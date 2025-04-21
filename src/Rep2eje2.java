import java.util.Scanner;

public class Rep2eje2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje.2  Par o impar

        int num =0;
        System.out.println("Bienvenido \n Ingresa un número \n");
        num = scanner.nextInt();
        if (num %2 == 0){
            System.out.println("El número que ingresaste es par");
        }
        else {
            System.out.println("El número ingresado es impar \n");}




    }

}



