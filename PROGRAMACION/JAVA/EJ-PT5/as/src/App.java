import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int COMBINACION = 1234; // La combinación de la caja fuerte
        int intentos = 4; // Número de oportunidades para abrir la caja fuerte

        while (intentos > 0) {
            System.out.print("Introduce la combinación de 4 cifras: ");
            int combinacionIntroducida = scanner.nextInt();

            if (combinacionIntroducida == COMBINACION) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                break; // Salimos del bucle si la combinación es correcta
            } else {
                intentos--; // Restamos un intento
                if (intentos > 0) {
                    System.out.println("Lo siento, esa no es la combinación. Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Lo siento, esa no es la combinación. No te quedan más intentos.");
                }
            }
        }

        scanner.close();
    }
}
