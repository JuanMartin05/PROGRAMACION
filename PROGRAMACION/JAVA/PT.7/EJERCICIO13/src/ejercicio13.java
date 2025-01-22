import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int [] numero;
        numero=new int [100];
    System.out.println("Los numeros aleatorios son = ");

    int acomulativa = 0;
    int i=0;

    for (i=0; i<100;i++){
        numero [i] =(int)(Math.random()*500)+1;
        System.out.print(numero [i] + " || ");
    }
    

    System.out.println("");
    System.out.println("¿Cual quieres destacar (1-Minimo o 2- Maximo)?");
    int respuesta =sc.nextInt();

    if (respuesta == 1) {

    }

        System.out.println (numero[5]);
    }
    }
