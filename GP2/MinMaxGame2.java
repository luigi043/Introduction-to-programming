import java.util.*;

/** 
 * Jogo para adivinhar um número. V2
 * @author João Paulo Barros
 * @version 2016/10/31
 * 
 * O programa deve ser escrito em inglês.
 */
public class MinMaxGame2
{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }

    public static void main(String[] args)
    {
        System.out.println("Indique um número mínimo: ");
        int min = scanner.nextInt();
        System.out.println("Indique um número máximo: ");
        int max = scanner.nextInt();

        int rightValue = random(min, max);

        System.out.println("Indique um número: ");
        int n = scanner.nextInt();

        if (n == rightValue)
        {
            System.out.println("Acertou!");
        }
        else
        {
            System.out.println("Errou! O número era " + rightValue);
        }
    }

    /**
     * @param mim min value
     * @param max max value
     * @return random value between min and max 
     */
    private static int random(int min, int max)
    {
        double rand = Math.random();
        return (int)(min + (max - min + 1) * rand);
    }
}
