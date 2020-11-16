public class Plane extends Vehicle{
    private boolean military;
    private double wingspan;
    private int hours;
    Plane(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("Is military: " +isMilitary());
        System.out.println("Wingspan: "+ getWingspan());
        System.out.println("Hours: " + getHours());
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
