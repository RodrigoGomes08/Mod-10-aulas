import java.awt.*;
/**
 * Escreva uma descrição da classe Primitive_Types_vs_Reference_Types aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Primitive_Types_vs_Reference_Types
{
    public static void main(String[] args)
    {
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
    }
}