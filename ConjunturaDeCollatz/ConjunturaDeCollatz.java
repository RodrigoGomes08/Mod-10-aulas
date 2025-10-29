
/**
 * Escreva uma descrição da classe ConjuntaDeCollatz aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConjunturaDeCollatz
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int n;
    private int numIteracoes = 0;
    private int nMaior;

    /**
     * Construtor para objetos da classe ConjuntaDeCollatz
     */
    public ConjunturaDeCollatz(int n)
    {
        // inicializa variáveis de instância
        this.n = n;
        this.nMaior = this.n;
    }
    
    public int getN()
    {
        return this.n;
    }
    
    public int getNumIteracoes()
    {
        return this.numIteracoes + 1;
    }
    
    public int getNMaior()
    {
        return this.nMaior;
    }
    
    public void processar()
    {
        int numAProcessar = this.n;
        
        while(numAProcessar != 1)
        {
            if(this.verificarPar(numAProcessar) == true)
            {
                numAProcessar = numAProcessar / 2;
            }
            else
            {
                numAProcessar = 3 * numAProcessar + 1;
            }
            
            this.verificarNumMaior(numAProcessar);
            
            this.numIteracoes = this.numIteracoes + 1;
        }
    }
    
    private void verificarNumMaior(int nMaior)
    {
        if(nMaior >  this.nMaior)
        {
            this.nMaior = nMaior;
        }
    }
    
    private boolean verificarPar(int numAValidar)
    {
        if(numAValidar % 2 == 0)
        {
            return true;
        }
        
        return false;
    }
}