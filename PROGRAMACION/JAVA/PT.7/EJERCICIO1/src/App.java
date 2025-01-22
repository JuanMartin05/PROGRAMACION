public class App {
    public static void main(String[] args) throws Exception {
        char[] simbolo;
        simbolo = new char [10];

        simbolo[0] = 'a';
        simbolo[1] = 'X';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (int i = 0; i < simbolo.length; i++) {
            System.out.println("Elemento en la posición " + i + ": " + simbolo[i]);
        }
    }
}