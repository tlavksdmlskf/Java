package extends1.ex3;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.opendoor();

        GasCar gsaCar = new GasCar();
        gsaCar.move();
        gsaCar.fillup();
        gsaCar.opendoor();
    }

}
