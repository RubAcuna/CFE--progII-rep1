import java.time.Year;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // **********   Eje. 3  Calculadora de edad
        Scanner scanner = new Scanner(System.in); //escanner números
        System.out.println("Calculemos tu edad \n Dime tu año de nacimiento");
        int edad =0;
        int anio = scanner.nextInt();
        // obtenemos año del sistema importo clase
        int anioActual = Year.now().getValue();
        edad = anioActual - anio;
        System.out.println("Bueno  parece que tienes "+edad +" años");




    }




}
