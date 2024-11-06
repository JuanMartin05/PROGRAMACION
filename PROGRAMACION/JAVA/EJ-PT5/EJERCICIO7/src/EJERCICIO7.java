import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int resultado = 6434;
        int intentos = 4;
        boolean abierta = false;

        while (intentos > 0 && !abierta) {
            System.out.println("Introduce la combinacion de 4 cifras");
            int numero = sc.nextInt();

            if (resultado == numero) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                abierta = true;
            } else {
                intentos -= 1;
                if (intentos > 0) {
                    System.out.println("El código introducido no es correcto, te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Se te acabaron las oportunidades.");
                }
            }
        }
        
        sc.close();
    }
}

