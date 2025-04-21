import java.util.Scanner;

public class Rep2eje4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje.4  Mayor de tres
        int num1 =0,num2=0,num3=0;
        System.out.println("Bienvenido Cuál es el mayor \n Ingresa un número \n");
        num1 = scanner.nextInt();
        System.out.println("Bienvenido \n Ingresa oto número \n");
        num2 = scanner.nextInt();
        System.out.println("Bienvenido \n Ingresa un tercer número \n");
        num3 = scanner.nextInt();
        if (num1 >= num2 && num1 >= num3){
            System.out.println("El mayor es el"+num1);
        } else if (num2 >=num3) {
            System.out.println("El mayor es el " +num2);
        }
        else {
            System.out.println("el mayor es el "+num3);
        }
    }

}