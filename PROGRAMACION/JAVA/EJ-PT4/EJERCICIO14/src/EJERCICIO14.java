import java.util.Scanner;

public class EJERCICIO14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        boolean esPar = (numero % 2 == 0);
        boolean esDivisibleEntre5 = (numero % 5 == 0);

        if (esPar) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " no es par.");
        }

        if (esDivisibleEntre5) {
            System.out.println("El número " + numero + " es divisible entre 5.");
        } else {
            System.out.println("El número " + numero + " no es divisible entre 5.");
        }

        scanner.close();
    }
}
