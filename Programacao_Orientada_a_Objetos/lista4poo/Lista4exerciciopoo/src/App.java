public class App {
    public static void main(String[] args) throws Exception {
        Baralho baralho = new Baralho();
        baralho.legalModerno = true;
        baralho.nomeDono = "Gary";
        baralho.nomeJogo = "Pokemon";
        baralho.quantidadeCartas = 60;

        Cartas cartas = new Cartas();
        cartas.alturaMm = 70;
        cartas.larguraMm = 40;
        cartas.bemConservada = true;
        cartas.nomeCarta = "Pikachu EX";
        cartas.anoLancamento = 2023;

        CampeonatoTCG campeonatoTCG = new CampeonatoTCG();
        campeonatoTCG.quantidadeJogadores = 32;
        campeonatoTCG.nomedoJogo = "Pokemon";
        campeonatoTCG.formatoModerno = true;
        campeonatoTCG.valorInscricao = 50;

        baralho.ImprimirDetalhes();
        cartas.ImprimirDetalhes();
        campeonatoTCG.ImprimirDetalhes();
    }
}
