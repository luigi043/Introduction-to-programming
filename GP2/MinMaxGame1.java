import java.util.*;

/** 
 * Jogo para adivinhar um número. V1
 * @author João Paulo Barros
 * @version 2016/10/31
 * 
 * O programa deve ser escrito em inglês.
 */
public class MinMaxGame1
{

    // inicia
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }

    public static void main(String[] args)
    {
        System.out.println("Indique um número mínimo: ");
        int min = scanner.nextInt();
        System.out.println("Indique um número máximo: ");
        int max = scanner.nextInt();
        
        double rand = Math.random();
        int random = (int)(min + (max - min + 1) * rand);
        
        System.out.println("Indique um número: ");
        int n = scanner.nextInt();
       
        if (n == random)
        {
             System.out.println("Acertou!");
        }
        else
        {
             System.out.println("Errou! O número era " + random);
        }
    }
}
