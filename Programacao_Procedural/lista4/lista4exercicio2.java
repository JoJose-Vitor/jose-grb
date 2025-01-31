package Programacao_Procedural.lista4;

import java.util.Scanner;

public class lista4exercicio2 {
    public static void main(String[] args){

        int altura;
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int j;
        
        System.out.println("Insira uma altura entre 1 e 9: ");
        altura = scanner.nextInt();

        while (altura >= 10 || altura <=0){

            System.out.println("Altura inválida, insira uma altura entre 1 e 9");
            altura = scanner.nextInt();

        }

        while (i <= altura){
            
            for (j = altura - 1; j >=0; j--){
                
                if ((altura - j) <= i){

                System.out.print(altura - j);
                }
            }
            i++;
            System.out.print("\r\n");
        }
    }
}