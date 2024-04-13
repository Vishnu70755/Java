public class Carap {
    
    public static void main(String [] args)
    {
        Car c= new Car ();
        c.brand="honda";
        c.model="v24";
        c.price=500000;
    System.out.println("brand :"+c.brand);
    System.out.println("model :"+c.model);
    System.out.println("price :"+c.price);   
    c.speed();
    }
}
class Car {
    String brand;
    String model;
    int price;
    void speed()
    {
        System.out.println("The car is going at a high speed");// we can write so many class as we want but the file name should besame as the main method code name like Carap
    }

}

