
import java.util.*;

/** Este template foi criado na 
 * Escola Superior de Tecnologia e Gestão do
 * Instituto PolitÈcnico de Beja
 * em 2016/09/29
 * -----------------------------------------------------
 * Adicione aqui uma descrição da classe, o seu nome e a data
 * @author (o seu nome) 
 * @version (número de versão ou data)
 * 
 * O programa deve ser escrito em inglês.
 */
public class Equation_ex02

{

    // inicia
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }
    public static void main ( String [ ] args )
    {
        System.out.println( "n1 = " );
        double n1 = scanner.nextInt( ) ;
        System.out.println( "n2 = " ) ;
        double n2 = scanner.nextDouble ( ) ;
        double sum = n1 + n2 ;
        System.out.println( n1 + " + " + n2 + " = " + sum ) ;
    }

}
