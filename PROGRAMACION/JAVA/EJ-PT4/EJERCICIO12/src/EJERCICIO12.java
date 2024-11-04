import java.util.Scanner;

public class EJERCICIO12 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a hacer un examen tipo test");
        System.out.println("----------------------------------");

        
        System.out.println("1) ¿Qué componente es responsable de realizar cálculos y operaciones lógicas en un sistema informático?");
        System.out.println("A) CPU");
        System.out.println("B) Disco duro");
        String resultado1 = sc.nextLine();
    
        System.out.println("2) ¿Cuál es el propósito de la memoria RAM en un sistema informático?");
        System.out.println("A) Almacenar datos temporalmente");
        System.out.println("B) Proveer almacenamiento permanente");
        String resultado2 = sc.nextLine();

        System.out.println("3) ¿Qué tipo de memoria se usa para almacenar el sistema operativo y los archivos de programas que se cargan al iniciar el computador?");
        System.out.println("A) RAM");
        System.out.println("B) ROM");
        String resultado3 = sc.nextLine();

        System.out.println("4) ¿Cuál de los siguientes es un ejemplo de software de sistema?");
        System.out.println("A) Microsoft Word");
        System.out.println("B) Windows 10");
        String resultado4 = sc.nextLine();

        System.out.println("5) ¿Qué dispositivo se utiliza para convertir datos analógicos a digitales y viceversa en una red?");
        System.out.println("A) Modem");
        System.out.println("B) Teclado");
        String resultado5 = sc.nextLine();

        System.out.println("6) ¿Cuál es el término para el software que permite la interacción del usuario con el hardware del computador?");
        System.out.println("A) SIstema operativo");
        System.out.println("B) Procesador");
        String resultado6 = sc.nextLine();

        System.out.println("7) ¿Cuál es la principal función de un servidor en una red?");
        System.out.println("A) Procesar datos gráficos");
        System.out.println("B) Proveer servicios a otros computadores");
        String resultado7 = sc.nextLine();

        System.out.println("8) ¿Qué significa el acrónimo \"BIOS\"?");
        System.out.println("A) Basic Input/Output System");
        System.out.println("B) Binary Input/Output System");
        String resultado8 = sc.nextLine();

        System.out.println("9) ¿Cuál de los siguientes dispositivos se utiliza para entrada de datos?");
        System.out.println("A) Monitor");
        System.out.println("B) Teclado");
        String resultado9 = sc.nextLine();

        System.out.println("10) ¿Qué tipo de almacenamiento es típicamente más rápido?");
        System.out.println("A) SSD");
        System.out.println("B) HDD");
        String resultado10 = sc.nextLine();

        sc.close(); 

        int nota=0;

        if ("a".equals(resultado1)) {
            nota+=1; 
        }
        
        if ("a".equals(resultado2)) {
            nota+=1; 
        }

        if ("b".equals(resultado3)) {
            nota+=1; 
        }

        if ("b".equals(resultado4)) {
            nota+=1; 
        }

        if ("a".equals(resultado5)) {
            nota+=1;  
        }

        if ("a".equals(resultado6)) {
            nota+=1;  
        }

        if ("b".equals(resultado7)) {
            nota+=1; 
        }

        if ("a".equals(resultado8)) {
            nota+=1; 
        }

        if ("b".equals(resultado9)) {
            nota+=1; 
        }

        if ("a".equals(resultado10)) {
            nota+=1; 
        }
        System.out.println("Tu nota es de un: " + nota );
    }
}
