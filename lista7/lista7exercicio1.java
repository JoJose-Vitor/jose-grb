package lista7;
import java.util.Scanner;

public class lista7exercicio1 {
    
    public static boolean parouimpar(boolean res){

        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro e verificaremos se eh par: ");
        numero = scanner.nextInt();
        if(numero % 2 == 0){
            res = true;
        }else{
            res = false;
        }
        return res; 
   }
   public static void main(String[] args){
        System.out.println(parouimpar(true));
   }
}
