public class LugarTeste
{
    public static void main(String[] args)
    {
        Autocarro a1 = new Autocarro(1, "12-34-AB");
        Autocarro a2 = new Autocarro(2, "12-34-AB");
        //criar objetos do tipo lugar
        Lugar l1 = new Lugar(1, "a", true, a1);
        Lugar l2 = new Lugar(2, "b", true, a2);
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        Lugar l3 = l2;
        System.out.println(l3.toString());
    }
}