import java.util.Scanner;

public class exercicio1{
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

        System.out.println("A media do aluno eh: " + media);
    }
}