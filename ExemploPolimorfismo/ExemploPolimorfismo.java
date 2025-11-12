
/**
 * Escreva uma descrição da classe ExemploPolimorfismo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ExemploPolimorfismo
{
    public static void main(String[] args) {
        Animal meuAnimal1 = new Cao(); // Polimorfismo
        Animal meuAnimal2 = new Gato();     // Polimorfismo

        meuAnimal1.emitirSom(); // Saída: O cachorro ladra: Au au!
        meuAnimal2.emitirSom(); // Saída: O gato mia: Miau!
    }
}