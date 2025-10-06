
/**
 * Escreva uma descrição da classe Turma aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Turma
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String nome;
    private String turno;
    private int anoLetivo;

    /**
     * Construtor para objetos da classe Turma
     */
    public Turma(int id, String nome, String turno, int anoLetivo)
    {
        // inicializa variáveis de instância
        this.id = id;
        this.nome = nome;
        this.turno = turno;
        this.anoLetivo = anoLetivo;
    }

    public int getId()
    {
        return this.id;
    }
    
    public void getId(int id)
    {
        this.id = id;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getTurno()
    {
        return this.turno;
    }
    
    public void setTurno(String turno)
    {
        this.turno = turno;
    }
    
    public int getAnoLetivo()
    {
        return this.anoLetivo;
    }
    
    public void setAnoLetivo(int anoLetivo)
    {
        this.anoLetivo = anoLetivo;
    }
    
    public String toString()
    {
        return("id:" + this.getId() + "|Nome" + this.getNome() + "|Turno" + this.getTurno() + "|Ano Letiv" + this.getAnoLetivo());
    }
}