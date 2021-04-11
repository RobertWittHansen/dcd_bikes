


public class Owner extends Bike
{
    String name;

    //Konstrukter.
    public Owner() {}

    public Owner(int gear, int speed, String name)
    {
        super(gear, speed);
        this.name = name;

    }

    //getter og Setter.
    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }

    //Super mmetoden:
    @Override
    public double calculateServicePrice() {
        return 0;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " " + super.toString();
    }


}
