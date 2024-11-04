
public class EJERCICIO2 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("¿Que hora es(1-24)?");
        int hora = Integer.parseInt(System.console().readLine());
        String horario;

    if (hora>=6 && hora < 12) {
        horario="Buenos días <3";
    }
    else if (hora>=12 && hora < 21) {
        horario="Buenas Tarde <3";
    }
    else if (hora>= 21 && hora < 23 || hora >= 0 && hora <=5){
        horario="Buenas Noches <3";
    }
    else {
        horario="Has introducido una hora incorrecta";
    }
    System.out.println(horario);
}
}
