import java.util.Scanner;


public class avg {
    public static void main(String[] args) {
        Scanner san  = new Scanner (System.in);
        System.out.println("Enter the number :"+san);
        int n1=san.nextInt();
        int n2=san.nextInt();
        int n3=san.nextInt();

        int a=10;
        int b=20;
         int c=33;
         int sum=a+b+c;
         int sum1=n1+n2+n3;
         double avg=sum/3.0;
         double avge=sum1/3.0;
         System.out.println("avg :"+avg);
         System.out.println("avge :"+avge);
    }
    
}
