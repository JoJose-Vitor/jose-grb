package Programacao_Orientada_a_Objetos;

import java.util.Scanner;

public class lista2poo {
    public static boolean[][] mapa = new boolean[4][4];

    public static boolean[][] limpamapa(boolean[][] mapa){

    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            mapa[i][j] = false;
        }
    }
    return mapa;
    }

    public static boolean[][] localizacao(boolean[][] mapa){

        Scanner scanner = new Scanner(System.in);

        System.out.println("O jogador esta na linha: ");
        int PosicaoLinha = scanner.nextInt();

        System.out.println("O jogador esta na coluna: ");
        int PosicaoColuna = scanner.nextInt();

        mapa[PosicaoLinha][PosicaoColuna] = true;

    return mapa;
    }
    public static String[][] ImprimirMapa(String[][] Impressao){
        String[][] MapaImpresso = new String[4][4];
        for(int x = 0; x < 4; x++){
            for(int y = 0; y < 4; y++){
                if (mapa[x][y] == true){
                    MapaImpresso[x][y] = "|O|";
                    System.out.print(MapaImpresso[x][y]);
                }else{
                    MapaImpresso[x][y] = "|X|";
                    System.out.print(MapaImpresso[x][y]);
                }
            }
            System.out.println("\r");
        }
    return MapaImpresso;
    }
    public static void main(String[] args){
        limpamapa(mapa);
        localizacao(mapa);
        ImprimirMapa(null);
    }

}
