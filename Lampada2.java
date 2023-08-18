import java.util.Scanner;
public class Lampada2 {
    public static Scanner leia = new Scanner (System.in);
    public static void main (String args []){
        int Num;
        System.out.println("Digite 1 para acender e 2 para apagar:");
        numero(Num=leia.nextInt());

    }
    public static void numero(int Num){
        if(Num == 1 ){
            System.out.println( "Lâmpada acesa.");
         }else{
             System.out.println( "Lâmpada desligada.");
            }

    }
}