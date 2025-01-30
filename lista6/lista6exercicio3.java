package lista6;
import java.util.Scanner;

public class lista6exercicio3 {
    public static void main(String[] args){
        int soma;
        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        int[][] tabuleiro = new int[3][3];

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.println("Informe o valor do vetor posicao linha " + (i + 1) + " e coluna " + (j + 1));
                tabuleiro[i][j] = scanner.nextInt();
            }
        }
        soma = tabuleiro[0][0] + tabuleiro [1][1] + tabuleiro[2][2];
        System.out.println(soma);
}
}
