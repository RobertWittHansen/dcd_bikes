

public class RacingBike extends Bike
{
    private boolean carbonFrame;

    //konstrukter.
    public RacingBike() {}

    public RacingBike(int gear, int speed, boolean carbonFrame)
    {
        // new Bike(gear, speed)
        // super(gear, speed) == kalder superklassens konstrukter og sætter attributterne gear og speed
        super(gear, speed);
        this.carbonFrame = carbonFrame;
    }
    // Getter og setter (booleans getter er = is)
    public boolean isCarbonFrame() {
        return carbonFrame;
    }

    public void setCarbonFrame(boolean carbonFrame) {
        this.carbonFrame = carbonFrame;
    }

    @Override
    public double calculateServicePrice()
    {
        return (250 + 7 * getGear()) * 1.25;
    }

    @Override
    public String toString()
    {
        return "CarbonFrame: " + carbonFrame + " " + super.toString();
    }

}
