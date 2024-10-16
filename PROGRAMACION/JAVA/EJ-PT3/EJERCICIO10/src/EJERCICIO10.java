import java.util.Scanner;
public class EJERCICIO10 {
public static void main(String[] args){
Scanner MB1 = new Scanner(System.in);
System.out.println("¿Cuantos MegaBytes quieres que pase a KiloBytes?");
double MegaBytes = MB1.nextDouble();
double resultado = MegaBytes*1000;
System.out.println(MegaBytes + " Mb son " + resultado + " Kb");
}
}
