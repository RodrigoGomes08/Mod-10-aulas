
/**
 * Classe pCharacter que serve para descrever um personagem
 * 
 * Rodrigo Gomes
 * 12/11/2025
 */
public class Character
{
    private static final int INICIAL_ENERGY = 100;
    private static final int SUFFER_ATTACK = 20;
    private static final String[] ATTACKS = {"Heavy punch", "Light punch", "Heavy kick", "Light kick"};
    private static final String[] DEFENDS = {"Block", "K.O."};
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String name;
    private String weapon;
    private String fightingStyles;
    private double height;
    private int energy;

    /**
     * Construtor para objetos da classe Character
     */
    public Character(String name, String weapon, String fightingStyles, double height)
    {
        // inicializa variáveis de instância
        this.name = name;
        this.weapon = weapon;
        this.fightingStyles = fightingStyles;
        this.height = height;
        this.energy = INICIAL_ENERGY;
    }
    
    public int sufferAttack()
    {
        this.energy = energy - SUFFER_ATTACK;
        
        return this.energy;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("----Character----\n");
        sb.append("----Name----\n").append(this.name).append("\n");
        sb.append("----Weapon----\n").append(this.weapon).append("\n");
        sb.append("----Fighting styles----\n").append(this.fightingStyles).append("\n");
        sb.append("----Heiht----\n").append(this.height).append("\n");
        sb.append("----Energy----\n").append(this.energy).append("\n");
        sb.append("----Inicial energy----\n").append(INICIAL_ENERGY).append("\n");
        
        return sb.toString();
    }
}