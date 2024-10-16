import java.util.Scanner;
public class EJERCICIO7 {
public static void main(String[] args) {
    Scanner Total1= new Scanner(System.in);
    System.out.println("Introduce el total de tu factura");
    double precio = Total1.nextDouble();
    Total1.close();
    double resultado = precio*0.21;
    double resultado2 = resultado+precio;
    System.out.println("El precio de tu factura con IVA es de " + resultado2 + " Euros");
}
}
