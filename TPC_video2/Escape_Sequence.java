
/**
 * Escreva uma descrição da classe Escape_Sequence aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Escape_Sequence
{
    public static void main(String[] args)
    {
        String message1 = "Hello \"World\"";
        System.out.println(message1);
        String message2 = "c:\\Windows\\...";
        System.out.println(message2);
        String message3 = "c:\nWindows\\...";
        System.out.println(message2);
        String message4 = "c:\tWindows\\...";
        System.out.println(message2);
    }
}