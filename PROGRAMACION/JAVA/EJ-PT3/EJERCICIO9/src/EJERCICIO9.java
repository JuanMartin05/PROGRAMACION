import java.util.Scanner;
public class EJERCICIO9 {
public static void main(String[] args) {
    Scanner alt1 = new Scanner(System.in);
    System.out.println("Introduce la altura del cono");
    double altura = alt1.nextDouble();
    Scanner radi = new Scanner (System.in);
    System.out.println("Introduce el radio del cono");
    double radio = radi.nextDouble();
    alt1.close();
    radi.close();
    
    double resultado = (0.333333333333*3.14159*(radio*radio)*altura);
    System.out.println("El volumen de tu cono es de  " + resultado );
}
}