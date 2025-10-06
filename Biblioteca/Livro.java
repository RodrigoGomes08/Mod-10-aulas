
/**
 * Escreva uma descrição da classe Livro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Livro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;

    /**
     * Construtor para objetos da classe Livro
     */
    public Livro(int id, String titulo, String autor, int anoPublicacao, String isbn)
    {
        // inicializa variáveis de instância
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método1
     * @return     a soma de x e y 
     */
    public int getId()
    {
        return this.id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getTitulo()
    {
        return this.titulo;
    }
    
    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }
    
    public String getAutor()
    {
        return this.autor;
    }
    
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    
    public int getAnoPublicacao()
    {
        return this.anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao)
    {
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getIsbn()
    {
        return this.isbn;
    }
    
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    
    public void exibirInformacoes()
    {
        System.out.println("Id:"+ id);
        System.out.println("Titulo:"+ titulo);
        System.out.println("Autor:"+ autor);
        System.out.println("Ano de publicação:"+ anoPublicacao);
        System.out.println("Isbn:"+ isbn);
    }
}