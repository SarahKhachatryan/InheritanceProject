public class Boat extends Vehicle {

    private boolean military;
    private int length;
    private int propeller;

    Boat(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("Is Military: "+ isMilitary());
        System.out.println("Length: "+ getLength());
        System.out.println("Propellers number: "+ getPropeller());
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getPropeller() {
        return propeller;
    }

    public void setPropeller(int propeller) {
        this.propeller = propeller;
    }
}
