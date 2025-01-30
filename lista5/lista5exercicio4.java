package lista5;

import java.util.Scanner;

public class lista5exercicio4 {
    public static void main(String[] args){
        int numero;
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Números ímpares serão somados, ao digitar um número negativo o programa irá parar e realizar a soma!");
        
        do{
        System.out.println("Digite um número inteiro:");
        numero = scanner.nextInt();
        if((numero % 2) != 0 && numero >=0){
            soma = soma + numero;
        }
        }while(numero >= 0);
        System.out.println("O somatorio de impares eh: " + soma);
    }
}
