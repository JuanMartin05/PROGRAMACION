import java.util.Scanner;
public class EJERCICIO5 {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        System.out.println("¿Cual es la altura de tu Rectángulo?");
        double multi = num.nextInt();
        Scanner num1 = new Scanner(System.in);
        System.out.println("¿Cual es la altura de tu Rectángulo?");
        double multi1 = num1.nextInt();
        num.close();
        num.close();
        double resultado = multi*multi1;
        System.out.println("El area de tu rectángulo es " + resultado);
    }
}
