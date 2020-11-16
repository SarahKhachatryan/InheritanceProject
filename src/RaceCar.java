public class RaceCar extends Car {
    private int acceleration;
    private int maxSpeed;

    RaceCar(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("Acceleration: "+getAcceleration());
        System.out.println("Maximum Speed: "+ getMaxSpeed());
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        if(acceleration>0)
        this.acceleration = acceleration;
        else
            System.out.println("Enter valid value!!");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed >= 300)
            this.maxSpeed = maxSpeed;
        else
            System.out.println("Not a race car!!");
    }
}
