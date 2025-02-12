import java.util.HashMap;
import java.util.Map;

public class BibliotecaMusical {
    private Map<String, Musica> acervo = new HashMap<>();

    public void adicionarMusica(String titulo, Musica musica){
        acervo.put(titulo, musica);
    }

    public void listarMusicas(){
        System.out.println(acervo.keySet());
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException{
        if(acervo.containsKey(titulo)){
            return acervo.get(titulo);
        }else{
            throw new MusicaNaoEncontradaException();
        }
    }

    public Map<String, Musica> getAcervo(){
        return this.acervo;
    }

    public void setAcervo(HashMap<String, Musica> acervo){
        this.acervo = acervo;
    }

}
