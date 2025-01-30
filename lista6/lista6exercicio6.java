package lista6;

import java.util.Scanner;

public class lista6exercicio6 {
        public static void main(String[] args){
        int soma = 0;
        int i;
        int j;
        char opcao;
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                System.out.println("Informe o valor do vetor posicao linha " + (i + 1) + " e coluna " + (j + 1));
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Selecione a opçao de operacao com a matriz:\r\n" + //
                        "1- Imprimir todos os elementos da matriz;\r\n" + //
                        "2 - Somar todos os elementos e exibir o resultado;\r\n" + //
                        "3 - Somar todos os elementos da terceira linha (linha de índice 2) e exibir o resultado;\r\n" + //
                        "4 - Somar os elementos da diagonal principal;\r\n" + //
                        "5 - Somar todos os elementos de índice par da segunda linha.");
        opcao = scanner.next().charAt(0);

        switch (opcao){

            case '1':
            for(x = 0; x < 3; x++){
                for(y = 0; y < 3; y++){
                    System.out.println(matriz[x][y] + "|");
                }
            }
            break;
            case '2':
            for(x = 0; x < 3; x++){
                for(y = 0; y < 3; y++){
                soma = soma + matriz[x][y];
                }
                }
                System.out.println(soma);
            break;
            case '3':
            for(x = 0; x < 3; x++){
                for(y = 0; y < 3; y++){
                    if (x == 2){
                soma = soma + matriz[x][y];
                    }
                }
                }
                System.out.println(soma);
            break;
            case '4':
            for(x = 0; x < 3; x++){
                for(y = 0; y < 3; y++){
                    if (x == y){
                soma = soma + matriz[x][y];
                    }
                }
                }
                System.out.println(soma);
            break;
            case '5':
            for(x = 0; x < 3; x++){
                for(y = 0; y < 3; y++){
                    if (x == 1){
                        if((y % 2) == 0){
                soma = soma + matriz[x][y];
                        }
                    }
                }
                }
                System.out.println(soma);
        }
    }
}
