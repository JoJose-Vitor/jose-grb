package Programacao_Procedural.lista5;
import java.util.Scanner;

public class lista5exercicio3 {
    public static void main(String[] args){
        int altura;
        int largura;
        int i;
        int j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura do retangulo: ");
        altura = scanner.nextInt();

        System.out.println("Informe a largura do retangulo: ");
        largura = scanner.nextInt();

        char[][] retangulo = new char[altura][largura];

        for (i = 0; i < altura; i++){
            for(j = 0; j < largura; j++){
                retangulo[i][j] = '*';
                System.out.print(retangulo[i][j]);
            }
            j = 0;
            System.out.println("\r");
        }
    }
}
