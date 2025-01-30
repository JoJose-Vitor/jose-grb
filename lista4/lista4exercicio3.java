package lista4;

public class lista4exercicio3 {
    public static void main(String[] args){

        int i = 0;
        int j = 0;
        
        char[][] tabuleiro = new char[8][8];

        while(i <= 7){

            while(j <= 7){

            if (i == 0 || i == 7){

                tabuleiro[i][j] = 'S';
                System.out.print(tabuleiro[i][j]);

            }else{
                if (j == 0 || j == 7){
                    tabuleiro[i][j] = 'S';
                    System.out.print(tabuleiro[i][j]);
                }else{
                    tabuleiro[i][j] = ' ';
                    System.out.print(tabuleiro[i][j]);
                }
            }
            j++;
            } 
            System.out.print("\r\n");
            j = 0;
            i++;
        }
    }
}
