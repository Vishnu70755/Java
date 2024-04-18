import java.util.Scanner;

/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        System.out.println("enter  a number between 1 and 3:");
    Scanner Sc=new Scanner(System.in);
    int num =Sc.nextInt();
    switch(num){
        case 1:
        System.out.println("u have entered i");break;
        case 2:
        System.out.println("u have entered ii"); break;
        case 3:
        System.out.println( "u have entered iii" );break;
        default :
        System.out.println("invalid input");break;
    }

    
    }
}