public class Car {
    public static void main(String [] args) {
        Car c = new Car();
        c.brand = "audi";
        c.model = "2020model";
        c.price = 123;
        c.speed();
    }

    String brand;
    String model;
    int price;

    void speed() {
        System.out.println("speed :" +speed);
    }
}