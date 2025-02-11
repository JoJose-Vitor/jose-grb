package exceptions;
public class NomeInvalidoException extends Exception{
    public NomeInvalidoException(){
        super("Nome muito curto, informe um nome para o produto!");
    }
}
