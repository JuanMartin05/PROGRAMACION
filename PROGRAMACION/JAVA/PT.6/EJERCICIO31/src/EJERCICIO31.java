import java.util.Scanner;

public class EJERCICIO31 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce la cantidad de dinero que quieres apostar: ");
        int apuesta = sc.nextInt();
        
        boolean PartidaAcaba =false;
        int dineroganado = apuesta*2;
        int dado1= (int)(Math.random()*6+1);
        int dado2= (int)(Math.random()*6+1);
        int sumadados = dado1+dado2;

        System.out.println("Dado número 1= " + dado1);
        System.out.println("Dado número 2= " + dado2);
        System.out.println("El total de ambos suma= " + sumadados);

        switch (sumadados) {
        case 7, 11:
        System.out.println("Es tu dia de suerte has ganado: " + dineroganado);
        break;

        case 2, 3, 12:
        System.out.println("Losiento , has perdido todo tu dinero...");
        break;

        default:
        System.out.println("Losiento , tienes que volver a tirar para sacar: " + sumadados);
        System.out.print("Dale enter para seguir tirando--->");
        sc.nextLine();

        PartidaAcaba = false;

        do {
            dado1 = (int) (Math.random() * 6 + 1);
            dado2 = (int) (Math.random() * 6 + 1);
            System.out.println("");
            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Suma: " + (dado1 + dado2));
            if ((dado1 + dado2) == sumadados) {
                System.out.println("");
                System.out.println("¡Enhorabuena! ¡Ha ganado otros " + apuesta + " €!");
                System.out.println("¡Ahora tiene " + apuesta * 2 + " €!");
                PartidaAcaba = true;
            } else if ((dado1 + dado2) == 7) {
                System.out.println("");
                System.out.println("Lo siento, ha perdido todo su dinero ");
                PartidaAcaba = true;
            } else {
                System.out.println("");
                System.out.println("Continúe jugando.");
                System.out.println("Pulse INTRO para tirar los dados.");
                sc.nextLine();
            }
        } while (!PartidaAcaba);
}
}
}
