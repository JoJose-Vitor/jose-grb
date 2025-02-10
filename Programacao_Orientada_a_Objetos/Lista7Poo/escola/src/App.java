public class App {
    public static void main(String[] args) throws Exception {

        Aluno aluno = new Aluno("Daniel", "daniel.san@bol.com", "000001");
        Professor professor = new Professor("Miyagi", "miyagi.senhor@bol.com", "Karate");

        aluno.exibirInfo();
        aluno.exibirInfo(true, false, true);
        professor.exibirInfo();
        professor.exibirInfo(false, true, false);
    }
}
