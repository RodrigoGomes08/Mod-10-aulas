import java.util.ArrayList;
/**
 * Exercicio de revisão ArrayList.
 */
public class ArrayListTest
{
    public static void main(String[] args)
    {
           ArrayList<String> cars = new ArrayList<String>();
           
           cars.add("Volvo");
           cars.add("BMW");
           cars.add("Ford");
           cars.add("Mazda");
           
           String carPosition1 = cars.get(1);
           System.out.println(carPosition1);
           
           boolean exists = cars.contains("BMW");
           boolean notExists = cars.contains("Toyota Carina");
           
           System.out.println(exists);
           System.out.println(notExists);
           
           System.out.println(cars);
    }
}