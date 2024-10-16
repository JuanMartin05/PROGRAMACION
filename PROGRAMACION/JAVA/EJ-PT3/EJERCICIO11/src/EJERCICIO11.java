import java.util.Scanner;
public class EJERCICIO11 {
public static void main(String[] args){
Scanner KB1 = new Scanner(System.in);
System.out.println("¿Cuantos KiloBytes quieres que pase a MegaBytes?");
double KiloBytes = KB1.nextDouble();
double resultado = KiloBytes/1000;
System.out.println(KiloBytes + " Kb son " + resultado + " Mb");
}
}

