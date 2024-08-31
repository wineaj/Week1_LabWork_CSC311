package Week1LabWork;

public class Vehicle {
    public int numberOfWheels;
    public String color;
    public float engineSize;
    public String fuelType;

    public Vehicle(){
        this.numberOfWheels = 4;
        this.color = "grey";
        this.engineSize = 2.0F;
        this.fuelType = "gas";
    }

    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public float getEngineSize() {
        return this.engineSize;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return this.fuelType;
    }
}
