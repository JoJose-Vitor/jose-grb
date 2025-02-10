import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import carta.Carta;
import carta.CartaDesarme;
import carta.CartaExplosao;

public class App {
    public static void main(String[] args) throws Exception {
        CartaExplosao cartaExplosao = new CartaExplosao();
        Carta carta = new CartaDesarme();
        carta.exibirInformacoes();

    Random random = new Random();

    random.nextInt(10);
    random.nextInt();
    random.nextInt(50, 100);
    }
}
