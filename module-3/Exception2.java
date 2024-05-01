import java.util.Scanner;

public class Exception2 {

    public static void main(String[] args) {
        Exception2 obj = new Exception2();
        obj.transaction();
    }

    void transaction(){
        System.out.println("Inside transaction method");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("amount enter chaye ");
            int amt = sc.nextInt();
            System.out.println("amount depeted " + amt);
        } catch (Exception E) {
            System.out.println("exception handled ");
            E.printStackTrace();
        }
        System.out.println("get out from my account");
    }
}