package Programacao_Orientada_a_Objetos;

import java.util.Scanner;

public class lista1exercicio1poo {
    
    public static int[] lista = new int[10];

    public static int[] PreencherVetor(int[] lista){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Informe um valor para o vetor na " + (i + 1) + "ª posicao de 10: ");
            lista[i] = scanner.nextInt();
        }
        return lista;
    }

    public static boolean achado(boolean achei){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero para ser buscado no vetor: ");
        int Busca = scanner.nextInt();

        for(int j = 0; j < 10; j++){
            if(lista[j] == Busca){
                achei = true;
                return achei;
            }else{
                achei = false;
            }
        }
    return achei;
    }
    public static void main(String[] args){

        PreencherVetor(lista);
        
        boolean BuscarNumero = achado(false);

        if(BuscarNumero == true){
            System.out.println("ACHEI");
        }else{
            System.out.println("NAO ACHEI");
        }

    }

}
