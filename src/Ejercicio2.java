import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje. 2 sumar dos numeros
        //inicializo la variable por las dudas
        
        double num1=0, num2=0;
        System.out.println("Sumar dos  números  \n Ingresa un número \n");
        num1 = scanner.nextDouble();
        System.out.println("Ingresa otro número \n");
        num2 = scanner.nextDouble();
        double res = num1 + num2;
        System.out.println("El resultado es : " + res);


        
    }

}
