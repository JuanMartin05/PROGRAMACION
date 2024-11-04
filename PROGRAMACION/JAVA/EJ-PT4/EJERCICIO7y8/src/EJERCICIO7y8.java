import java.util.Scanner;

public class EJERCICIO7y8 {
    public static void main(String[] args) throws Exception {
        Scanner nota = new Scanner(System.in);
        System.out.println("Dame la primera nota");
        double nota1 = nota.nextDouble();
        System.out.println("Dame la Segunda nota");
        double nota2 = nota.nextDouble();
        System.out.println("Dame la tercera nota");
        double nota3 = nota.nextDouble();
        nota.close();
        double media = (nota1 + nota2 + nota3) / 3;

        if ((media < 5) && (media >= 0)) {
            System.out.println("Tu nota media es de: " + media + " , por lo tanto es insuficiente.");
        } else if ((media >= 5) && (media < 6)) {
            System.out.println("Tu nota media es de: " + media + " , por lo tanto es suficiente.");
        } else if ((media >= 6) && (media < 7)) {
            System.out.println("Tu nota media es de: " + media + " , y eso es un bien.");
        } else if ((media >= 7) && (media < 9)) {
            System.out.println("Tu nota media es de: " + media + " , por lo tanto es notable.");
        } else if ((media >= 9) && (media <= 10)) {
            System.out.println("Tu nota media es de: " + media + " , por lo tanto es sobresaliente.");
        }
    }
}