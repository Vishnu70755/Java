public class Loop1 {
    public  static void main(String[] args) {   //labeled for loop    in here we r keeping names for the loops 
       outer:  for (int i=1; i<=3; i++) {// so it is easy to use break were ever u want 
        
            {
                System.out.println(i);
                 
              inner :  for ( int j=0;j<=2;j++)
                {
                    System.out.println("hello");
                     break outer ;

                }
            } 
    }
    
}
}