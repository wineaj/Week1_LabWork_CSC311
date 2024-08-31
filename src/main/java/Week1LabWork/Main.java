package Week1LabWork;

public class Main {

    public static void main(String[] args){
        Vehicle v = new Vehicle();
        Car c = new Car();

        System.out.println(c.getNumberOfWheels());
        System.out.println(c.getColor());
        System.out.println(c.getEngineSize());
        System.out.println(c.getFuelType());
        System.out.println(c.getBrand());
        System.out.println("");

        c.setNumberOfWheels(4);
        c.setColor("red");
        c.setEngineSize(3.0F);
        c.setFuelType("gas");
        c.setBrand("Ford");

        c.displayInfo();
        System.out.println("");
        c.honk();
    }

}
