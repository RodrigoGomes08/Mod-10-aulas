
/**
 * Escreva uma descrição da classe Lugar aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Lugar
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String posicao;
    private Boolean ocupado;
    private Autocarro autocarro;

    /**
     * Construtor para objetos da classe Lugar
     */
    public Lugar(int id, String posicao, boolean ocupado, Autocarro autocarro)
    {
        // inicializa variáveis de instância
        this.id = id;
        this.posicao = posicao;
        this.ocupado = ocupado;
        this.autocarro = autocarro;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getPosicao()
    {
        return this.posicao;
    }
    
    public void setPosicao(String posicao)
    {
        this.posicao = posicao;
    }
    
    public boolean getOcupado()
    {
        return this.ocupado;
    }
    
    public void setOcupado(boolean ocupado)
    {
        this.ocupado = ocupado;
    }
    
    public Autocarro getAutocarro()
    {
        return this.autocarro;
    }
    
    public void setAutocarro(Autocarro autocarro)
    {
        this.autocarro = autocarro;
    }
    
    @Override
    public String toString()
    {
        return("id:" + this.getId() + "|Posição" + this.getPosicao() + "|Ocupado" + this.getOcupado() + "|Autocarro" + this.getAutocarro());
    }
    
    public Lugar toClone()
    {
        Lugar newLugar = new Lugar(this.getId(), this.getPosicao(), this.getOcupado(), this.getAutocarro());
        
        return newLugar;
    }
}