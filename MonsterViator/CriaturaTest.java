
/**
 * Escreva uma descrição da classe CriaturaTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CriaturaTest
{
    public static void main(String[] args)
    {
        /*
        Criatura c1 = new Criatura("A", "a");
        Criatura c2 = new Criatura("B", "b");
        Criatura c3 = new Criatura("C", "c");
        Criatura c4 = new Criatura("D", "d");
        Criatura c5 = new Criatura("E", "e");
        
        System.out.println(c4.toString());
        */
       Fada f1 = new Fada("A", "a", 2);
       Fada f2 = new Fada("B", "b", 2);
        
       Monstro m1 = new Monstro("A", "a");
       Monstro m2 = new Monstro("B", "b");
       
       String v1 = f1.voar();
       String v2 = f2.voar();
       String a1 = m1.atacar();
       String a2 = m2.atacar();
       
       System.out.println(v1);
       System.out.println(v2);
       System.out.println(a1);
       System.out.println(a2);
       
       String b1 = f1.fazerBarulho();
       String b2 = m1.fazerBarulho();
       
       System.out.println(b1);
       System.out.println(b2);
    }
}