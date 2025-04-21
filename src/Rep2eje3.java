import java.util.Scanner;

public class Rep2eje3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //escanner números
        // **********   Eje.1 Contar cifras
        //inicializo la variable

        int num =0, cont=0, cantNum=0;
        System.out.println("Bienvenido \n Ingresa un número entre el 0 y el 999 \n");
        num = scanner.nextInt();
// Verificamos rango
        if (num < 0 || num >999) {
           System.out.println("El valor ingresadodebe estar en el rango mencionado 0  - 999");}
        else {
            if (num !=0){
                // vamos a dividir entre 10 mientras que num sea distinto de 0 y incremento en contador para saber las veces
                while (num != 0){
                    num = num/10;
                    cont++;

                }
                System.out.println("La cantidad de dígitos es " + cont);
            }
            else {
                System.out.println("La cantidad de dígitos es  1");

          }
       }

    }
}

