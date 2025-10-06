
/**
 * Escreva uma descrição da classe ProfessorTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ProfessorTest
{
    public static void main(String[] args)
    {
        //System.out.println("Hello");     
        
        //1.Criar um objeto do tipo professor
        Professor p1 = new Professor(1,"JARG",10000, 1);
        // 2.Imprimir o id do professor
        System.out.println(p1.getId());
        System.out.println(p1.getSalario());
        p1.setSalario(2000000);
        System.out.println(p1.getSalario());
        // 3.Imprimir o nome do professor
        System.out.println(p1.getNome());
        // 4.Alterar o nome do professor
        p1.setNome("JARG é o maior");
        // 5.Imprimir o nome do professor com um novo valor
        System.out.println(p1.getNome());
        // 6.Criar um objeto novo do tipo professor
        Professor p2 = new Professor(2,"Professor2", 1000000, 0);
        // 7.IMprimir o id do professor
        System.out.println(p2.getId());
        // 8.Criar um objeto novo do tipo professor
        Professor p3 = new Professor(3, "José", 50, 1);
        // 9.Alterar o salário do professor
        p3.setSalario(150);
        // 10.Imprimir o salario do professor
        System.out.println(p3.getSalario());
        //
        
    }
}