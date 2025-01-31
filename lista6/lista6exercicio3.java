package lista6;
import java.util.Scanner;

public class lista6exercicio3 {
    public static void main(String[] args){
        int soma = 0;
        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        int[][] tabuleiro = new int[3][3];

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.println("Informe o valor da matriz posicao linha " + (i + 1) + " e coluna " + (j + 1));
                tabuleiro[i][j] = scanner.nextInt();
                if (i == j){
                    soma = soma + tabuleiro[i][j];
                }
            }
        }
        System.out.println(soma);
}
}
