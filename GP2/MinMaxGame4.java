import java.util.*;

/** 
 * Jogo para adivinhar um número. V4
 * @author João Paulo Barros
 * @version 2016/10/31
 * 
 * O programa deve ser escrito em inglês.
 */
public class MinMaxGame4
{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }

    private static final int N_TRIES = 5;
    
    public static void main(String[] args)
    {
        System.out.println("Indique um número mínimo: ");
        int min = scanner.nextInt();
        System.out.println("Indique um número máximo: ");
        int max = scanner.nextInt();

        int rightValue = random(min, max);
        guessNumber(rightValue);
    }
    
    /**
     * --Not a function ("returns" void)
     * Has side effects (prints, thus changing the output)
     * Tries to guess number
     * @param rightValue number to guess
     */
    private static void guessNumber(int rightValue)
    {
        for(int i = 0; i < N_TRIES; i++)
        {
            boolean hasWinned = askQuestion(rightValue);
            if (hasWinned) // exist because has winned
            {       
                System.exit(0);
            }
        }
        System.out.println("\nFalhou todas as tentativas!");
    }
   
    /**
     * -- Non pure function (prints)
     * Asks for a number and tells if it is the right one
     * @param the numebr to guess
     * @return true if the user guessed, false otherwise
     */    
    private static boolean askQuestion(int rightValue)
    {
        System.out.println("Indique um número: ");
        int n = scanner.nextInt();

        boolean win = (n == rightValue);
        System.out.println(output(win, rightValue));
        
        return win;
    }

    /**
     * -- "Pure" function (only depends on the arguments and does no change or writes anything)
     * Return message
     * @param win wins or not
     * @param rightValue rigth value between min and max 
     * @return output message 
     */
    private static String output(boolean win, int rightValue)
    {
        if (win)
        {
            return "Acertou!";
        }
        else
        {
            return "Errou! Tente novamente.";
        }
    }

    /**
     * -- "Pure" function (only depends on the arguments and does no change or writes anything)
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
