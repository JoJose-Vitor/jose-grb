package Programacao_Procedural.lista3;
import java.util.Scanner;

public class lista3exercicio1 {
    
    public static void main(String[] args){
    double salario;
    int filho;
    int i;
    Scanner scanner = new Scanner(System.in);
    double nsalario = 0;
    int nfilho = 0;
    double msalario = 0;

    for(i = 0 ; i < 20 ; i++){

        System.out.println("Informe seu salário: ");
        salario = scanner.nextDouble();
        System.out.println("Informe quantos filhos você tem: ");
        filho = scanner.nextInt();

        if(salario > msalario){
            msalario = salario;
        }
                
        nsalario = nsalario + salario;
        nfilho = nfilho + filho;

    }

    double medias = nsalario / 20;
    double mediaf = nfilho / 20;
    System.out.println( "Media salarial = " + medias + " R$\r\n" + //
                "Media do numero de filhos por habitante = " + mediaf + "\r\n" + //
                "Maior salario = " + msalario + " R$");
}
}