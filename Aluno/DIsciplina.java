
/**
 * Escreva uma descrição da classe DIsciplina aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Disciplina
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String nomeDisciplina;
    private int cargaHoraria;
    private String sala;
    private String semestre;

    /**
     * Construtor para objetos da classe Disciplina
     */
    public Disciplina(int id, String nomeDisciplina, int cargaHoraria, String sala, String semestre)
    {
        // inicializa variáveis de instância
        this.id = id;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.sala = sala;
        this.semestre = semestre;
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
    
    public String getNomeDisciplina()
    {
        return this.nomeDisciplina;
    }
    
    public void setNomeDisciplina(String nomeDisciplina)
    {
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public int getCargaHoraria()
    {
        return this.cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria)
    {
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getSala()
    {
        return this.sala;
    }
    
    public void setSala(String sala)
    {
        this.sala = sala;
    }
    
    public String getSemestre()
    {
        return this.semestre;
    }
    
    public void setSemestre(String semestre)
    {
        this.semestre = semestre;
    }
}