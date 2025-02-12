import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    private List<T> acervo = new ArrayList<>();

    public void adicionarItem(T item){
        acervo.add(item);
    }

    public void listarItens(){
        for (int i = 0; i < acervo.size(); i++) {
            acervo.get(i).exibirInfo();
        }
    }

    public T buscarItem(String titulo){
        for (int j = 0; j < acervo.size(); j++) {
            if(acervo.get(j) instanceof Filme){
                if(((Filme) acervo.get(j)).getTitulo().equals(titulo)){
                    acervo.get(j).exibirInfo();
                    return acervo.get(acervo.indexOf(acervo.get(j)));
                }
            }
        }
        for (int k = 0; k < acervo.size(); k++) {
            if(acervo.get(k) instanceof Jogo){
                if(((Jogo) acervo.get(k)).getTitulo().equals(titulo)){
                    acervo.get(k).exibirInfo();
                    return acervo.get(acervo.indexOf(acervo.get(k)));
                }
            }
        }
        return null;
    }
}



