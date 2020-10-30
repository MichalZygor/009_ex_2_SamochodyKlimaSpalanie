public class Truck extends Car{
    private double loadingWeight; //kg
    final static double ADDITIONAL_MILEAGE_AIR_CONDITIONING_TRUCK = 1.6;
    final static double ADDITIONAL_MILEAGE_OF_ADDITIONAL_WEIGHT_TRUCK = 0.5; // 0.5 liter per 100kg

    public Truck(String name, double tankCapacity, double avgMileage, boolean isAirConditioningOn, double loadingWeight) {
        super(name, tankCapacity, avgMileage, isAirConditioningOn);
        this.loadingWeight = loadingWeight;
    }

    @Override
    public double travelDistance(){
        if (super.isAirConditioningOn()) {
            return super.getTankCapacity() * 100 / (super.getAvgMileage() + ADDITIONAL_MILEAGE_AIR_CONDITIONING_TRUCK
            + loadingWeight * ADDITIONAL_MILEAGE_OF_ADDITIONAL_WEIGHT_TRUCK / 100);
        }
        return super.getTankCapacity() * 100 / (super.getAvgMileage()
                + loadingWeight * ADDITIONAL_MILEAGE_OF_ADDITIONAL_WEIGHT_TRUCK / 100);
    }

    public double getLoadingWeight() {
        return loadingWeight;
    }
}
