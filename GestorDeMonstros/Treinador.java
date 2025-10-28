import java.util.ArrayList;
/**
 * Escreva uma descrição da classe Treinador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Treinador
{
    private String nome;
    ArrayList<Monstro> equipa;
    
    public Treinador(String nome)
    {
        this.nome = nome;
        this.equipa = new ArrayList<Monstro>();
    }
    
    public void capturarMonstro(Monstro m)
    {
        this.equipa.add(m);
    }
    
    public void libertarMonstro(String nomeMonstro)
    {
        for(int i = 0; i < this.equipa.size(); i++)
        {
            Monstro monstroTemp = this.equipa.get(i);
            //System.out.println(monstroTemp.toString());
            if(monstroTemp.getNome().equals(nomeMonstro))
            {
                this.equipa.remove(i);
            }
        }
    }
}