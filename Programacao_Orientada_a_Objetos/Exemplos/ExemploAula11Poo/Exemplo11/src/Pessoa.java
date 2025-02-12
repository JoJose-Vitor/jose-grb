public class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public void setCNome(String nome){
        this.nome = nome;
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(this.cpf);
    }

    @Override
    public boolean equals(Object object){
        if(object instanceof Pessoa){
            Pessoa pessoa = (Pessoa) object;
            if(pessoa.cpf.equals(this.cpf)){
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString(){
        return String.format(
            """
            Nome: %s,
            Cpf: %s   
            """
            ,
            this.nome,
            this.cpf
            );
    }
}
