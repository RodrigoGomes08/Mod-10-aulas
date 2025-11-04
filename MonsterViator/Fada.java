
/**
 * Escreva uma descrição da classe Fada aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public final class Fada extends Criatura
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private final int ASAS;

    /**
     * Construtor para objetos da classe Fada
     */
    public Fada(String nome, String tipo, int asas)
    {
        // inicializa variáveis de instância
        // Chamar o construtor do pai
        super(nome, tipo);
        this.ASAS = asas;
    }
    
    public String voar()
    {
        return "A fada " + getNome() + " voa com " + this.ASAS + " asas";
    }
    
    @Override
    public String fazerBarulho()
    {
        return "A fada " + getNome() + " sussura melodias encantadas";
    }
}