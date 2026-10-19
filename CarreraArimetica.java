
import java.util.Random;
import java.util.Scanner;
public class CarreraArimetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Datos iniciales
        double entrada = 25;

        System.out.print("Ingresa tu mes de nacimiento (1-12): ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Mes invalido.");
            sc.close();
            return;
        }

        // ETAPA 1: PROMEDIO DE 5 NUMEROS ENTEROS ALEATORIOS
        int suma = 0;

        System.out.println("\n--- ETAPA 1: PROMEDIO ---");
        System.out.println("Entrada: " + entrada);
        System.out.println("Numeros generados:");

        for (int i = 1; i <= 5; i++) {
            int numero = random.nextInt(100) + 1;
            System.out.println(numero);
            suma += numero;
        }

        double promedio = suma / 5.0;
        double salida = entrada + promedio;

        System.out.println("Promedio: " + promedio);
        System.out.println("Salida: " + salida);

        // ETAPA 2: RESIDUO ENTRE 7
        System.out.println("\n--- ETAPA 2: RESIDUO ---");

        entrada = salida;
        double residuo = entrada % 7;
        salida = entrada + residuo;

        System.out.println("Entrada: " + entrada);
        System.out.println("Residuo entre 7: " + residuo);
        System.out.println("Salida: " + salida);

        // ETAPA 3: PORCENTAJE DEL 12%
        System.out.println("\n--- ETAPA 3: PORCENTAJE ---");

        entrada = salida;
        double porcentaje = 0.12;
        salida = entrada + (entrada * porcentaje);

        System.out.println("Entrada: " + entrada);
        System.out.println("12% de la entrada: "
                + (entrada * porcentaje));
        System.out.println("Salida: " + salida);

        // ETAPA 4: SUMA DE N VALORES ENTEROS
        System.out.println("\n--- ETAPA 4: SUMA DE ENTEROS ---");

        entrada = salida;

        System.out.print("Cuantos numeros enteros deseas sumar? ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            sc.close();
            return;
        }

        int sumaEnteros = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el numero " + i + ": ");
            int numero = sc.nextInt();
            sumaEnteros += numero;
        }

        salida = entrada + sumaEnteros;

        System.out.println("Entrada: " + entrada);
        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Salida: " + salida);

        // ETAPA 5: DIVISION ENTRE 1 Y 9
        System.out.println("\n--- ETAPA 5: DIVISOR ---");

        entrada = salida;
        int divisor;

        do {
            System.out.print("Elige un divisor del 1 al 9: ");
            divisor = sc.nextInt();
        } while (divisor < 1 || divisor > 9);

        salida = entrada / divisor;

        System.out.println("Entrada: " + entrada);
        System.out.println("Divisor: " + divisor);
        System.out.println("Salida: " + salida);

        // ETAPA FINAL: SWITCH SEGUN EL MES
        System.out.println("\n--- RESULTADO FINAL ---");

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.printf(
                    "Mes non. Resultado: %.4f%n", salida);
                break;

            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 12:
                System.out.printf(
                    "Mes par. Resultado: %.0f%n", salida);
                break;
        }
        // final del programa
        sc.close();
    }
}

