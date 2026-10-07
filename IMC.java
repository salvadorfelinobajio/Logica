import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("insgrese su peso en Kg");
        double peso = lector.nextDouble();
        System.out.println("ingrese su altura en metros"); 
        double altura = lector.nextDouble(); 
        double imc = peso/(altura*altura);
        System.out.println("su IMC es" + imc);
        lector.close();
    }
}


