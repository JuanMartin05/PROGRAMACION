import java.util.Scanner;

public class EJERCICIO10 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿En que dia nacistes?");
        int dia = sc.nextInt();
        sc.nextLine();

        System.out.println("¿En que Mes?");
        String mes = sc.nextLine();

        sc.close(); 

            if (mes.equals("enero")) {
                if (dia <= 19) {
                    System.out.println("Tu signo del zociaco es: Capricornio ");
                } else if (dia >= 20) {
                    System.out.println("Tu signo del zociaco es: Acuario ");
                }
            }
            
            else if (mes.equals("febrero")) {
                if (dia <= 18) {
                    System.out.println("Tu signo del zociaco es: Acuario ");
                } else if (dia>= 19) {
                    System.out.println("Tu signo del zociaco es: Piscis ");
                }
            }
                
            else if (mes.equals("marzo")) {
                if (dia <= 20) {
                        System.out.println("Tu signo del zociaco es: Piscis ");
                } else if (dia>= 21) {
                    System.out.println("Tu signo del zociaco es: Aries ");
                }
            }

            else if (mes.equals("abril")) {
                if (dia <= 19) {
                    System.out.println("Tu signo del zociaco es: Aries ");
                } else if (dia>= 20) {
                    System.out.println("Tu signo del zociaco es: Tauro ");
                }
            }

            else if (mes.equals("mayo")) {
                if (dia <= 20) {
                    System.out.println("Tu signo del zociaco es: Tauro ");
                } else if (dia>= 21) {
                    System.out.println("Tu signo del zociaco es: Géminis ");
                }
            }

            else if (mes.equals("junio")) {
                if (dia <= 20) {
                    System.out.println("Tu signo del zociaco es: Géminis ");
                } else if (dia>= 21) {
                    System.out.println("Tu signo del zociaco es: Cáncer ");
                }
            }

            else if (mes.equals("julio")) {
                if (dia <= 22) {
                    System.out.println("Tu signo del zociaco es: Cáncer ");
                } else if (dia>= 23) {
                    System.out.println("Tu signo del zociaco es: Leo ");
                }
            }

            else if (mes.equals("agosto")) {
                if (dia <= 22) {
                    System.out.println("Tu signo del zociaco es: Leo ");
                } else if (dia>= 23) {
                    System.out.println("Tu signo del zociaco es: Virgo ");
                }
            }
                
            else if (mes.equals("septiembre")) {
                if (dia <= 22) {
                    System.out.println("Tu signo del zociaco es: Virgo ");
                } else if (dia>= 23) {
                    System.out.println("Tu signo del zociaco es: Libre ");
                }
            }

            else if (mes.equals("octubre")) {
                if (dia <= 22) {
                        System.out.println("Tu signo del zociaco es: Libra ");
                } else if (dia>= 23) {
                    System.out.println("Tu signo del zociaco es: Escorpio ");
                }
            }

            else if (mes.equals("noviembre")) {
                if (dia <= 21) {
                    System.out.println("Tu signo del zociaco es: Escorpio ");
                } else if (dia>= 22) {
                    System.out.println("Tu signo del zociaco es: Sagitario ");
                }
            }

            else if (mes.equals("Diciembre")) {
                if (dia <= 22) {
                    System.out.println("Tu signo del zociaco es: Sagitario ");
                } else if (dia>= 22) {
                    System.out.println("Tu signo del zociaco es: Capricornio ");
                }
            }
                else {
                    System.out.println("Tu fecha de nacimiento no existe");
                }
    }
}