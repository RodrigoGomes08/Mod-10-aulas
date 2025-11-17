
/**
 * Escreva uma descrição da classe For_Each_Loops aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class For_Each_Loops
{
    public static void main(String[] args)
    {
        String[] fruits = { "apple","mango","orange"};
        
        for(int i = 0; i < fruits.length; i++)
        {
            System.out.println(fruits[i]);
        }
        
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
    }
}