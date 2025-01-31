package Programacao_Procedural.lista7;

import java.util.Scanner;

public class lista7exercicio3 {
    
    public static String ClassificarNadador(String categoria){
        int idade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a idade do nadador:");
        idade = scanner.nextInt();

            if (idade <= 17){
                if (idade < 15){
                    if (idade < 12){
                        categoria = "Infantil";
                    }else{
                        categoria = "Juvenil A";}
                }else{
                        categoria = "Juvenil B";}
                }else{
                        categoria = "Adulto";}

            return categoria;

            }
    public static void main(String[] args){
        System.out.println(ClassificarNadador(null));
    }

    }
    
