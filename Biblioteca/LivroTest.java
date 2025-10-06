
/**
 * Escreva uma descrição da classe LivroTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class LivroTest
{
    public static void main(String[] args)
    {
        //Criar dois objetos do tipo Livro
        Livro l1 = new Livro(1, "Livro1", "Autor1", 2000, "Isbn1");
        Livro l2 = new Livro(2, "Livro2", "Autor2", 1900, "Isbn2");
        //Mostrar o titulo do primeiro livro
        System.out.println(l1.getTitulo());
        //Alterar o titulo do primeiro livro
        l1.setTitulo("Livro10");
        //Mostrar o titulo do primeiro livro depois da alteração
        System.out.println(l1.getTitulo());
        //Mostrar o autor do segundo livro
        System.out.println(l2.getAutor());
        //Mostrar o Isbn do segundo livro
        System.out.println(l2.getIsbn());
        //Mostrar todas as informações com o método exibirInformações()
        l1.exibirInformacoes();
        l2.exibirInformacoes();
    }
}