 
/**
 * Escreva uma descrição da classe MDC aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MDC
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int primeiroNumero;
    private int segundoNumero;
    private int resultadoMDC;

    /**
     * Construtor para objetos da classe MDC
     */
    public MDC(int primeiroNumero, int segundoNumero)
    {
        // inicializa variáveis de instância
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimeiroNumero()
    {
        return this.primeiroNumero;
    }
    
    public int getSegundoNumero()
    {
        return this.segundoNumero;
    }

    public int getResultadoMDC()
    {
        return this.resultadoMDC;
    }
    
    public void calcularMDC()
    {
        int a = this.primeiroNumero;
        int b = this.segundoNumero;
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        this.resultadoMDC = a;
    }
}