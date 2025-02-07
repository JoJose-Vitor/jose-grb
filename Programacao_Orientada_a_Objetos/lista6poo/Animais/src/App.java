public class App {
    public static void main(String[] args) throws Exception {

        Gato novoGato = new Gato("Garfield", "Persa", "Laranja");
        Sapo novoSapo = new Sapo("sapo-comum", false, "Marrom");

        novoGato.comer();
        novoGato.emitirSom();
        novoSapo.comer();
        novoSapo.emitirSom();

    }
}
