
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
    private String nome;
    private int salario;
    private int genero; //0=femenino, 1=masculino

    /**
     * Construtor para objetos da classe Professor
     */
    public Professor(int id, String nome, int salario, int genero)
    {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.setSalario(salario);
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
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public int getSalario()
    {
        return this.salario;
    }
    
    public void setSalario(int salario)
    {
        this.salario = salario;
        if(this.genero == 1){
            this.salario = salario * 2;
        } else{
            this.salario = salario;
        }
    }
    
    public int getGenero()
    {
        return this.genero;
    }
    
    public void setGenero(int genero)
    {
        this.genero = genero;
    }
}