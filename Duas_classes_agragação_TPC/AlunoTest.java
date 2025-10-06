
/**
 * Escreva uma descrição da classe AlunoTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AlunoTest
{
    public static void main(String[] args)
    {
        Turma t1 = new Turma(1,"PTPSI","Manhã",12);
        Aluno a1 = new Aluno(1,26000,"João","00/00/00","Loures",987654321,t1);
        System.out.println(a1.toString());
    }
}