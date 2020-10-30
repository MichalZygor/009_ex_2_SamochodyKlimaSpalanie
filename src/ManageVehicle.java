import java.text.DecimalFormat;

public class ManageVehicle {
    public static void turnAirConditioningOnOff(Vehicle[] vehicles, boolean isTurnOn) {
        System.out.println("---- Przełączanie statusu klimatyzacji -----");
        for (Vehicle vehicle : vehicles) {
            ((Car) vehicle).setAirConditioningOn(isTurnOn);
        }
    }

    public static void showDistance(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            DecimalFormat decimalFormat = new DecimalFormat("#.###");
            System.out.print(vehicle.getName() + " przejedzie " + decimalFormat.format(vehicle.travelDistance()) + " km."
                    + " Status klimatyzacji: " + ((Car) vehicle).isAirConditioningOn());
            if (vehicle instanceof Truck) {
                System.out.println(". Załadunek: " + ((Truck) vehicle).getLoadingWeight());
            } else System.out.println();
        }

    }
}
