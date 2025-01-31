package Programacao_Procedural.lista2;
import java.util.Scanner;

public class lista2exercicio3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String nome;

        System.out.println("Informe o nome  da criança: ");
        nome = scanner.nextLine();

        switch (nome) {

            case "Filomena":
            System.out.println("Rotina de Filomena:\r\n" + //
                                "1. Escola das 07h as 12h\r\n" + //
                                "2. Almoço das 12h as 13\r\n" + //
                                "3. Futebol das 14h as 16h\r\n" + //
                                "4. Dever de casa das 16h as 18h");
            break;

            case "Joselito":
            System.out.println("Rotina de Joselito:\r\n" + //
                                "1. Escola das 07h as 12:30\r\n" + //
                                "2. Almoço das 13h as 14h\r\n" + //
                                "3. Natação das 14h as 16h\r\n" + //
                                "4. Reforço escolar das 16h as 19h");

            break;

            default:
            System.out.println("Nome incorreto!");
            break;
        }
    }
}
