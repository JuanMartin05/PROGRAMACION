import java.util.Scanner;

public class EJERCICIO3 {
    public static void main(String[] args) throws Exception {
        Scanner num1 = new Scanner(System.in);
        System.out.println("¿Que Cantidad de Pesetas paso a Euros?");
        double multi = num1.nextInt();
        num1.close();
        double resultado = multi/166.386;
        System.out.println(multi + " Pesetas , Equivale a " + resultado + " Euros");
    }
}