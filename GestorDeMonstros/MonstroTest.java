import java.util.ArrayList;
/**
 * Escreva uma descrição da classe MonstroTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MonstroTest
{
    public static void main(String[] args)
    {
        //Criar o monstro m1
        Monstro m1 = new Monstro("Charmander", "Fogo", 200);
        //Criar o monstro m2
        Monstro m2 = new Monstro("Snorlax", "Normal", 1000);
        //Criar o monstro m3
        Monstro m3 = new Monstro("Ghastly", "Sombra", 5);
        //Imprimir a informações do monstro m1
        String infoMonstroM1 = m1.toString();
        System.out.println(infoMonstroM1);
        //Treinar o mosntro m2
        int infoNivelM2 = m2.treinar();
        System.out.println(infoNivelM2);
        //Treinar o monstro m3 pela primeira vez
        int infoNivelM3 = m3.treinar();
        System.out.println(infoNivelM3);
        //Treinar o mosntro m3 pela segunda vez
        infoNivelM3 = m3.treinar();
        //Imprimir o nivel do monstro m3
        System.out.println(infoNivelM3);
        
        //Criar ArrayList de Monstro
        ArrayList<Monstro> monstros = new ArrayList<Monstro>();
        //Ver quantos monstros é que existe
        int qtdMonstros = monstros.size();
        //Imprimir a quantidade de monstros que existe
        System.out.println("Quantidade monstros:" + qtdMonstros);
        //Adicionar um monstro ao nosso arrayList
        monstros.add(m1);
        qtdMonstros = monstros.size();
        System.out.println("Quantidade Monstros:" + qtdMonstros);
        monstros.add(m1);
        qtdMonstros = monstros.size();
        System.out.println("Quantidade Monstros:" + qtdMonstros);
        monstros.add(m1);
        qtdMonstros = monstros.size();
        System.out.println("Quantidade Monstros:" + qtdMonstros);
        
        //Calcular a quantidade de monstros do ArrayList que o nivel seja superior a dez
        int qtdNivelSup10 = 0;
        int qtdNivelInf10 = 0;
            for(int i = 0; i < qtdMonstros; i++)
            {
                Monstro monstroTemp = monstros.get(i);
                //System.out.println(monstroTemp.toString());
                if(monstroTemp.getNivel() > 10)
                {
                    qtdNivelSup10++;
                }
                else
                {
                    qtdNivelInf10++;
                }
            }
        System.out.println("O numero de monstros com nivel maior do que dez:" + qtdNivelSup10 + "\nO numero de monstros com nivel menor do que dez:" + qtdNivelInf10);
        
        ArrayList<Monstro> monstroNivelSup10 = new ArrayList<Monstro>();
        ArrayList<Monstro> monstroNivelInf10 = new ArrayList<Monstro>();
        
        for(int i = 0; i < monstros.size(); i++)
        {
            Monstro monstroTemp = monstros.get(i);
            //System.out.println(monstroTemp.toString());
            if(monstroTemp.getNivel() > 10)
            {
                monstroNivelSup10.add(monstroTemp);    
            }
            else
            {
                monstroNivelInf10.add(monstroTemp);
            }
        }
        
        System.out.println("O tamanho do Array com nível superior a 10:" + monstroNivelSup10.size() + "\nO numero de monstros com nivel menor do que dez:" + monstroNivelInf10.size());
        
        boolean hasPereira = false;
        
        for(Monstro monstroTemp : monstros)
        {
            if(monstroTemp.getNome().equals("Pereira"))
            {
                hasPereira = true;
            }
        }
        System.out.println(hasPereira);
    }
}