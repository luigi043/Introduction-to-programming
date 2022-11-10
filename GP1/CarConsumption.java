import java.util.*;

/** Fuel consumptions
 * @author João Paulo Barros 
 * @version 2021/11/08
 */
public class CarConsumption
{
    final static Scanner scanner = new Scanner(System.in);
    static { scanner.useLocale(Locale.ENGLISH); }

    public static void main(String[] args)
    {

        double distance = readDouble("Indique distância percorrida em kms: ");
        double averageConsumption = readDouble("Indique consumo médio por cada 100Km: ");
        double pricePerLiter = readDouble("Indique preço por litro em euros: ");

        double consumedFuel = consumedFuel(distance, averageConsumption);
        double consumedFuelCost = consumedFuelCost(consumedFuel, pricePerLiter);

        System.out.println("Consumo total na distância: " + consumedFuel + " litros");
        System.out.println("Custo do combustível gasto na distância: " + consumedFuelCost + "€");

    } // end main

    private static double readDouble(String message) 
    {
        System.out.print(message);
        return scanner.nextDouble();
    }

    private static double consumedFuel(double distance, double averageConsumption) 
    {
        return distance / 100 * averageConsumption;
    }

    private static double consumedFuelCost(double consumedFuelInLiters, double pricePerLiter) 
    {
        return consumedFuelInLiters * pricePerLiter;
    }
    
}// end class
