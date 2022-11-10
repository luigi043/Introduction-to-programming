
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
public class Exercícios2_e
{

    // as duas linhas seguintes não devem ser apagadas
    final static Scanner scanner = new Scanner(System.in); // objecto para ler texto
    static { scanner.useLocale(Locale.ENGLISH); } // para garantir que os números reais são lidos com '.' em lugar de ','

    public static void main(String[] args)
    {
        int a = 1;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.println(i + ", " + j);
            }
        }
    } // END funçtion main
} // END Exercícios2_e
