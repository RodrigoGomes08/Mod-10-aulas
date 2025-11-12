
/**
 * Escreva uma descrição da classe Monstro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public final class Monstro extends Criatura
{
    
    public Monstro(String nome, String tipo)
    {
        // inicializa variáveis de instância
        super(nome, tipo);
    }
    
    public String atacar()
    {
        return "O monstro " + getNome() + " do tipo " + getTipo() + " ataca com força monstruosa.";
    }
    
    @Override
    public String fazerBarulho()
    {
        return "O monstro " + getNome() + " ruge ferozmente grrrrrrrrrrrrrrrr";
    }
}