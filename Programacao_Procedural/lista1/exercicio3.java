package Programacao_Procedural.lista1;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em centavos: ");
        int valor = scanner.nextInt();

        int centavos = valor % 100;
        int reais = valor / 100;
        System.out.println("O total em dinheiro eh: " + reais + " real(is) e " + centavos + " centavo(s)");

    }
}
