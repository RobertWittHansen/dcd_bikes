/*
Ord for de samme ting
* objekt = instans
* parameter = argument
* */


// abstract = man kan ikke lave et objekt (= instans) af en abstract klasse
public abstract class Bike
{
    private int gear; // 22
    private int speed; // 34

    //Konstrukter.
    public Bike() {}

    //Konstrukter.
    public Bike(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    //Metode getter og setter
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }

    //Metode getter og setter
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Metode
    public void speedUp(int increment)
    {
        speed = speed + increment;
    }
    public void applyBrake(int decrement)
    {
        speed = speed - decrement;
    }

    //Abstrakt metode (kusiv).
    public abstract double calculateServicePrice();


    @Override
    public String toString()
    { return "Gear: " + gear + " " + "Speed: " + speed; }

}
