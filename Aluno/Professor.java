
/**
 * Escreva uma descrição da classe Professor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Professor
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int numProcesso;
    private String nome;
    private String dataNascimento;
    private String morada;
    private int telefone;

    /**
     * Construtor para objetos da classe Professor
     */
    public Professor(int id, int numProcesso, String nome, String dataNascimento, String morada, int telefone)
    {
        this.id = id;
        this.numProcesso = numProcesso;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.telefone = telefone;
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
    
    public int getNumProcesso()
    {
        return this.numProcesso;
    }
    
    public void setNumProcesso(int numProcesso)
    {
        this.numProcesso = numProcesso;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getDataNascimento()
    {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }
    
    public String getMorada()
    {
        return this.morada;
    }
    
    public void setMorada(String morada)
    {
        this.morada = morada;
    }
    
    public int getTelefone()
    {
        return this.telefone;
    }
    
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
}