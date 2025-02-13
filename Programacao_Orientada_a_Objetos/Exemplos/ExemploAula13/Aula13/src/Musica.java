public class Musica {
    private int id;
    private String titulo;
    private int tempoEmSegundos;
    private boolean estaFavoritada;

    public Musica(){
    }

    public Musica(int id, String titulo, int tempoEmSegundos, boolean estaFavoritada){
        this.id = id;
        this.titulo = titulo; 
        this.tempoEmSegundos = tempoEmSegundos;
        this.estaFavoritada = estaFavoritada;
    }

    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getTempoEmSegundos() {
        return tempoEmSegundos;
    }
    public boolean getEstaFavoritada(){
        return estaFavoritada;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setTempoEmSegundos(int tempoEmSegundos) {
        this.tempoEmSegundos = tempoEmSegundos;
    }
    public void setEstaFavoritada(boolean estaFavoritada) {
        this.estaFavoritada = estaFavoritada;
    }
}
