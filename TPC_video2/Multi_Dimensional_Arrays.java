import java.util.Arrays;
/**
 * Escreva uma descrição da classe Multi_Dimensional_Arrays aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Multi_Dimensional_Arrays
{
    public static void main(String[] args)
    {
        //int[][][] numbers = new int[2][3][5];
        //numbers[0][0][0] = 1;
        int[][] numbers = { {2, 3, 4}, {5, 1} };
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        
        System.out.println(Arrays.deepToString(numbers));
    }
}