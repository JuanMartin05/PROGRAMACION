public class Ejercicio12DI {

    public static int numerosAleatorios() {
        int numeros = (int) (Math.random() * 500) + 400;
        return numeros;
    }

    public static void main(String[] args) throws Exception {

        int[][] n = new int[9][9];

        int maximo = 499;
        int minimo = 901;
        double media = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                n[i][j] = numerosAleatorios();
                System.out.print(n[i][j] + " || ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Los valores en diagonal son = ");

        int fila = 0;
        for (int k = 8; k >= 0; k--) {
            System.out.print(n[k][fila] + " || ");

            if (n[k][fila] > maximo) {
                maximo = n[k][fila];
            } else if (n[k][fila] > minimo) {
                minimo = n[k][fila];
            }
            media += n[k][fila];
            fila++;
        }
        System.out.println("");
        System.out.println("La media es = " + media);
        System.out.println("El maximo es = " + maximo);
        System.out.println("El minimo es = " + minimo);

    }
}