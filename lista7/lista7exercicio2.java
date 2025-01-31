package lista7;

import java.util.Scanner;

public class lista7exercicio2 {
        public static int maiornumero(int res){

        int i;
        int numero;
        Scanner scanner = new Scanner(System.in);
        
        for (i = 1; i <= 3; i++){

        System.out.println("Insira o " + i + "º número inteiro de 3 numeros e verificaremos qual o maior: ");
        numero = scanner.nextInt();

        if(numero >= res){
            res = numero;
        }
        }
        return res; 
   }
   public static void main(String[] args){
        System.out.println(maiornumero(0));
   }
}
