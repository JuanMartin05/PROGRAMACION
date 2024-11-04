import java.util.Scanner;

public class EJERCICIO11 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora");
        int hora = sc.nextInt();

        System.out.println("Introduce los minutos");
        int minuto = sc.nextInt();
        sc.close();

        if ((hora >= 0) && (hora < 24)) {
            if ((minuto >= 0) && (minuto < 60)) {

                int Resultadohora = 23 - hora;
                int Resultominuto = 60 - minuto;
                int Resutadototal = Resultadohora * 3600 + Resultominuto * 60;
                System.out.println("Quedan: " + Resutadototal + " segundos para la medianoche");
            }
        } else {
            System.out.println("La hora introducida no existe");
        }
    }
}
