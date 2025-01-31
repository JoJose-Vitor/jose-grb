package lista6;

import java.util.Scanner;

public class lista6exercicio4 {
    public static void main(String[] args){
        int i;
        int j;
        int t;
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);
        int[][] tabuleiro = new int[3][3];

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.println("Informe o valor da matriz posicao linha " + (i + 1) + " e coluna " + (j + 1));
                tabuleiro[i][j] = scanner.nextInt();
            }
        }
        for(t = 0; t < 3; t++){
            tabuleiro[t][(2 - t)] = tabuleiro[t][(2 - t)] * 2;
        }

        for(x = 0; x < 3; x++){
            for(y = 0; y < 3; y++){
                System.out.print(tabuleiro[x][y] + "|");
            }
            System.out.println("\r");
        }
}
}

