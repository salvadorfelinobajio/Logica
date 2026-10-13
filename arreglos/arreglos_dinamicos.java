import java.util.Scanner;

public class arreglos_dinamicos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        // Leer los diez números
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Inicializar mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 1;
        int posMenor = 1;

        // Recorrer el arreglo
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i + 1;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i + 1;
            }
        }

        // Mostrar resultados
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("Su posicion es: " + posMayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("Su posicion es: " + posMenor);

        entrada.close();
    }
}

}

