import biblioteca.*;

public class App {
    public static void main(String[] args) throws Exception {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro(""); 

        livro.setAutor("WILLIAM");
        livro.setNome("Gnomeu e Julieta");
        livro.setAnoLancamento(1800);

        System.out.println(livro.getAutor());
        System.out.println(livro.getNome());
        System.out.println(livro.getAnoLancamento());
    }
}
