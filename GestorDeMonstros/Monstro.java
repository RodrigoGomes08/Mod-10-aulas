public class Monstro
{
    private String nome;
    private String tipo;
    private int nivel;
    
    public Monstro(String nome, String tipo, int nivel)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel; 
    }
    
    public int getNivel()
    {
        return this.nivel;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public int treinar()
    {
        this.nivel++;
        
        return this.nivel;
    }
    
    @Override
    public String toString()
    {
        return "Nome:" + this.nome + "\nTipo:" + this.tipo + "\nNível:" + this.nivel;
    }
}