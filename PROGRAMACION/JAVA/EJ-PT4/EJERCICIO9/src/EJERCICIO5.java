import java.util.Scanner;

public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones se segundo grado");

        System.out.print("Por favor, introduzca el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ahora introduzca el valor de b: ");
        double b = sc.nextDouble();
        
        System.out.print("Ahora introduzca el valor de c: ");
        double c = sc.nextDouble();
        sc.close();

        double raiz= Math.pow(b, 2)-4*a*c;
        double resultado1 = (-b - Math.sqrt(raiz))/(2*a);
        double resultado2 = (-b + Math.sqrt(raiz))/(2*a);
        
        if (raiz <0) {
            System.err.println("La ecuacion no tiene ninguna solucion real");
        }
        else if (resultado1==resultado2) {
            System.err.println("La ecuacion tiene una unica solucion: " + resultado1);
        }
        else 
        System.err.println("La ecuacion tiene dos soluciones que son: " + resultado1 + " y " + resultado2);
            
        }
    }
