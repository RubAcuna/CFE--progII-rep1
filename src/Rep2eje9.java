import java.util.Scanner;

public class Rep2eje9 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String passwdIn;  //variable de texto para contraseña
            boolean bandera;  //variable para validar

            do {
                System.out.print("\"Bienvenido  \n Ingrese la contraseña: ");
                passwdIn = scanner.nextLine();
                //comparo lo que se inresa con el texto y guardo en bandera
                bandera = passwdIn.equals("java123");
                if (bandera==false) {
                    System.out.println("Contraseña incorrecta. Intente nuevamente.");
                }

            } while (bandera==false);

            System.out.println("\n Acceso correcto.");

        }
}
