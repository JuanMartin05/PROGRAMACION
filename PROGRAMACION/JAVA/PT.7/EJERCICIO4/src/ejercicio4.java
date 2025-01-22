public class ejercicio4 {
    public static void main(String[] args) throws Exception {
        int [] numero;
        numero=new int [20];

        int [] cuadrado;
        cuadrado=new int [20];

        int [] cubo;
        cubo=new int [20];

        System.out.print("");
        System.out.println("los numeros aleatorios son :");

        for (int i = 0; i<20; i++){
            numero[i] =(int) (Math.random()*100)+1;
            System.out.print( numero [i]+" , ");}

        System.out.println("");
        System.out.println("");
        System.out.println("El cuadrado de los numero son :");
        
        for (int p = 0; p<20; p++){
            cuadrado [p] = numero[p]*numero[p];
            System.out.print( cuadrado [p]+" , ");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("El cubo de los numero son :");

        for (int j = 0; j<20; j++){
            cubo [j] = numero[j]*numero[j];
            System.out.print( cubo [j]+" , ");
        }
    }
}
