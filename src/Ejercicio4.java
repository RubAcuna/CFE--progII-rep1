import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        // **********   Eje. 4 Calcular área rectángulo
        Scanner scanner = new Scanner(System.in); //escanner números
        //declaro variables
        int  base=0, altura=0;
        double area=0;
        System.out.println("Calculemos el área de un rectángulo \n ingresa la base \n");
        base= scanner.nextInt();
        System.out.println("Ingresa la altura \n ");
        altura= scanner.nextInt();
        area=base*altura;
        System.out.println("El resultado es : "+ area);
        // Consultar por tipo de datos en scanner Double me tira error en punto





    }


}
