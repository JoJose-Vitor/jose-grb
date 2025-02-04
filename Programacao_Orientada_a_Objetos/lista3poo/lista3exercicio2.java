package Programacao_Orientada_a_Objetos.lista3poo;

import java.util.Scanner;

public class lista3exercicio2 {
    public static int[] Notas = new int[3];
    public static Scanner scanner = new Scanner(System.in);

    public static int NotasCriticos(int InformeNotas){

        for(int i = 0; i < Notas.length; i++){
            System.out.println("Informe a " + (i + 1) + "ª nota do filme: ");
            InformeNotas = scanner.nextInt();
            Notas[i] = InformeNotas;
        }
        return InformeNotas;
    }

    public static int Media(int MediaNotas){

        int CalculaMedia = 0;

            for(int j = 0; j < Notas.length; j++){
            CalculaMedia = Notas[j] + CalculaMedia;
        }

        MediaNotas = CalculaMedia / 3;

        System.out.println(MediaNotas);

        return MediaNotas;
    }
    public static void main(String[] args) {
    
        NotasCriticos(0);
        Media(0);
    
    }

}
