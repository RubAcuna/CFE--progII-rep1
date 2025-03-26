import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // **********   Eje. 5  convertir temperatura
        //declaro variables
        Scanner scanner = new Scanner(System.in); //escanner números
        double temCel=0;
        System.out.println("Convertidor de temperarura \n Ingresa la temperatura en grados celcius \n");
        temCel= scanner.nextDouble();
        // declaro y calculo despuès de declarar
        double temFra = (temCel * 9/5) + 32;
        System.out.println("\n " + temCel + " °C equivalen a " + temFra + "°F");




    }
}
