import java.util.Scanner;
public class EJERCICIO4 {
    public static void main(String[] args) throws Exception {

        Scanner hora = new Scanner(System.in);
        System.out.println("Introduce el número de hora que trabajas a la semana");
        double NumHoras = hora.nextDouble();
        hora.close();
        double total1;

        if (NumHoras<=40) {
            total1=NumHoras*12;
        }
        else if (NumHoras > 40) {
        total1=((NumHoras-40)*16)+480;
        }
        else {
        total1=0;}
        System.out.println("El sueldo semanal que le corresponde es de: " + total1 + " Euros");
}
}
