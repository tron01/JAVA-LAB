/*
define 2 classes ; one for generating fibonacci numbers and other for
 displaying even numbers in a given range . Implement using threads.(Runnable Interface).
*/

import java.util.Scanner;

 class evenNo implements Runnable  {
public void run() {
    int c;
     System.out.print("Enter the limit for even numbers:");
           Scanner s = new Scanner(System.in);
           c =s.nextInt();

	 for (int j=0;j<c;j++) {
            if(j%2==0){
            System.out.println(j);
            }
    		 
  		}
	}
}
 class fib implements Runnable  {
public void run() {

        int n1=0,n2=1,n3,i,count=10;    
          System.out.print("Enter the limit:");
           Scanner s = new Scanner(System.in);
           count =s.nextInt();
         System.out.print(n1+" "+n2);//printing 0 and 1    
            
                for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
                {    
                n3=n1+n2;    
                System.out.print(" "+n3);    
                n1=n2;    
                n2=n3;    
                }    
	}
}



 public class Qnt2 {
        public static void main(String[] args)
        {
                evenNo t1 =new evenNo();
                fib t2 =new fib();
                t1.start();
                t2.start();
        }
}
