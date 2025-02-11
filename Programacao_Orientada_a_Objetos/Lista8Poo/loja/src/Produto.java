import exceptions.NomeInvalidoException;
import exceptions.PrecoInvalidoException;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) throws NomeInvalidoException, PrecoInvalidoException{
        if(nome.length() > 2){
            this.nome = nome;
        }else{
            throw new NomeInvalidoException();
        }
        if(preco > 0){
            this.preco = preco;
        }else{
            throw new PrecoInvalidoException();
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if(nome.length() > 2){
            this.nome = nome;
        }else{
            throw new NomeInvalidoException();
        }
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco) throws PrecoInvalidoException{
        if(preco >= 0){
            this.preco = preco;
        }else{
            throw new PrecoInvalidoException();
        }
    }

}
