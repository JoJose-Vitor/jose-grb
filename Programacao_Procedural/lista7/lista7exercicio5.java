package Programacao_Procedural.lista7;

import java.util.Scanner;

public class lista7exercicio5 {

    public static int[][] Tabuleiro(int[][] posicoes){
        
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
            System.out.println("Insira um numero entre 0 e 9 da posicao linha " + (i + 1) + " e coluna " + (j + 1) + ", 0 representa uma balista: ");
            int identificacao = scanner.nextInt();
            if(identificacao >= 0 && identificacao <=9){
                posicoes[i][j] = identificacao;
            }else{
                do{
                    System.out.println("Numero inválido! \r\n" + 
                    "Insira um numero entre 0 e 9 da posicao linha " + (i + 1) + " e coluna " + (j + 1) + ", 0 representa uma balista: ");
                    identificacao = scanner.nextInt();
                    posicoes[i][j] = identificacao;
                }while(identificacao > 9 || identificacao < 0);
            }
            }
        }
        return posicoes;
    }

    public static boolean ExisteBalista(boolean cuidado){

        int[][] ProcurarBalista = new int[4][4];

        ProcurarBalista = Tabuleiro(ProcurarBalista);

        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 4; y++){
                if(ProcurarBalista[x][y] == 0){
                    cuidado = true;
                    return cuidado;
                }else{
                    cuidado = false;
                }
            }
        }
        return cuidado;
    }
    public static void main(String[] args){

        boolean achado = false;

        achado = ExisteBalista(achado);

        if(achado == true){
            System.out.println("Fique atento! Existem balistas no tabuleiro!");
        }else{
            System.out.println("Não há balistas no Tabuleiro!");
        }
    }

}
