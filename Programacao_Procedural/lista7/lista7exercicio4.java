package Programacao_Procedural.lista7;
import java.util.Scanner;

public class lista7exercicio4 {
    public static int[] LimiteDePeso(int[] peso){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 12; i++){

            System.out.println("Insira o peso em Toneladas do " + (i + 1) + "º dos 12 vagões: ");
            peso[i] = scanner.nextInt();
        }

        return peso;
    }
    public static void main(String[] args) {

            int[] listavagao = new int[12];

            listavagao = LimiteDePeso(listavagao);

            for(int j = 0; j < 12; j++){

                if(listavagao[j] > 50){

            System.out.println((j + 1) + "º vagao ultrapassou o limite de peso");
                }
            }
    }
}
