import java.util.List;

public class Filme implements AudioVisual{
    private String titulo;
    private String diretor;
    private List<String> atores;

    public Filme(String titulo, String diretor, List<String> atores){
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Filme: " + this.titulo);
        System.out.println("Diretor: " + this.diretor);
        System.out.print("Atores: ");
        for (int i = 0; i < this.atores.size(); i++) {
            System.out.print(" " + this.atores.get(i));
        }
        System.out.println("\r");
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDiretor(){
        return this.diretor;
    }
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public List<String> getAtores(){
        return this.atores;
    }
    public void setAtores(List<String> atores){
        this.atores = atores;
    }
}
