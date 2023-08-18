import java.util.Scanner;
public class Lampada {
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args []){
        int num;
        System.out.println("Digite 1 para ligar, 2 para desligar: ");
        num = leia.nextInt();
        if(num == 1){
            acender(num);
        }
        else if(num == 2){
            apagar(num);
        }
        else if (num > 2){
            System.out.println("Deu erro.");
        }

        }


        public static void acender(int num){
            System.out.println("Lâmpada acesa");
        }

        public static void apagar(int num){
            System.out.println("Lâmpada apagada");
        }
    }
