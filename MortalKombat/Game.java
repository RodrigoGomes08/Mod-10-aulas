import java.util.Random;
/**
 * Escreva uma descrição da classe Game aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Game
{
    private static final int NUMBER_FOR = 5;
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Character[] characters;
    private Character player1;
    private Character player2;

    /**
     * Construtor para objetos da classe Game
     */
    public Game()
    {
        // inicializa variáveis de instância
        Character c1 = new Character("Johnny Cage","Pistola","Muay Thay",1.80);
        Character c2 = new Character("Scorpion","Corrente","Ninja",1.90);
        Character c3 = new Character("Sub-Zero","Clava de gelo","Shotokan",2.00);
        /*
        this.characters = new Character[3];
        this.characters[0] = c1;
        this.characters[1] = c2;
        this.characters[2] = c3;
        */
        
        this.characters = new Character[]{c1,c2,c3};
        
        this.player1 = this.characters[this.selectPlayer()];
        this.player2 = this.characters[this.selectPlayer()];
    }
    
    private int selectPlayer()
        {
            Random r = new Random();
            return r.nextInt(characters.length);
        }
        
    public void play()
    {
         for( int i = 0; i < NUMBER_FOR; i++)
         {
             Random r = new Random();
             
             if(r.nextInt(2) == 0)
             {
                //System.out.println("O player 1 atacou o player 2");
                this.player2.sufferAttack();
             }
             else
             {
                //System.out.println("O player 2 atacou o player 1");
                this.player1.sufferAttack();
             }
         }
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("----Number of Characters----\n");
        sb.append(characters.length);
        sb.append("----Player1----\n");
        sb.append(this.player1.toString());
        sb.append("----Player2----\n");
        sb.append(this.player2.toString());
        
        return sb.toString();
    }
}