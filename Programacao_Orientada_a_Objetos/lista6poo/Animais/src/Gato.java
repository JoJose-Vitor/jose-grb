public class Gato implements Animal{
    private String nome;
    private String corDoPelo;
    private String raca;
    private double peso;
    private int idade;

    public Gato(String nome, String raca, String corDoPelo){
        this.nome = nome;
        this.raca = raca;
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void comer() {
        System.out.println("O gato caça um rato, ao achar, o gato come o rato");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!!");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCorDoPelo(){
        return this.corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo){
        this.corDoPelo = corDoPelo;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

}
