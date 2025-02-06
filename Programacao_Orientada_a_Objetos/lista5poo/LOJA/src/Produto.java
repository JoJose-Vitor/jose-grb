import java.util.Scanner;

public class Produto {

    private String nomeProduto;
    private int quantidadeNoEstoque;
    private double preco;

    Scanner scanner = new Scanner(System.in);

    public Produto(String nomeProduto, int quantidadeNoEstoque, double preco){
        this.nomeProduto = nomeProduto;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
        this.preco = preco;
    }

    public void reporEstoque(){
        System.out.println("Quantas unidades ira repor no estoque: ");
        int quantidadeReposta = scanner.nextInt();
        quantidadeNoEstoque = quantidadeNoEstoque + quantidadeReposta;
    }

    public void vender(){
        System.out.println("Quantas unidades do produto quer comprar?");
        int quantidadeComprada = scanner.nextInt();
        if(quantidadeNoEstoque >= quantidadeComprada){
        System.out.println("Total da compra: R$" + (preco * quantidadeComprada) + "\r Compra efetuada!");
        quantidadeNoEstoque = quantidadeNoEstoque - quantidadeComprada;
        }else{
            System.out.println("Quantidade insuficiente no estoque!");
        }
    }

    public void ImprimirDetalhes(){
        System.out.println(nomeProduto);
        System.out.println(quantidadeNoEstoque);
        System.out.println(preco);
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeNoEstoque(){
        return this.quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque){
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
}
