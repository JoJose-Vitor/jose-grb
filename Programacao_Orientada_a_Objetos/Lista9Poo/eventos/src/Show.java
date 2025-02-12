import java.util.ArrayList;
import java.util.List;

public class Show extends Evento{
    private List<String> artistas = new ArrayList<>();

    public Show(String nome, String local, String data, List<String> artistas){
        super(nome, local, data);
        this.artistas = artistas;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.print("Artistas:");
        for (int i = 0; i < this.artistas.size(); i++){
            System.out.print(" " + this.artistas.get(i));            
        }
        System.out.println("\r");
    }

    @Override
    public void comecarEvento() {
        System.out.println("O Show começou!!");
    }

    public void comecarEvento(boolean comAplausos){
        if(comAplausos){
            System.out.println("Clap clap clap clap!");
        }else{
            System.out.println("cri cri cri cri...");
        }
    }

    public List<String> getArtistas(){
        return this.artistas;
    }

    public void setArtistas(String artistas){
        this.artistas.add(artistas);
    }
}
