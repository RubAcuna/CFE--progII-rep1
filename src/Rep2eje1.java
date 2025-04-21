import java.util.Scanner;

public class Rep2eje1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje.1 Positivo Negativo
        //inicializo la variable

        int num =0;
        System.out.println("Bienvenido \n Ingresa un número \n");
        num = scanner.nextInt();
        if (num > 0){
            System.out.println("El número que ingresaste es positivo");
        } else if (num < 0) {
            System.out.println("El número que ingresaste es negativo");
            
        } else {
            System.out.println("El número ingresado es neutro \n");}




    }

}
