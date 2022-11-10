import java.util.*;
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Exercícios1_a
{
  // as duas linhas seguintes não devem ser apagadas
    final static Scanner scanner = new Scanner(System.in); // objecto para ler texto
    static { scanner.useLocale(Locale.ENGLISH); } // para garantir que os números reais são lidos com '.' em lugar de ','

    /**
     * Constructor for objects of class a
     */
    public Exercícios1_a()
    {
        int a = 3;
        int b = 4;
        int c = 5;
        if (a < 3)
        {
        System.out.println(a);
        }
        else if (a > 3)
        {
        System.out.println(b);
        }
        else
        {
        System.out.println(c);
        }
    }

    
}
