
/**
 * Escreva uma descrição da classe ParqueEstacionamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
import java.util.ArrayList;

public class ParqueEstacionamento
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private int numLugares;
    private String morada;
    private boolean isFull;
    private ArrayList<Lugar> lugares;
    
    public ParqueEstacionamento(int id, int numLugares, String morada, boolean isFull, ArrayList<Lugar> lugares)
    {
        this.id = id;
        this.numLugares = numLugares;
        this.morada = morada;
        this.isFull = false;
        for(int i = 0; i <= this.numLugares; i++)
        {
            Lugar l1 = new Lugar(i + 1);
            lugares.add(l1);
        }
    }
    
    public int numLugaresLivre()
    {
        //Variável para contar o numero de lugares livres
        int numLugaresLivres = 0;
        //Percorrer o ArrayList lugares e contar quantos lugares estão vazios
        for(int i = 0; i < this.numLugares; i++)
        {
            Lugar l1 = this.lugares.get(i);
            System.out.println(l1.toString());
            //Perguntar se o lugar está livre
            if( l1.getOcupado() == false)
            {
                numLugaresLivres++;
            }
        }
        return numLugaresLivres;
    }
    
    public int unmLugaresOcupado()
    {
      return this.numLugares - numLugaresLivre();
    }
    
    public boolean lugarDisponibilidade(int indexLugar)
    {
        Lugar l1 = this.lugares.get(indexLugar);
        if(l1.getOcupado() == true)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}