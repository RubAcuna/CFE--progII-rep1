import java.util.Scanner;

public class Rep2eje5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje.5 IMC

        double masa =0,altura=0,imc=0;
        System.out.println("Bienvenido Calculemos tu  IMC \n Ingresa peso en Kg \n");
        masa = scanner.nextDouble();
        System.out.println("Ingresa altura en metros \n");
        altura = scanner.nextDouble();
        imc= masa/ (altura * altura);
        if (imc < 18 ) {
            System.out.println("Peso bajo, tu IMC es: "+imc);
        } else if (imc < 25) {
            System.out.println("Peso normal tu IMC es: "+imc);
        } else if (imc < 30) {
            System.out.println("Sobrepeso tu IMC es: "+imc);
        } else {
            System.out.println("Obesidad tu IMC es: "+imc);
        }
        }
}
