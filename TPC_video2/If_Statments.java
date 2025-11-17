
/**
 * Escreva uma descrição da classe If_Statments aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class If_Statments
{
    public static void main(String[] args)
    {
        /*Conditions
         * Se temp for maior que 30
         * É um dia quente
         * Beba muita água
         * Por outra lado, se estiver entre 20 e 30
         * É um dia bom
         * Por outro lado
         * Está frio
         */
        int temp = 32;
        if(temp > 30)
        {
            System.out.println("É um dia quente");
            System.out.println("Beba muita água");
        } else if(temp > 20 && temp <= 30) {
            System.out.println("Dia bonito");
        } else {
            System.out.println("É um dia frio");
        }
    }
}