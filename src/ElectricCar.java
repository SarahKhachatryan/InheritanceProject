public class ElectricCar extends Car{


    private String batteries;
    private int workHours;
    ElectricCar(String mark, String model, String country, int year, int seats) {
        super(mark, model, country, year, seats);
        setFuelType("Electric");
    }

    @Override
    protected void Print() {
        super.Print();
        System.out.println("Batteries: " + getBatteries());
        System.out.println("Working Hours: "+getWorkHours());
    }

    public String getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries = batteries;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
