import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class App {
    public static void main(String[] args) throws Exception {
        List<Musica> playlist = new ArrayList<>();
        System.out.println("Bem vindo a PlayList, temos espaço para 5 músicas e retornamos suas favoritas!");
        
        for (int i = 0; i < 5; i++) {

            Scanner scanner = new Scanner(System.in);

            playlist.add(new Musica());
            
            playlist.get(i).setId(i + 1);

            System.out.println("Insira o nome da " + (i + 1) + "ª música: ");
            playlist.get(i).setTitulo(scanner.nextLine());
            System.out.println("Insira o tempo em segundos da " + (i + 1) + "ª música: ");
            playlist.get(i).setTempoEmSegundos(scanner.nextInt());
            System.out.println("Caso a " + (i + 1) + "ª música esteja favoritada, insira true, do contrário, insira false: ");
            playlist.get(i).setEstaFavoritada(scanner.nextBoolean());
        }

        for (int i = 0; i < playlist.size(); i++) {
            if(playlist.get(i).getEstaFavoritada())
                System.out.println(playlist.get(i).getTitulo());
        }
    }
}
