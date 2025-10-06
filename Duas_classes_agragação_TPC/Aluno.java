
/**
 * Escreva uma descrição da classe Aluno aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int numProcesso;
    private String nome;
    private String dataNascimento;
    private String morada;
    private int telefone;
    private Turma turma;

    /**
     * Construtor para objetos da classe Aluno
     */
    public Aluno(int id, int numProcesso, String nome, String dataNascimento, String morada, int telefone, Turma turma)
    {
        // inicializa variáveis de instância
        this.id = id;
        this.numProcesso = numProcesso;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.telefone = telefone;
        this.turma = turma;
    }

    public int getId()
    {
        return this.id;
    }
    
    public void getId(int id)
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
    
    public Turma getTurma()
    {
        return this.turma;
    }
    
    public void setTurma(Turma turma)
    {
        this.turma = turma;
    }
    
    @Override
    public String toString()
    {
        return("id:" + this.getId() + "Numero de processo" + this.getNumProcesso() + "|Nome" + this.getNome() + "|Data de nascimento" + this.getDataNascimento() + "|Morada" + this.getMorada() + "|Telefone" + this.getTelefone() + "|Telefone" + this.getTelefone() + "|Turma" + this.getTurma());
    }
}