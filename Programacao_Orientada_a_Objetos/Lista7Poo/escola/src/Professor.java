public class Professor extends Usuario{
    private String disciplina;

    public Professor(String nome, String email, String disciplina){
        super(nome, email);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println(this.disciplina);
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirdisciplina){
        if(exibirNome){
            System.out.println(super.getNome());
        }
        if(exibirEmail){
            System.out.println(super.getEmail());
        }
        if(exibirdisciplina){
            System.out.println(this.disciplina);
        }
    }

    public String getDisciplina(){
        return this.disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

}