public class DistanceCalculation {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Audi A4 B9", 50, 7.6, false);
        vehicles[1] = new Car("Fiat Tipo II Sedan", 40, 6.7, false);
        vehicles[2] = new Truck("Renault T440 High", 1100, 29.32, false, 0);
        vehicles[3] = new Truck("DAF XF 460 SSC", 1280, 31.36, false, 0);
        vehicles[4] = new Truck("DAF XF 460 SSC", 1280, 31.36, false, 1000);

        ManageVehicle.showDistance(vehicles);
        ManageVehicle.turnAirConditioningOnOff(vehicles, true);
        ManageVehicle.showDistance(vehicles);
    }


}
