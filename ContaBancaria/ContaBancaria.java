
/**
 * Escreva uma descrição da classe ContaBancaria aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContaBancaria
{
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular)
    {
        // inicializa variáveis de instância
        this.titular = titular;
    }
    
    public String getTitular()
    {
        return this.titular;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public double depositar(double deposito)
    {
        if(deposito >= 0)
        {
            this.saldo = this.saldo + deposito; 
        }
        
        return this.saldo;
    }
    
    public double levantar(double levantamento)
    {
        if(levantamento <= this.saldo)
        {
            this.saldo = this.saldo - levantamento;
        }
        
        return this.saldo;
    }
}