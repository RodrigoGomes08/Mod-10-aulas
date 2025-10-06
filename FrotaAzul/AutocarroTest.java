
/**
 * Escreva uma descrição da classe AutocarroTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AutocarroTest
{
    public static void main(String[] args)
    {
        // 1.Criar um objeto do tipo autocarro
        Autocarro a1 = new Autocarro(1,"AB-00-CD");
        // 2.Criar outro objeto do tipo autocarro
        Autocarro a2 = new Autocarro(2,"EF-00-GH");
        // 3.Imprimir
        System.out.println(a1.toString());
        
        Autocarro a3 = a2;
        
        System.out.println(a3.toString());
        a3.setMatricula("VV");
        System.out.println(a3.toString());
        System.out.println(a2.toString());
        
        Autocarro a4 = a1.toClone();
        a4.setMatricula("xx");
        System.out.println(a4.toString());
        System.out.println(a1.toString());
    }
}