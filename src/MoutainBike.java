
public class MoutainBike extends Bike
{

    private int seatHeight;

    public MoutainBike() {}

    //konstrukter.
    public MoutainBike(int gear, int speed, int seatHeight)
    {
        super(gear,speed);
        this.seatHeight = seatHeight;
    }

    //Metode setter. det er standard at parameter navnet er det samme som attribut navnet.
    public void setSeatHeight(int seatHeight)
    {
        this.seatHeight = seatHeight;
    }

    @Override
    public double calculateServicePrice()
    {
        // 250 * 1.1 == fordi startup fee er 10 % højere end racingbike
        // 7 * getGear() == fordi 7 kr. pr. gear
        // * 1.25 == fordi vi tillægger tax som er 25 %
        //System.out.println(getGear());
        return (250 * 1.10 + 7 * getGear()) * 1.25;
    }

    @Override
    public String toString()
    {
        return "SeatHeight: " + seatHeight + " " + super.toString();
    }

}
