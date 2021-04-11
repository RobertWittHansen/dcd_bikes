


public class CityBike extends Bike
{

    private String color;

    //Konstrukter
    public CityBike() {}

    public CityBike(int gear, int speed, String color)
    {
        super(gear,speed);
        this.color = color;
    }

    //metode Getter og setter.
    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }


    @Override
    public double calculateServicePrice()
    {
        return (200 + 7 * getGear()) * 1.25;
    }

    @Override
    public String toString()
    {
        return "Color: " + color + " " + super.toString();
    }



}
