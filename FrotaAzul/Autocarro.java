/**
 * Escreva uma descrição da classe Autocarro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Autocarro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String matricula;

    /**
     * Construtor para objetos da classe Autocarro
     */
    public Autocarro(int id, String matricula)
    {
        this.id = id;
        this.matricula = matricula;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    //Criar o método getId
    public int getId()
    {
        return this.id;
    }
    //Criar o método setId
    public void setId(int id)
    {
        this.id = id;
    }
    //Criar o método getMatricula
    public String getMatricula()
    {
        return this.matricula;
    }
    //Criar o método setMatricula
    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }
    
    @Override
    public String toString()
    {
        return "id: " + this.getId() + "| Matricula: " + this.getMatricula();
    }

    public Autocarro toClone()
    {
        Autocarro a2 = new Autocarro(this.getId(), this.getMatricula());
        return a2;
    }
}