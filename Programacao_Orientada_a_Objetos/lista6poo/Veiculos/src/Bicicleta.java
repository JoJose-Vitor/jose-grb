public class Bicicleta implements Veiculo{
    private String modelo;
    private String cor;
    private int quantasMarchas;
    private int aroDaRoda;
    private Boolean pneuCalibrado;

    public Bicicleta(String modelo, String cor, int aroDaRoda, boolean pneuCalibrado){
        this.modelo = modelo;
        this.cor = cor;
        this.aroDaRoda = aroDaRoda;
        this.pneuCalibrado = pneuCalibrado;
    }

    @Override
    public void acelerar() {
        System.out.println("Zoom!");
    }

    @Override
    public void frear() {
        System.out.println("Hrrrrr!");
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getQuantasMarchas(){
        return this.quantasMarchas;
    }

    public void setQuantasMarchas(int quantasMarchas){
        this.quantasMarchas = quantasMarchas;
    }

    public int getAroDaRoda(){
        return this.aroDaRoda;
    }

    public void setAroDaRoda(int aroDaRoda){
        this.aroDaRoda = aroDaRoda;
    }

    public boolean getPneuCalibrado(){
        return this.pneuCalibrado;
    }

    public void setPneuCalibrado(boolean pneuCalibrado){
        this.pneuCalibrado = pneuCalibrado;
    }
    
}
