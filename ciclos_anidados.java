import java.util.Scanner;

public class ciclos_anidados {
    public static void main(String[] args){
       

        Scanner lector = new Scanner(System.in);
        double preciofresa =15;
        double precioLimon =12;
        double precioCoco =18;

        int totalFresa =0;
        int totalLimon =0;
        int totalCoco =0;

        for(int dia=1; dia<=2; dia++){
            System.out.println("Dia " + dia);
            System.out.println("Cuantas paletas de fresa se vendieron?");
            int fresa = lector.nextInt();
            totalFresa += fresa;

            System.out.println("Cuantas paletas de limon se vendieron?");
            int limon = lector.nextInt();
            totalLimon += limon;

            System.out.println("Cuantas paletas de coco se vendieron?");
            int coco = lector.nextInt();
            totalCoco += coco;
        }
    
    }
}

