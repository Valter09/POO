import java.util.Scanner;
public class Mes2 {
    public static void main(String[] args){
     Scanner leia = new Scanner(System.in); 
        int mes;
        System.out.println("Digite o número do mês:");
        
        mes=leia.nextInt();
        exibirMes(mes);

}
public static void exibirMes(int mes){
    String texto="";
    switch(mes){
        case 1:
        texto="janeiro";
        break;
        case 2:
        texto="fevereiro";
        break;
        case 3:
        texto="março";
        break;
        case 4:
        texto="abril";
        break;
        case 5:
        texto="maio";
        break;
        case 6:
        texto="junho";
        break;
        case 7:
        texto="julho";
        break;
        case 8:
        texto="agosto";
        break;
        case 9:
        texto="setembro";
        break;
        case 10:
        texto="outubro";
        break;
        case 11:
        texto="novembro";
        break;
        case 12:
        texto="dezembro";
        break;
        default:
        texto="mês invalido";
 }
 System.out.println(texto);
}
 }
