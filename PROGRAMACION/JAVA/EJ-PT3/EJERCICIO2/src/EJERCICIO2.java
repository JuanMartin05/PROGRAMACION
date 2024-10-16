import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) throws Exception {
        Scanner num1 = new Scanner(System.in);
        System.out.println("¿Que Cantidad de euros paso a pesetas?");
        double multi = num1.nextInt();
        num1.close();
        double resultado = multi*166.386;
        System.out.println(multi + " euros , Equivale a " + resultado + " pesetas");
    }
}
