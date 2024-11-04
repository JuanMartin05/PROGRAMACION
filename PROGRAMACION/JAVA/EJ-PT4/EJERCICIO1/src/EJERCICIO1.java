import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿De que dia quieres saber lo que te toca a primera hora?");
        String dia = sc.nextLine();
        sc.close();
        String Asignatura;
        switch (dia) {

            case "lunes":
            Asignatura = "Musica";
            break;

            case "martes":
            Asignatura = "TIC";
            break;

            case "miercoles":
            Asignatura = "Educacion Fisica";
            break;

            case "jueves":
            Asignatura = "Lengua";
            break;

            case "viernes":
            Asignatura = "Matematicas";
            break;

            case "sabado" , "domingo":
            Asignatura = "No hay clases";
            break;
        
            default:
            Asignatura = "No existe";
            break;
        }
        System.out.println("El dia " + dia +  ": " + Asignatura);
    }
}
