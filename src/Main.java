

public class Main
{


    public static void main(String[] args)
    {
        int a = 7;

        System.out.println(a);

        // type variabeNavn = værdi;
        // mB1 indeholder/peger på et objekt
        MoutainBike mB1 = new MoutainBike(22, 34 , 30);
        // Forklaring til: oprettelse af variabel og at tildele den en værdi
        // Variablen bliver sat til det som udtrykket på højre side af lighedstegnet bliver evalueret/udregnet til
        // det til højre for lighedstegnet kan man se på som et regnestykke - det er resultatet af regnestykket som bliver lagt over i variablen
        double mB1ServicePrice = mB1.calculateServicePrice();
        System.out.println("MoutainBike Samlet pris:" + mB1ServicePrice + " " + mB1);

        System.out.println();

        MoutainBike mB2 = new MoutainBike(10, 15, 20);
        double mB2ServicePrice = mB2.calculateServicePrice();  // Variablen bliver sat til det som udtrykket på højre side af lighedstegnet bliver evalueret til
        System.out.println("MoutainBike Samlet pris:" + mB2ServicePrice + " " + mB2);
        //System.out.println(mB2); // MountainBike

        System.out.println();

        RacingBike rB1 = new RacingBike(47, 55, true );
        // type variableNavn = værdi
        double rB1ServicePrice = rB1.calculateServicePrice(); // Variablen bliver sat til det som udtrykket på højre side af lighedstegnet bliver evalueret til
        System.out.println("RacingBike Samlet pris:" + rB1ServicePrice + " " + rB1);

        System.out.println();

        RacingBike rB2 = new RacingBike(37, 40, false);
        double rB2ServicePrice = rB2.calculateServicePrice();
        System.out.println("RacingBike Samlet pris:" + rB2ServicePrice + " " + rB2);

        System.out.println();

        CityBike cB1 = new CityBike(27, 33,"Grey");
        double cB1ServicePrice = cB1.calculateServicePrice();
        System.out.println("CityBike Samlet pris:" + cB1ServicePrice + " " + cB1);

        System.out.println();

        CityBike cB2 = new CityBike(15, 33, "Red");
        double cB2ServicePrice = cB2.calculateServicePrice();
        System.out.println("CityBike Samlet pris: " + cB2ServicePrice + " " + cB2);




    }


}
