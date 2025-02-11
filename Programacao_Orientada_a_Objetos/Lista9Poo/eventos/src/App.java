import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Show show = new Show("Orquestra sinfonica de São Paulo", "Teatro municipal", "15/02/2025", new ArrayList<>());
        show.setArtistas("Tecladista");
        show.setArtistas("Pianista");
        show.setArtistas("Trompetista");
        show.setArtistas("Flautista");

        StandUp standUp= new StandUp("Fabio Rabin Insane Comedy Show", "Avenida Paulista, 111","30/02/2025","Fabio Rabin");

        show.comecarEvento();
        show.comecarEvento(false);
        show.comecarEvento(true);
        standUp.comecarEvento();
        standUp.comecarEvento("");

        show.exibirInformacoes();
        standUp.exibirInformacoes();

    }
}
