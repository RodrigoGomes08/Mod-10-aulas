
/**
 * Escreva uma descrição da classe MDCTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MDCTest
{
    public static void main(String[] args)
    {
        MDC mdc = new MDC(48, 18);
        mdc.calcularMDC();
        System.out.println("O MDC de " + mdc.getPrimeiroNumero() + " e " + mdc.getSegundoNumero() + " é: " + mdc.getResultadoMDC());

    }
}