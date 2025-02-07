public class Carro implements Veiculo{
    private String modelo;
    private int anoFabricacao;
    private int quantosLugares;
    private String cor;
    private boolean temCombustivel;

    public Carro(String modelo, int quantosLugares, String cor, boolean temCombustivel){
        this.modelo = modelo;
        this.quantosLugares = quantosLugares;
        this.cor = cor;
        this.temCombustivel = temCombustivel;
    }

    @Override
    public void acelerar() {
        System.out.println("Vruuuuuuuum!!!");
    }

    @Override
    public void frear() {
        System.out.println("Skrrrrrr!");
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAnoFabricacao(){
        return this.anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao){
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuantosLugares(){
        return this.quantosLugares;
    }

    public void setQuantosLugares(int quantosLugares){
        this.quantosLugares = quantosLugares;
    }

    public String getCor(){
        return this.cor;
    }

    public void setcor(String cor){
        this.cor = cor;
    }

    public boolean getTemCombustivel(){
        return this.temCombustivel;
    }

    public void setTemCombustivel(boolean temCombustivel){
        this.temCombustivel = temCombustivel;
    }
}
