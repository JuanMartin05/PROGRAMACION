import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        System.out.print("Por favor, introduzca el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ahora introduzca el valor de b: ");
        double b = sc.nextDouble();

        if (a != 0) {
            double x = -b / a;
            System.out.println("La solución es x = " + x);
        } else {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución real.");
            }
        }
    }
} 