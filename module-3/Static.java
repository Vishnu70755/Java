public class Static{
    public static void main(String[] aregs){
        Circle c1=new  Circle(3.5);
        c1.findArea();
        Circle c2=new  Circle(2.6);
        c2.findArea();
        Circle c3=new  Circle(1.8);
        c3.findArea();
        }
}
class Circle {
    double radius;  
    static double pi=3.14;
    public  Circle(double radius ){
    this.radius=radius;
    }
    public void findArea(){
        double area=pi*radius*radius;
        System.out.println("The area of the circle is "+pi*radius*radius);
    }}
    