import exceptions.NomeInvalidoException;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) throws NomeInvalidoException{
        setNome(nome);
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) throws NomeInvalidoException{
        if(!nome.isBlank()){
            this.nome = nome;
        }else{
            throw new NomeInvalidoException();
        }
        
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

}
