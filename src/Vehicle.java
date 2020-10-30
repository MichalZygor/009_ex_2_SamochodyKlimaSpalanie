public class Vehicle {
    private String name;
    private double tankCapacity;
    private double avgMileage; // avg liters per 100km

    public Vehicle(String name, double tankCapacity, double avgMileage) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgMileage = avgMileage;
    }

    public double travelDistance(){
        return tankCapacity * 100 / avgMileage;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getAvgMileage() {
        return avgMileage;
    }

    public String getName() {
        return name;
    }
}
