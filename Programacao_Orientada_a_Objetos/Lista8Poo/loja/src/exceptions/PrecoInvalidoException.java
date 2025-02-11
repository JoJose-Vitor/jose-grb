package exceptions;
public class PrecoInvalidoException extends Exception{
    public PrecoInvalidoException(){
        super("Preço não pode ser 0 ou menor, informe um valor valido!");
    }
}
