package Programacao_Procedural.lista2;
import java.util.Scanner;

public class lista2exercicio2 {

    public static void main(String[] agrs){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota da prova 1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a nota da prova 2:");
        double nota2 = scanner.nextDouble();
        System.out.println("Informe a nota da prova 3:");
        double nota3 = scanner.nextDouble();
        System.out.println("Informe a nota da prova 4:");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

        if(media >= 5.0){
            System.out.println("Aluno aprovado");
        }else{
            if(media < 3.0){
                System.out.println("Aluno reprovado");
        }else{
            System.out.println("Aluno em recuperacao");
        }
    }
}
}