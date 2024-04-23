public class Polymorphism1 {
    public  static void main(String[] args) {
        
        Squarepoly sq=new Squarepoly();
        Recpoly r= new Recpoly();
        Circlepoly c= new Circlepoly();
        vis(sq);
        vis(r);
        vis(c);

    }
     public static void vis(Shapepoly s){
        s.area();
        s.display();
}
}
