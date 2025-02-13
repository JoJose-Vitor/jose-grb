import java.util.ArrayList;
import java.util.List;

public class ex {
        List<Musica> playlist = new ArrayList<>();

        public void exemplo() {
            playlist.add(new Musica(0, "Lanca perfume", 180, true));
        System.out.println(playlist.get(0).getTitulo().compareTo(null));

        List<Curso> instituto = new ArrayList<>();
        List<Modalidade> modalidades = new ArrayList<>(List.of
                                                    (Modalidade.PRESENCIAL, Modalidade.EAD));

        instituto.add(new Curso(0,"Ciencia da Computacao", modalidades));
        instituto.add(new Curso(1,"Matemática Aplicada", new ArrayList<>(List.of
                                                                    (Modalidade.PRESENCIAL))));
        instituto.add(new Curso(2,"Quimica", new ArrayList<>(List.of
                                                        (Modalidade.EAD))));
        }
        

   /*  ex01
    Max Score: 2 | Difficulty: Not Specified
    Dada a classe Música abaixo, crie um programa que contenha uma lista de 5 músicas.
    Seu programa deve ter um laço de repetição que percorra todas as músicas
    e imprima o nome daquelas que estiverem favoritadas.
    
    Exemplo de entrada:
    1
    Thriller
    354
    true
    2
    Hey Jude
    421
    false
    3
    Bohemian Rhapsody
    357
    false
    4
    Skyline Pidgeon
    210
    true
    5
    Smooth Criminal
    412
    true
    
    Saída esperada:
    Thriller
    Skyline Pidgeon
    Smooth Criminal
    */
}