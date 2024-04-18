import java.util.Scanner;



public class Graph {

    


      public static void main(String[] args) {
        Scanner vis=new  Scanner(System.in);
        System.out.println("value of x ");
        int x=vis.nextInt();
        System.out.println("value of  y");
        int  y =vis.nextInt();

        if (x>0 && y>0){
            System.out.print("The point is at 1st part of graph ");
        }
        else if (x<0 && y>0){
            System.out.print("The point is at 2nd part of graph ");}
            else if( x<0 && y<0)
            {
                System.out.print("The point is at 3rd part of graph ");
            }
            else if (x>0 && y<0)
            {
                System.out.print("The point is at 4th part of graph ");
            }
            else if (x!=0 && y==0)
            {
                System.out.print("The point is on x axis  ");
            }
            else if (x==0 && y!=0)
            {
                System.out.print("The point is on y axis  ");
            }
            else if  (x==0 && y==0)
            {
                System.out.print("The point is at origin   ");
            }


    }
}

