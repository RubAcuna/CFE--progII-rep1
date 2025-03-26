import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // **********   Eje. 6  Simulador de compras
        Scanner scanner = new Scanner(System.in); //escanner números
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
