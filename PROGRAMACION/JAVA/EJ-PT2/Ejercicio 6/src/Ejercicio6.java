public class Ejercicio6  {
    public static void main(String[] args) {
        double baseImponible = 100.0; 

        double porcentajeIVA = 21.0;

        double iva = baseImponible * (porcentajeIVA / 100);

        double totalFactura = baseImponible + iva;

        System.out.println("Base Imponible: " + baseImponible + " euros");
        System.out.println("IVA (" + porcentajeIVA + "%): " + iva + " euros");
        System.out.println("Total Factura: " + totalFactura + " euros");
    }
}



