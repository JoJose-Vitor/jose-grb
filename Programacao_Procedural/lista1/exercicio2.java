package Programacao_Procedural.lista1;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do triangulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.println("Informe a altura do triângulo: ");
        double alturaTriangulo = scanner.nextDouble();

        double area = (baseTriangulo * alturaTriangulo) / 2;

        boolean maior = (area > 20);

        System.out.println("A area do triangulo eh maior que 20? " + maior);

    }
}
