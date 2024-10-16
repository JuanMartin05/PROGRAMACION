public class EJERCICIO5 {
    // Colores ANSI
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws Exception {
        System.out.println("Horas          Lunes          Martes          Miercoles          Jueves           Viernes");
        System.out.println("15:15-16:15    " + RED + "Entornos" + RESET + "       " + GREEN + "Digitalización" + RESET + "  " + YELLOW + "Lenguajes" + RESET + "          " + YELLOW + "Lenguajes" + RESET + "        " + BLUE + "Bases Datos" + RESET);
        System.out.println("16:15-17:15    " + RED + "Entornos" + RESET + "       " + BLUE + "Bases Datos" + RESET + "     " + CYAN + "Programación" + RESET + "       " + YELLOW + "Lenguajes" + RESET + "        " + BLUE + "Bases Datos" + RESET);
        System.out.println("17:15-18:15    " + RED + "Entornos" + RESET + "       " + BLUE + "Bases Datos" + RESET + "     " + CYAN + "Programación" + RESET + "       " + PURPLE + "Sistemas" + RESET + "         " + GREEN + "Sostenibilidad" + RESET);
        System.out.println("18:15-18:30                                     Recreo                                          ");
        System.out.println("18:30-19:30    " + CYAN + "Programación" + RESET + "   " + GREEN + "Itinerario" + RESET + "      " + CYAN + "Programación" + RESET + "       " + PURPLE + "Sistemas" + RESET + "         " + PURPLE + "Sistemas" + RESET);
        System.out.println("19:30-20:30    " + CYAN + "Programación" + RESET + "   " + GREEN + "Itinerario" + RESET + "      " + BLUE + "Bases Datos" + RESET + "        " + CYAN + "Programación" + RESET + "     " + PURPLE + "Sistemas" + RESET);
        System.out.println("20:30-21:30    " + CYAN + "Programación" + RESET + "   " + GREEN + "Itinerario" + RESET + "      " + BLUE + "Bases Datos" + RESET + "        " + CYAN + "Programación" + RESET + "     " + PURPLE + "Sistemas" + RESET);
    }
}