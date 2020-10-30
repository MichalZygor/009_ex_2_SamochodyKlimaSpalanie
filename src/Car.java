public class Car extends Vehicle {
    private boolean isAirConditioningOn;
    final static double ADDITIONAL_MILEAGE_AIR_CONDITIONING_CAR = 0.8;

    public Car(String name, double tankCapacity, double avgMileage, boolean isAirConditioningOn) {
        super(name, tankCapacity, avgMileage);
        this.isAirConditioningOn = isAirConditioningOn;
    }

    @Override
    public double travelDistance() {
        if (isAirConditioningOn) {
            //return super.travelDistance() - addDistance(ADDITIONAL_MILEAGE_AIR_CONDITIONING_CAR);
            return super.getTankCapacity() * 100 / (super.getAvgMileage() + ADDITIONAL_MILEAGE_AIR_CONDITIONING_CAR);
        }
        return super.travelDistance();
    }

    public boolean isAirConditioningOn() {
        return isAirConditioningOn;
    }


    public void setAirConditioningOn(boolean airConditioningOn) {
        isAirConditioningOn = airConditioningOn;
    }


}
