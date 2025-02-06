import java.util.ArrayList;
import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){

        ArrayList<Produto> novaLista = new ArrayList<Produto>();
        Produto novoProduto = new Produto("", 0, 0);
        Loja novaLoja = new Loja("", "", true, novaLista);

        novoProduto.setNomeProduto("Jornal do dia");
        novoProduto.setQuantidadeNoEstoque(30);
        novoProduto.setPreco(9.90);

        Produto novoProduto2 = new Produto("", 0, 0);
        novoProduto2.setNomeProduto("Revista esportiva");
        novoProduto2.setQuantidadeNoEstoque(16);
        novoProduto2.setPreco(17.50);

        Produto novoProduto3 = new Produto("", 0, 0);
        novoProduto3.setNomeProduto("Historia em Quadrinhos do Batman");
        novoProduto3.setQuantidadeNoEstoque(8);
        novoProduto3.setPreco(25.80);

        novaLoja.setNomeLoja("Jornais do João");
        novaLoja.setDono("João dos Jornais");
        novaLoja.setHoraAbre(8);
        novaLoja.setHoraFecha(19);
        novaLoja.setAberta(novaLoja.lojaAbreFecha(15));

        novaLoja.adicionaProduto(novoProduto);
        novaLoja.adicionaProduto(novoProduto2);
        novaLoja.adicionaProduto(novoProduto3);
        novaLoja.listaProdutos();
    }
}