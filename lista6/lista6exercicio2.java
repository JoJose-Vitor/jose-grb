package lista6;
import java.util.Scanner;

public class lista6exercicio2 {
    public static void main(String[] args){
        int i;
        int j;
        String Nome;
        String [] ListaNomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.println("Digite um nome para armazenar, a lista contem 10 nomes:");
            Nome = scanner.nextLine();
            ListaNomes[i] = Nome;
        }

        for(j = 9; j >= 0; j--){
            if(j % 2 == 0){
                System.out.println(ListaNomes[j]);
            }
        }
    }
}
