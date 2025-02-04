package Programacao_Orientada_a_Objetos.lista3poo;

import java.util.Scanner;

public class lista3exercicio3 {

    public static String SaoIguais(String Palavra1, String Palavra2){

        String Palavras = "";

        if(Palavra1.equals(Palavra2)){
            Palavras = "As palavras sao identicas";

            System.out.println(Palavras);

            return Palavras;
        }else{
            if(Palavra1.equalsIgnoreCase(Palavra2)){
                Palavras = "As palavras sao iguais ignorando maiusculo e minusculo";

                System.out.println(Palavras);

                return Palavras;
            }else{
                Palavras = "As Palavras sao diferentes";

                System.out.println(Palavras);
            }
        }
        return Palavras;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira palavra para comparar: ");
        String PrimeiraPalavra = scanner.nextLine();

        System.out.println("Informe a segunda palavra para comparar: ");
        String SegundaPalavra = scanner.nextLine();

        SaoIguais(PrimeiraPalavra, SegundaPalavra);
    }
    
}
