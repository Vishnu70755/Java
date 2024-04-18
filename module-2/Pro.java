import java.util.Scanner;


public class Pro {
    public  static void main(String[] args) {
        Scanner n=new  Scanner(System.in);
        System.out.println("Enter the number of a :");      
        int a=n.nextInt();
        System.out.println("Enter the number of b :");
        int b=n.nextInt();
        System.out.println("Enter the number of c :");
        int c=n.nextInt();
        if (a>b && a>c){
            System.out.print("a is  largest "+a+"\n");
        }
        else if(b>a && b>c){
            System.out.print("b is  largest "+b+"\n");
        }
        else
        {
            System.out.print("c is  largest "+c+"\n");
        }
    }
    
}
