public class Car {
    public static void main(String[] args) {
        Car car = new Car("Honda", 182);
        car.getCarDetails();
    }

    String brand;
    int speed;

    public Car(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void getCarDetails(){
        System.out.printf("\nBrand: %s", brand);
        System.out.printf("\nSpeed: %dkm/h", speed);
    }
}
