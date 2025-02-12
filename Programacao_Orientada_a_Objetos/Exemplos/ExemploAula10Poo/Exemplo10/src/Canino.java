public class Canino extends Animal{

    private String cor;

    public Canino(String nomeCientifico, String cor){
        super(nomeCientifico);
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

}
