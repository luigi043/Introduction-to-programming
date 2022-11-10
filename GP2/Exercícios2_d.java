
import java.util.*;

/** Este template foi criado na 
 * Escola Superior de Tecnologia e Gestão do
 * Instituto Politécnico de Beja
 * em 2021/09/20
 * -----------------------------------------------------
 * Adicione aqui uma descrição da classe, o seu nome e a data
 * @author (o seu nome) 
 * @version (número de versão ou data)
 * 
 * O programa deve ser escrito em inglês.
 */
public class Exercícios2_d
{

    // as duas linhas seguintes não devem ser apagadas
    final static Scanner scanner = new Scanner(System.in); // objecto para ler texto
    static { scanner.useLocale(Locale.ENGLISH); } // para garantir que os números reais são lidos com '.' em lugar de ','

    public static void main(String[] args)
    {
        int a = 3;
        int b = 6;
        do
        {
            System.out.println(a + b);
            a = a + b;
            System.out.println(a);
        } while (a < b * b);
    } // END funçtion main
} // END Exercícios2_d
