package Programacao_Procedural.lista3;
import java.util.Scanner;

public class lista3exercicio2 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int quantia;

        double valor;
        
        int i = 1;

        double total = 0; 

        System.out.println("Insira a quantidade de itens comprados:");
        quantia = scanner.nextInt();

        while (i <= quantia){
            System.out.println("Insira o valor do produto número " + i + ":");
            valor = scanner.nextDouble();

            total = total + valor;

            i++;
        }

        if(total > 150){
            System.out.println("Parabéns! Voce ganhou frete gratis em sua compra de valor " + total);
        }else{
            System.out.println("A compra nao possui frete gratis");
        }

    }

}
