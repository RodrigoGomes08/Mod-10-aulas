import java.util.Scanner;
/**
 * Escreva uma descrição da classe While_Loops aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class While_Loops
{
    public static void main(String[] args)
    {
        for ( int i = 5; i <= 0; i--)
        {
            System.out.println("Hello World" + i);
        }
        
        int i = 0;
        
        while(i > 0) 
        {
            System.out.println("Hello World " + i);
            i--;
        }
        
        String input = "";
        Scanner scanner = new Scanner(System.in);
        
        while(!input.equals("quit"))
        {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
        
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));
    }
}