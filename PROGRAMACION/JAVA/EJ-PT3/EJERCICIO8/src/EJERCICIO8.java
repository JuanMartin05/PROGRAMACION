import java.util.Scanner;
public class EJERCICIO8 {
public static void main(String[] args) {
    Scanner Total1= new Scanner(System.in);
    System.out.println("¿Cuantas horas trabajas a la semana?");
    double horas = Total1.nextDouble();
    Total1.close();
    double resultado = horas*12;
    System.out.println("A la semana cobras " + resultado + " Euros");
}
}
