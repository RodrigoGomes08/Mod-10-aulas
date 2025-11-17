import java.util.Arrays;
/**
 * Escreva uma descrição da classe Arrays aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Arrays_Class
{
    public static void main(String[] args)
    {
        //int[] numbers = new int[5];
        //numbers[0] = 1;
        //numbers[1] = 2;
        int[] numbers = {2, 3, 4, 5, 1};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        
        System.out.println(Arrays.toString(numbers));
    }
}