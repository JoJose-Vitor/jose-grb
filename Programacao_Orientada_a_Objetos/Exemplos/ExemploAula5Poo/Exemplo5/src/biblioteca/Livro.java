package biblioteca;
public class Livro {
   private String autor;
   private String nome;
   private int anoLancamento;

   public Livro(String nome, String autor, int anoLancamento){
      this.nome = nome;
      this.autor = autor;
      this.anoLancamento = anoLancamento;
   }

   public Livro(String autor){
      setAutor(autor);
   }

   public void setAutor(String autor){
      if(autor.isBlank()){
         this.autor= "DESCONHECIDO!";
      }else{
         this.autor = autor;
      }
   }

   public String getAutor(){
      return this.autor;
   }

   public void setNome(String nome){
      this.nome = nome;
   }

   public String getNome(){
      return this.nome;
   }

   public void setAnoLancamento(int anoLancamento){
      this.anoLancamento = anoLancamento;
   }

   public int getAnoLancamento(){
      return this.anoLancamento;
   }

}
