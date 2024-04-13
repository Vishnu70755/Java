public class Carapp {
    public static void main(String [] args)
    {
        Car c= new Car ();
        c.brand="audi";
        c.model="v2";
        c.price=5000;
    System.out.println("brand :"+c.brand);
    System.out.println("model :"+c.model);
    System.out.println("price :"+c.price);   
    c.speed();
    }
    
}
