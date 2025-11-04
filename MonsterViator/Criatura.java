
/**
 * Escreva uma descrição da classe Criatura aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public abstract class Criatura

{
    // O final é para nunca mais poder ser alterada na classe, e é uma variavél de classe logo o valor permanece em todos os objectos
    private static final String REINO = "Monster Viator"; 
    private static final String MAPA = "Viator";
    private static final int NIVEL_VIDA_INICIAL = 50;
    private static int contadorCriaturas = 0;
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String tipo;
    private int nivelDeVida;
    
    public Criatura(String nome, String tipo)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.tipo = tipo;
        contadorCriaturas++;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public int getContadorCriaturas()
    {
        return contadorCriaturas;
    }
    
    public void limparContador()
    {
        contadorCriaturas = 0;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(this.nome).append("\n");
        sb.append("Tipo: ").append(this.tipo).append("\n");
        sb.append("Reino: ").append(REINO).append("\n");
        sb.append("Numero de criaturas existentes: ").append(contadorCriaturas).append("\n");
        sb.append("Mapa: ").append(MAPA).append("\n");
        sb.append("Vida inicial: ").append(NIVEL_VIDA_INICIAL).append("\n");
        
        return sb.toString();
    }
    
    public void retirarVida()
    {
        this.nivelDeVida = nivelDeVida - 1;
    }
    
    public abstract String fazerBarulho();
}