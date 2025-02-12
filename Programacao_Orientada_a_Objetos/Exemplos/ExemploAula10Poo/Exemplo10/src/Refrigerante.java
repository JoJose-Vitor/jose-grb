public class Refrigerante implements Liquido{
    private String sabor = "uva";
    private boolean estahComGas = false;

    public String getSabor(){
        return this.sabor;
    }

    public boolean getEstahComGas(){
        return this.estahComGas;
    }
}
