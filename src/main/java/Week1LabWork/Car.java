package Week1LabWork;

public class Car extends Vehicle{

    public String brand;

    public Car(){
        super();
        this.brand = "Honda";
    }

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand){
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.brand = brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }

    public void displayInfo(){
        System.out.println("Number of wheels: " + this.numberOfWheels);
        System.out.println("Color: " + this.getColor());
        System.out.println("Engine size: " + this.engineSize + " liters");
        System.out.println("Fuel type: " + this.fuelType);
        System.out.println("Brand: " + this.brand);
    }



}
