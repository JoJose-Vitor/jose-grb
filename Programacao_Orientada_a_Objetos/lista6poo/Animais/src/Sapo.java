public class Sapo implements Animal{
    private String nome;
    private String especie;
    private boolean ehVenenoso;
    private String cor;
    private double peso;

    public Sapo(String especie, boolean ehVenenoso, String cor){
        this.especie = especie;
        this.ehVenenoso = ehVenenoso;
        this.cor = cor;
    }

    @Override
    public void comer() {
        System.out.println("O sapo avista uma mosca, abre sua boca e dispara sua longa língua para capturar a mosca e levá-la a sua boca.");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Croac!!");    
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEspecie(){
        return this.especie;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

    public boolean getEhVenenoso(){
        return this.ehVenenoso;
    }

    public void setEhVenenoso(boolean ehVenenoso){
        this.ehVenenoso = ehVenenoso;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

}
