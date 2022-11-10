
import java.util.Scanner ;
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
public class TextApp
{
    private static final Scanner scanner = new Scanner ( System . in ) ;
    public static void main ( String [ ] args)
    {
        System.out.println( "x = " ) ;
        double x = scanner.nextDouble ( ) ;
        System.out.println( "y = " ) ;
        double y = scanner.nextDouble ( ) ;
        System.out.print( "Average = " +TextApp . average ( x , y ) ) ;
        // x and y are a c tua l parameters
    }
    // va lue1 and va lue2 are forma l parameters
    private static double average ( double value1 , double value2 )
    {
        return ( value1 + value2 ) / 2.0 ;
    }
}
