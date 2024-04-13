import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        Scanner v=new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5:");
        int n=v.nextInt( );
        if(n==1)
        System.out.println("One");
         else if (n == 2 )
            System.out.println("Two");
             else if (n ==3)
                System.out.println("Three");
                   else if (n==4){
                       System.out.print("Greater than three");
                    }else if (n==5)
                    
                      System.out.println("Five");
                        else  {
                System.out.println("greather than 5");
            }

    }

}
