
/**
 * Escreva uma descrição da classe Autocarro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Autocarro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String matricula;
    private int kmPercorrido;
    int[] sensoresFrontais = new int[4];
    int[] sensoresTrazeiros = new int[4];
    
    public Autocarro(String matricula, int kmPercorrido)
    {
        // inicializa variáveis de instância
        this.matricula = matricula;
        this.kmPercorrido = kmPercorrido;
    }
    
    public String mostrarEstadoSensoresFrontais()
    {
        String resultado = "";
        
        for(int i : sensoresFrontais)
        {
            resultado = resultado + i + ",";
        }
        resultado = resultado.substring(0, resultado.length() -1);
        return resultado;
    }
    
    public String mostrarEstadoSensoresTrazeiros()
    {
        String resultado = "";
        
        for(int i : sensoresTrazeiros)
        {
            resultado = resultado + i + ",";
        }
        resultado = resultado.substring(0, resultado.length() -1);
        return resultado;
    }
}