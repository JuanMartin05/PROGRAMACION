import java.util.Scanner;
public class OrdenarNumeros { public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num1, num2, num3; // Solicitamos los tres números 
System.out.print("Introduce el primer número: ");
num1 = sc.nextInt();
System.out.print("Introduce el segundo número: ");
num2 = sc.nextInt();
System.out.print("Introduce el tercer número: ");
num3 = sc.nextInt();

int temp; if (num1 > num2) { temp = num1; num1 = num2; num2 = temp; }
if (num1 > num3) { temp = num1; num1 = num3; num3 = temp; }
if (num2 > num3) { temp = num2; num2 = num3; num3 = temp; }

System.out.println("Los números ordenados son: " + num1 + ", " + num2 + ", " + num3);
}
}
