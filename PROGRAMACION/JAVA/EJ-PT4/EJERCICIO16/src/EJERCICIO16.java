import java.util.Scanner;

public class EJERCICIO16 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("     Vamos a ver si tu pareja es fiel");
        System.out.println("Responde a las sig preguntas con (Si o No)");
        System.out.println("------------------------------------------");

        
        System.out.println("1) ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente?");
        String resultado1 = sc.nextLine();
    
        System.out.println("2) ¿Ha aumentado sus gastos de vestuario?");
        String resultado2 = sc.nextLine();

        System.out.println("3) ¿Ha perdido el interés que mostraba anteriormente por ti?");
        String resultado3 = sc.nextLine();

        System.out.println("4) ¿ Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
        String resultado4 = sc.nextLine();

        System.out.println("5) ¿No te deja que mires la agenda de su teléfono móvil?");
        String resultado5 = sc.nextLine();

        System.out.println("6) ¿ A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
        String resultado6 = sc.nextLine();

        System.out.println("7) ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
        String resultado7 = sc.nextLine();

        System.out.println("8) ¿Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
        String resultado8 = sc.nextLine();

        System.out.println("9) ¿Has notado que últimamente se perfuma más?");
        String resultado9 = sc.nextLine();

        System.out.println("10) ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
        String resultado10 = sc.nextLine();

        sc.close(); 

        int nota=0;

        if ("si".equals(resultado1)) {
            nota+=3; 
        }
        
        if ("si".equals(resultado2)) {
            nota+=3; 
        }

        if ("si".equals(resultado3)) {
            nota+=3; 
        }

        if ("si".equals(resultado4)) {
            nota+=3; 
        }

        if ("si".equals(resultado5)) {
            nota+=3;  
        }

        if ("si".equals(resultado6)) {
            nota+=3;  
        }

        if ("si".equals(resultado7)) {
            nota+=3; 
        }

        if ("si".equals(resultado8)) {
            nota+=3; 
        }

        if ("si".equals(resultado9)) {
            nota+=3; 
        }

        if ("si".equals(resultado10)) {
            nota+=3; 
        }
        if ((nota>=0 && nota<=10)) {

            System.out.println("Puntuación de " + nota + ": Enhorabuena tu pareja parece ser totalmente fiel" );
        }
        if ((nota>=11 && nota<=22)) {

            System.out.println("Puntuación de " + nota + ": Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia.No bajes la guardia."); 
        }
        if ((nota>=23 && nota<=30)) {

            System.out.println("Puntuación de " + nota + ": Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza." ); 
        }
    }
}
