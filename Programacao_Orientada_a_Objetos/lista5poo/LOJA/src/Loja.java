import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

    private String nomeLoja;
    private String nomeDono;
    private int horaAbre;
    private int horaFecha;
    private boolean aberta;
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    Scanner scanner = new Scanner(System.in);

    public Loja(String nomeLoja, String nomeDono, boolean aberta, ArrayList<Produto> produtos){
        this.nomeLoja = nomeLoja;
        this.nomeDono = nomeDono;
        this.aberta = aberta;
        this.produtos = produtos;
     }

    public boolean lojaAbreFecha(int hora){
        if (hora > horaAbre){
            if(hora < horaFecha){
                aberta = true;
            }else{
                aberta = false;
            }
        }else{
            aberta = false;
        }
        return aberta;
    }
     
    public static Produto adicionaProduto(Produto novoProduto){
        
        String novoNome = novoProduto.getNomeProduto();
        novoProduto.setNomeProduto(novoNome);

        int novaQuantidade = novoProduto.getQuantidadeNoEstoque();
        novoProduto.setQuantidadeNoEstoque(novaQuantidade);

        double novopreco = novoProduto.getPreco();
        novoProduto.setPreco(novopreco);

        produtos.add(novoProduto);
        return novoProduto;
    }    

    public static void listaProdutos(){
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getNomeProduto());            
        }
    }

    public String getNomeLoja(){
        return this.nomeLoja;
    }

    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public String getNomeDono(){
        return this.nomeDono;
    }

    public void setDono(String nomeDono){
        this.nomeDono = nomeDono;
    }

    public int getHoraAbre(){
        return this.horaAbre;
    }

    public void setHoraAbre(int horaAbre){
        this.horaAbre = horaAbre;
    }

    public int getHoraFecha(){
        return this.horaFecha;
    }

    public void setHoraFecha(int horaFecha){
        this.horaFecha = horaFecha;
    }

    public boolean getAberta(){
        return this.aberta;
    }

    public void setAberta(boolean aberta){
        this.aberta = aberta;
    }

    public ArrayList<Produto> getProdutos(){
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos){
        this.produtos = produtos;
    }

}
