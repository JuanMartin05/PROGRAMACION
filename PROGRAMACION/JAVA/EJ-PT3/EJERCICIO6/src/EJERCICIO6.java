import java.util.Scanner;
public class EJERCICIO6 {
    public static void main(String[] args) throws Exception {
        Scanner num = new Scanner(System.in);
        System.out.println("¿Cual es la base de tu triangulo?");
        double multi = num.nextInt();
        Scanner num1 = new Scanner(System.in);
        System.out.println("¿Cual es la altura de tu triangulo?");
        double multi1 = num1.nextInt();
        num.close(); //Aqui cerramos multi
        num.close(); //Aqui cerramos multi1
        double resultado = 0.5*multi*multi1;
        System.out.println("El area de tu triangulo es " + resultado);
    }
}