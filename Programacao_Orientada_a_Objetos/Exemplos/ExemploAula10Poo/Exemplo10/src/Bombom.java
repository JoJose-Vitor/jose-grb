public class Bombom {
    private String nome;

    public Bombom(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean equals(Object objeto) {
        if(super.equals(objeto)){
            return true;
        }
        if(objeto instanceof Bombom){
            Bombom bombom = (Bombom) objeto;
            if(bombom.getNome().equals(this.nome)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
                return this.nome;
    }

}
