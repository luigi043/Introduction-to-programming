import java.util.*;
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercícios1_f
{
     // as duas linhas seguintes não devem ser apagadas
    final static Scanner scanner = new Scanner(System.in); // objecto para ler texto
    static { scanner.useLocale(Locale.ENGLISH); } // para garantir que os números reais são lidos com '.' em lugar de ','


    /**
     * Constructor for objects of class a
     */
    public Exercícios1_f()
    {
        int a = 3;
        int b = 4;
        int c = 5;
        if (a + b < c + 2)
        {
            System.out.println(a);
        }
        if (a == 3)
        {
            if (b == 4)
            {
                System.out.println(b);
            if (c == 5)
            {
                System.out.println (5);
            }
            }
            else
            {
                System.out.println("else");
            }
            if (a < b)
            {
                System.out.println(c);
            }
        }
    }

    
}
