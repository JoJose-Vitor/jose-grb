public class App {
    public static void main(String[] args) throws Exception {
        Musica musica = new Musica();
        musica.melodia = "la lala laiala lelele";
        musica.cifra = "G D Em C";
        musica.temLetra = true;
        musica.letra = "Joao roubou pao na casa do Joao";

        Musico guitarrista = new Musico();
        guitarrista.ehCantor = false;
        guitarrista.idade = 13;
        guitarrista.ehInstrumentista = true;
        guitarrista.instrumento = "Guitarra";
        guitarrista.nome = "Pedro";

        Musico cantor = new Musico();
        cantor.ehCantor = true;
        cantor.idade = 27;
        cantor.instrumento = "Voz";
        cantor.nome = "Davi";

        musica.musicos.add(guitarrista);
        musica.musicos.add(cantor);

        musica.tocarMusica();

        musica.ImprimirDetalhes();

        System.out.println(musica.musicos.size());

        System.out.println(musica.melodia + " " + musica.cifra + " " + musica.letra);

        musica.cifra = "G D Em C Bm"; 

        System.out.println(String.format("%s %s %s", musica.melodia, musica.cifra, musica.letra));
    }
}