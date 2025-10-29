
/**
 * Escreva uma descrição da classe ConjunturaDeCollatzTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ConjunturaDeCollatzTest
{
    public static void main(String[] args)
    {
        ConjunturaDeCollatz c1 = new ConjunturaDeCollatz(9);
        ConjunturaDeCollatz c2 = new ConjunturaDeCollatz(9);
        
        c1.processar();
        
        int n = c1.getN();
        int c1NumIteracoes = c1.getNumIteracoes();
        int c1NumMaior = c1.getNMaior();
        
        System.out.println(n);
        System.out.println(c1NumIteracoes);
        System.out.println(c1NumMaior);
    }
}