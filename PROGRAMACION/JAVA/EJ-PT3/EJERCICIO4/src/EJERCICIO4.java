import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) throws Exception {
        double total;
        Scanner num1 = new Scanner(System.in);
        System.out.println("Escribe un numero");
        double multi = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Escribe otro numero");
        double multi2 = num2.nextInt();
        num1.close();
        num2.close();

        total = multi * multi2;
        double total1 = multi / multi2;
        double total2 = multi + multi2;
        double total3 = multi - multi2;

        System.out.println("Los resultados son ");
        System.out.println(total);
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
}
