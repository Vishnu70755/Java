public class Wrongpass {
    public  static void main(String[] args) {
        Pass b=new Pass();
        int p=1234;
        b.setamt(p,0);
        int a=b.getamt(p);
        System.out.println("amount ="+a);


    }
}
