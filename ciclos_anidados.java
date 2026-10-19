import java.util.Scanner;

public class ciclos_anidados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] sabores = {"Fresa", "Limón", "Coco"};
        double[] precios = {15.0, 12.0, 18.0};
        
        int totalDias = 2;
        int totalSabores = 3;
        
       
        for (int dia = 1; dia <= totalDias; dia++) {
            System.out.println("=== Registro de Ventas - Día " + dia + " ===");
            int paletasDia = 0;
            double dineroDia = 0.0;
            
            for (int i = 0; i < totalSabores; i++) {
                System.out.print("Cantidad de paletas de " + sabores[i] + " ($" + precios[i] + ") vendidas: ");
                int cantidad = scanner.nextInt();
                
                
                paletasDia += cantidad;
                dineroDia += cantidad * precios[i];
            }
            
            
            System.out.println("\nResultados del Día " + dia + ":");
            System.out.println("- Total de paletas vendidas: " + paletasDia);
            System.out.println("- Dinero recaudado: $" + dineroDia);
            System.out.println("----------------------------------------\n");
        }
        
        scanner.close();
    }
}