import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Filme filme = new Filme("A hora do rush", "Brett Ratner", new ArrayList<>(
            List.of("Jackie Chan", "Chris Tucker")));
        Jogo jogo = new Jogo("Mineirinho Ultra Adventure", "PC");
        Locadora<AudioVisual> locadora = new Locadora<>();
        locadora.adicionarItem(filme);
        locadora.adicionarItem(jogo);
        locadora.listarItens();

        locadora.buscarItem("A hora do rush");
        locadora.buscarItem("Mineirinho Ultra Adventure");
    }
}
