package Factory;

public class UnableToFindCarException extends RuntimeException{
    public UnableToFindCarException() {
        super("Combinação de motor e tamanho de porta-malas não retornou nenhum modelo de carro previsto. Tente novamente com novos atributos.");
    }
}
