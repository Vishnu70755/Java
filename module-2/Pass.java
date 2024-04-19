import javax.management.loading.PrivateClassLoader;

/**
 * Pass
 */
public class Pass {

    private int amt=900;
     int pin=252223;
     public void setamt(int p, int a){
        if(pin==p){
            amt=a;
        }
        else {
            System.out.println( "Wrong pin");
            System.exit(0);
        }
     }
     public int getamt(int p){
        if(pin!=p){
            System.out.println("invalid pin");
            System.exit(0);
        }
        return amt;
     }

}