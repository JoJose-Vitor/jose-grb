public abstract class Animal {
    private String nomeCientifico;
    private String nomeNaoCientifico;
    private String especie;

    public Animal(String nomeCientifico){
        this.nomeCientifico = nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico){
        this.nomeCientifico = nomeCientifico;
    }

    public void setNomeNaoCientifico(String nomeNaoCientifico){
        this.nomeNaoCientifico = nomeNaoCientifico;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }

}
