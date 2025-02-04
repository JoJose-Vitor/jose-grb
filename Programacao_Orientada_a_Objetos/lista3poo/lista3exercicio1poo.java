package Programacao_Orientada_a_Objetos.lista3poo;

import java.util.Scanner;

public class lista3exercicio1poo {
    public static int AnoAtual = 2024;

    public static int AnoNascimento(int SubtraiAno){

        SubtraiAno = AnoAtual - SubtraiAno;

        return SubtraiAno;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu ano de nascimento: ");
        int InformeAno = scanner.nextInt();

        int Idade = AnoNascimento(InformeAno);

        System.out.println("Ate o final de 2024, voce tera " + Idade + " anos.");

    }
}
