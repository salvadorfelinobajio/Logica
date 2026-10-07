import java.util.Scanner;

public class calculonomina {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        System.out.println ("ingrese su nombre");
        String nombre = lector.nextLine();
        System.out.println ("insgrese su SB");
        double SB = lector.nextDouble();
        System.out.println ("cuantos dias trabajo en la semana");
        int dias = lector.nextInt();

        double salarioConBono = SB * 0.15;
        double sancion =  SB + .10;


          double total = 0;
        for (int i=1; i <= dias; i++) { 
            System.out.println("ingrese el numero de horas trabajadas el dia"+i+"?");
            int horas = lector.nextInt(); 
            total= total + horas;
        }
          double salario = SB + total;

          if ( total > 40 && dias > 5) {
            System.out.println ("usted es acredor a un bono del 15%");
            System.out.println ("su sueldo neto es de" + salario + salarioConBono);
            } else {
                System.out.println ("usted tuvo una sancion del 10%"); 
                System.out.println ("su sueldo neto es de"+ (salario - sancion));
                
            }
        }
    }



        

         
    





    
      