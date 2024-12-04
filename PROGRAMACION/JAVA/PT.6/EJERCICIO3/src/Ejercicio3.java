public class Ejercicio3 {
    public static void main(String[] args) {
        String carta = "";
        String palo = "";
        int numero = (int) (Math.random() * 10) + 1;
        switch (numero) {
        case 1:
            carta = "As";
            break;
        case 8:
            carta = "Sota";
            break;
        case 9:
            carta = "Caballo";
            break;
        case 10:
            carta = "Rey";
            break;
        default:
            carta = String.valueOf(numero);
            break;
    }

        switch ((int) (Math.random() * 4) + 1){
            case 1:
            palo = " de Copas";
            break;
            case 2:
            palo = " de Espadas";
            break;
            case 3:
            palo = " de Bastos";
            break;
            case 4:
            palo = " de Oros";
            break;
    }
    System.out.println(carta + palo);
}
}