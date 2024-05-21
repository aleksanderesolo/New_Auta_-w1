public class CarSpeed {

    CarCharacteristic carCharacteristic;

    public void getCharacteristic(CarCharacteristic s){
        carCharacteristic = s;
    }

    public int getMaxSpeed(){
        return carCharacteristic.getMaxSpeed();
    }

    public void showCarName(){
        System.out.println(carCharacteristic.getCarName());
    }
}
