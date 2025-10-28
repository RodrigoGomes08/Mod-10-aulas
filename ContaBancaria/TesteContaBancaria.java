
/**
 * Escreva uma descrição da classe TesteContaBancaria aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteContaBancaria
{
    public static void main(String[] args)
    {
        //Criar um novo objeto do tipo ContaBancaria
        ContaBancaria contaBan1 = new ContaBancaria("Zé das couves");
        //Criar outro objeto do tipo ContaBancaria
        ContaBancaria contaBan2 = new ContaBancaria("António das couves");
        
        //Guardar o valor do métdodo getTitular() na variável verTitular1
        String verTitular1 = contaBan1.getTitular();
        //Guardar o valor do métdodo getSaldo() na variável verSaldo1
        double verSaldo1 = contaBan1.getSaldo();
        //Imprimir para  ecrã o valor do método getTitular()
        System.out.println(verTitular1);
        //Imprimir para o ecrã o valor do método getSaldo()
        System.out.println(verSaldo1);
        
        //Guardar o saldo inicial na variavél depositoInicialContaBan1
        double depositoInicialContaBan1 = contaBan1.getSaldo();
        //Realizar um depóito na contaBan1
        double depositoContaBan1 = contaBan1.depositar(100.00);
        
        validarDeposito(depositoInicialContaBan1, depositoContaBan1);
        
        //Guardar o saldo inicial na variavél depositoInicialContaBan1
        depositoInicialContaBan1 = contaBan1.getSaldo();
        //Realizar um depóito na contaBan1
        depositoContaBan1 = contaBan1.depositar(-100.00);
        
        validarDeposito(depositoInicialContaBan1, depositoContaBan1);
        
        //Guardar o saldo inicial na variavél depositoInicialContaBan1
        depositoInicialContaBan1 = contaBan1.getSaldo();
        //Realizar um levantamento na contaBan1
        double levantamentoContaBan1 = contaBan1.levantar(40);
        
        validarLevantamento(depositoInicialContaBan1, levantamentoContaBan1);
    }
    
    public static void validarDeposito(double saldoInicial, double saldoFinal)
    {
        if(saldoFinal > saldoInicial)
        {
            //Imprimir que o depósito foi efetuado e qual é o saldo atual
            System.out.println("Depósito efetuado com sucesso. Saldo atual:" + saldoFinal); 
        }
        else
        {
            //Imprimir que o depósito não foi efetuado
            System.out.println("Depósito não efetuado");
        }  
    }
    
    public static void validarLevantamento(double saldoInicial, double saldoFinal)
    {
        //Ver se o levantamento foi efetuado ou não
        if(saldoFinal < saldoInicial)
        {
            //Imprimir que o depósito foi efetuado e qual é o saldo atual
            System.out.println("Levantamento efetuado com sucesso. Saldo atual:" + saldoFinal); 
        }
        else
        {
            //Imprimir que o depósito não foi efetuado
            System.out.println("Levantamento não efetuado");
        }
    }
}