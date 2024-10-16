public class Ejercicio5 {
    public static void main(String[] args) {
        // Cantidad en euros que se quiere convertir
        double euros = 10.0;

        // Tasa de conversión de euros a pesetas
        double tasaConversion = 166.386;

        // Conversión de euros a pesetas
        double pesetas = euros * tasaConversion;

        // Mostrar el resultado
        System.out.println(pesetas + " pesetas son " + euros + " euros.");
    }

}

