import java.util.*;

/** Cálculo de IMC (incompleto)
 * @author João Paulo Barros 
 * @version 2021/11/08
 */
public class BMI
{

    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }

    public static void main(String[] args)
    {
        //System.out.print("Indique o peso: ");
        //double weight = scanner.nextDouble();
        double weight = readDouble("Indique o peso (kg): ");
        
        //System.out.print("Indique a altura: ");
        //double height = scanner.nextDouble();
        double height = readDouble("Indique a altura (m): ");

        //double imc = weight / (height * height);
        double bmi = bmi(weight, height);

        System.out.println("O seu imc é " + bmi);

        String message = imcMessage(bmi);
        System.out.println("Resultado: " + message);
       
    } // end main
    
    public static double readDouble(String message) 
    {
        System.out.print(message);
        double value = scanner.nextDouble();
        return value;
    }
    
    public static double bmi(double personWeight, double personHeight) 
    {
        return personWeight / (personHeight * personHeight);
    }
    
    public static String imcMessage(double imc)
    {
        if (imc < 17)
        {
            return "Muito abaixo do peso";
        }
        else if (17 <= imc && imc <= 18.49)
        {
             return "Muito abaixo do peso";
        }
        //.... TO DO
        return "???";
    }
        
} // end class
