package Programacao_Procedural.lista6;
import java.util.Scanner;

public class lista6exercicio1 {
    public static void main(String[] args){
        int i;
        int j;
        boolean achado = true;
        String Nome;
        String Busca;
        String [] ListaNomes = new String[10];
        Scanner scanner = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.println("Digite um nome para armazenar, a lista contem 10 nomes:");
            Nome = scanner.nextLine();
            ListaNomes[i] = Nome;
        }

        System.out.println("Agora digite um nome para ser buscado na lista: ");
        Busca = scanner.nextLine();

        for(j = 0; j < 10; j++){
            if (ListaNomes[j].equals(Busca)){
                achado = true;
                break;
        }else{
            achado = false;
        }
        }
        
        if (achado == true){
            System.out.println("ACHEI");
        }else{
            System.out.println("NAO ACHEI");
        }
    }
}
