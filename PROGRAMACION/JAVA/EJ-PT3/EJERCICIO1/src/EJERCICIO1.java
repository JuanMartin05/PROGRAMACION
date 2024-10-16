import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) throws Exception {
        double total;
        Object system;
        Scanner num1 = new Scanner(System.in);
    System.out.println("Escribe un numero");
    double multi = num1.nextInt();

    Scanner num2 = new Scanner(System.in);
    System.out.println("Escribe otro numero");
    double multi2 = num2.nextInt();
    num1.close();
    num2.close();
    total = multi*multi2;
    System.out.println("El resultado es " + total);
    }
}
