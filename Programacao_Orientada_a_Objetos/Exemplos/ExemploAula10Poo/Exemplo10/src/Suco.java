public class Suco  implements Liquido{
    private String sabor = "limao";
    private boolean ehNatural = true;

    public String getSabor(){
        return this.sabor;
    }

    public boolean getEhNatual(){
        return this.ehNatural;
    }

}
