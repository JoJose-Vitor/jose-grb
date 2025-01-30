package lista5;

public class lista5exercicio5 {
    public static void main(String[] args){

        int i = 0;
        int j = 0;
        
        char[][] tabuleiro = new char[8][8];

        for (i = 0; i < 8; i++){
            for(j = 0; j < 8; j++){
                if((i % 2) == 0){
                tabuleiro[i][j] = 'C';
                System.out.print(tabuleiro[i][j]);
                }else{
                    tabuleiro[i][j] = 'i';
                System.out.print(tabuleiro[i][j]);
                }
            }
            j = 0;
            System.out.println("\r");
        }
}
}
