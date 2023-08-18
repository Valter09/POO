import java.util.Scanner;
public class meses {
    public static Scanner leia=new Scanner (System.in);
    public static void main (String args[]){
        int mes;

        twice(mes=leia.nextInt());
          }
          public static void twice(int mes){
            switch (mes){

                case 1:
                System.out.println("janeiro");
                break;

                case 2:
                System.out.println("favereiro");
                break;
    
                case 3:
                System.out.println("março");
                break;
    
                case 4:
                System.out.println("abril");
                break;
    
                case 5:
                System.out.println("maio");
                break;
    
                case 6:
                System.out.println("junho");
                break;
                
    
                case 8:
                System.out.println("agosto");
                break;
    
                case 9:
                System.out.println("setembro");
                break;
    
                case 10:
                System.out.println("outubro");
                break;
                    
                case 12:
                System.out.println("dezembro");
                break;
    
                default:
                System.out.println("O valor é inválido");
    
        }
    
    }
    }

