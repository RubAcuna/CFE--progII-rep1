import java.time.Year;
import java.util.Scanner;

public class Ejercicio1 {

        public static void main(String[] args) {
            // instanciando scanner
            Scanner entrada = new Scanner(System.in); // scanner string
            Scanner scanner = new Scanner(System.in); //escanner números


            System.out.println("Hola digita tu nombre  \n");
            // defino la variable y la  solicito por consola

            String nombre = scanner.nextLine();

            System.out.println("Bienvenido  "+ nombre + ". ¿Cómo estás?");
            // **********   Eje. 2 sumar dos numeros
            //inicializo la variable por las dudas
            double num1=0, num2=0, res=0;
            System.out.println("Sumar dos  números  \n Ingresa un número \n");
            num1 = scanner.nextDouble();
            System.out.println("Ingresa otro número \n");
            num2 = scanner.nextDouble();
            res=num1+num2;
            System.out.println("El resultado es : " + res);
            // **********   Eje. 3  Calculadora de edad

            System.out.println("Calculemos tu edad "+nombre +"\n Dime tu año de nacimiento");
            int edad =0;
            int anio = scanner.nextInt();
            // obtenemos año del sistema importo clase
            int anioActual = Year.now().getValue();
            edad = anioActual - anio;
            System.out.println("Bueno "+ nombre +" parece que tienes "+edad +" años");


            // **********   Eje. 4 Calcular área rectángulo
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

            // **********   Eje. 5  convertir temperatura
            //declaro variables
            double temCel=0;
            System.out.println("Convertidor de temperarura \n Ingresa la temperatura en grados celcius \n");
            temCel= scanner.nextDouble();
            // declaro y calculo despuès de declarar
            double temFra = (temCel * 9/5) + 32;
            System.out.println("\n " + temCel + " °C equivalen a " + temFra + "°F");


            // **********   Eje. 6  Simulador de compras
            // variables
            double prod1=0,prod2=0,prod3=0, totalIva=0;
            System.out.println("Ahora vamos alcular el IVA de tu compra \n Ingresa importe de la compra Nº 1 \n");
            prod1= scanner.nextDouble();
            System.out.println("Ingresa importe de la compra Nº 2 \n");
            prod2= scanner.nextDouble();
            System.out.println("Ingresa importe de la compra Nº 3 \n");
            prod3= scanner.nextDouble();
            // cálculo
            totalIva= (prod1 + prod2 +prod3)*1.22;
            System.out.println("Tu compra tiene el valor total de : "+ totalIva);









        }
    }
