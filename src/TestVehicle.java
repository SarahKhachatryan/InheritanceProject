public class TestVehicle {
    public static void main(String[] args) {
        Car myCar= new Car("Lexus","GX 470","Japan",2005,8);
        myCar.setDriveType("4 wheel");
        myCar.setEngine("V8");
        myCar.setFuelType("Petrol");
        myCar.setHorsePower(263);
        myCar.Print();
        System.out.println("----------------------------------------------------------------");
        Plane myPlane = new Plane("Boeing","737","USA",1980,215);
        myPlane.setHours(76);
        myPlane.setWingspan(25.7);
        myPlane.setMilitary(false);
        myPlane.Print();
        System.out.println("------------------------------------------------------------------");
        ElectricCar myElCar = new ElectricCar("Smart","Fortwo","UK",2010,2 );
        myElCar.setHorsePower(100);
        myElCar.setEngine("none");
        myElCar.setDriveType("2 wheel");
        myElCar.setBatteries("1000");
        myElCar.setWorkHours(24);
        myElCar.Print();
    }
}
