import java.util.Scanner;

public class EJERCICIO6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura desde la que cae el objeto (en metros): ");
        double h = scanner.nextDouble();
        scanner.close();

        double g = 9.81;
        double tiempo = Math.sqrt((2 * h) / g);

        if (h >= 0) {
        System.out.println("El tiempo que tardará en caer el objeto desde una altura de " + h + " metros es: " + tiempo + " segundos.");
    }
    else {
        System.out.println("La altura no puede ser negativa");
    }
    }
}