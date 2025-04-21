import java.util.Scanner;

public class Rep2eje8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje. suma N cantidad de numeros
        int suma = 0, cantNum=0, cont=0;
        System.out.println("Bienvenido  \n Ingresa la cantidad de  números que  deseas sumar \n");
        cantNum = scanner.nextInt();
        while (cont!=cantNum){
            cont++;
            System.out.println("Ingresa el valor \n");
            int numero = scanner.nextInt();
            suma += numero;

        }
        System.out.println("La suma es :" +suma);

    }
}