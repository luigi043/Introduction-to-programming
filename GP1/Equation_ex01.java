import java.util.*;
/**
 * Escreva a descrição da classe jbmnb aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Equation_ex01
{
    final static Scanner scanner = new Scanner ( System . in ) ;
    static { scanner . useLocale ( Locale . ENGLISH ) ; }
    public static void main (String [ ] args )
    {
        System.out.println( "Compute the zeros of the following equation: a * x * x + b * x + x = 0." );
        System.out.println( "a: " ) ;
        double a = scanner . nextDouble ( ) ;

        System.out.print ( "b: " ) ;
        double b = scanner.nextDouble ( ) ;
        System.out.print ( "c: " );
        double c = scanner.nextDouble ( ) ;

        double root = Math.sqrt ( b * b - 4 * a * c);
        double x1 = (-b -root) / ( 2 * a);
        double x2 = (-b + root) / ( 2 * a);

        System.out.println ( "x1 = " + x1 ) ;
        System.out.println ( "x2 = " + x2 ) ;
    }
}