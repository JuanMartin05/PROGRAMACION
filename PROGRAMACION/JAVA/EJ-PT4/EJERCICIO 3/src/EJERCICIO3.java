
public class EJERCICIO3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Dime un Número del 1-7 y te digo su dia de la semana correspondiente");
        int numero =Integer.parseInt(System.console().readLine());
        String NumSemana;
    
        switch (numero) {

            case 1:
            NumSemana = "Lunes";
            break;

            case 2:
            NumSemana = "Martes";
            break;

            case 3:
            NumSemana = "Miercoles";
            break;

            case 4:
            NumSemana = "Jueves";
            break;

            case 5:
            NumSemana = "Viernes";
            break;

            case 6:
            NumSemana = "Sabado";
            break;

            case 7:
            NumSemana = "Domingo";
            break;

            default:
            NumSemana = "Ningun dia , no existe";
            break;
        }
        System.out.println("El numero " + numero +  " corresponde a: " + NumSemana);
    }
}
