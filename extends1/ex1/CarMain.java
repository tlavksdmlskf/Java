package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GsaCar gsaCar = new GsaCar();
        gsaCar.move();
        gsaCar.fillup();
    }

}
