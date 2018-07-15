package SW;

import java.util.Scanner;

public class Subway {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
        Order o=new Order();
     OrderBuilder ob=new OrderBuilder(o);
     System.out.println("enter the number of items");
     int n=sc.nextInt();
     System.out.println("enter the item number" +
             "1.bread" +
             "2.Sauce" +
             "3.salad" +
             "4.Addons");
     while(n>0)
     {ob.build(sc.nextInt());
         n--;
     }

     System.out.println("the cost for the ordered items is:"+o.getCost());
    }
}
