import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Musica musica1 = new Musica("Shine On You Crazy Diamond", "Pink Floyd", "Wish You Were Here");
        Musica musica2 = new Musica("Gold", "Prince", "The Gold Experience");
        Musica musica3 = new Musica("Stone Free", "Jimmi Hendrix", "Smash Hits");
        Musica musica4 = new Musica("Tusk", "Fleetwood Mac", "Tusk");
        Musica musica5 = new Musica("Soft nd Wet", "Prince", "For you");
        Musica musica6 = new Musica("November Rain", "Guns N' Roses", "Use your Illusion I");
    
        BibliotecaMusical biblioteca = new BibliotecaMusical();

        biblioteca.adicionarMusica(musica1.getTitulo(), musica1);
        biblioteca.adicionarMusica(musica2.getTitulo(), musica2);
        biblioteca.adicionarMusica(musica3.getTitulo(), musica3);
        biblioteca.adicionarMusica(musica4.getTitulo(), musica4);
        biblioteca.adicionarMusica(musica5.getTitulo(), musica5);
        biblioteca.adicionarMusica(musica6.getTitulo(), musica6);

        biblioteca.listarMusicas();

        try {

            Scanner scanner = new Scanner(System.in);

            String musicaPesquisada = scanner.nextLine();
            biblioteca.buscarMusica(musicaPesquisada);
            System.out.println(String.format(
                """
                Nome da música: %s
                Artista: %s
                Album: %s    
                """,
                biblioteca.getAcervo().get(musicaPesquisada).getTitulo(),
                biblioteca.getAcervo().get(musicaPesquisada).getArtista(),
                biblioteca.getAcervo().get(musicaPesquisada).getAlbum()
                )
            );
        } catch (Exception e) {
            System.out.println("A musica nao foi encontrada no acervo!");
        }

    }
}
