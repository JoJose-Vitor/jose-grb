public class App {
    public static void main(String[] args) throws Exception {
        ClasseFile tabuada = new ClasseFile();
        tabuada.checarSeDiretorioExiste();
        tabuada.criarTabuada();
        tabuada.lerLinha8();
    }
}
