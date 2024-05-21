//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainViewCars {
    public static void main(String[] args) {

        CarSpeed carSpeed = new CarSpeed();

        carSpeed.getCharacteristic(new Passat());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.getCharacteristic(new Toyota());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());

        carSpeed.getCharacteristic(new Bugatti());

        carSpeed.showCarName();
        System.out.println(carSpeed.getMaxSpeed());
    }
}