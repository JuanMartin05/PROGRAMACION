public class EJERCICIO3 {
    public static void main(String[] args) {
        int numero = 0;

        do {
            if (numero % 5 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 200);
    }
}
