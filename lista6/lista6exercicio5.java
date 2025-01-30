package lista6;

import java.util.Scanner;

public class lista6exercicio5 {
    public static void main(String[] args){
        int i = 0;
        int j;
        int Numero;
        int [] ListaNumeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Digite um número inteiro, caso seu valor seja entre 10 e 50 ele sera armazenado, ate no maximo 10 numeros: ");
            Numero = scanner.nextInt();
            if(Numero >= 10 && Numero <= 50){
                ListaNumeros[i] = Numero;
                i++;
            }
        }while(i < 10);
        for(j = 0; j < 10; j++){
        System.out.println(ListaNumeros[j]);
        }
}
}
