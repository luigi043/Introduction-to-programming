import java.util.*;

/** 
 * Jogo para adivinhar um número. V3
 * @author João Paulo Barros
 * @version 2016/10/31
 * 
 * O programa deve ser escrito em inglês.
 */
public class MinMaxGame3A
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

        guessNumber(rightValue);
    }

    static void guessNumber(int valueToGuess)
    {
        System.out.println("Indique um número: ");
        int n = scanner.nextInt();

        System.out.println(output(n, valueToGuess));
    }
    
    /**
     * Informs if number n is equal to random
     * @param mim min value
     * @param max max value
     * @param n value to guess
     * @param rightValue right value between min and max 
     * @return output message 
     */
    private static String output(int n, int rightValue)
    {
        if (n == rightValue)
        {
            return "Acertou!";
        }
        else
        {
            return "Errou! O número era " + rightValue;
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
