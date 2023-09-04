/* Write a program which raise an exception when the number inputted is not a
prime.
*/
import java.util.Scanner;

class PrimeNo{

    public static void main(String args[]){
    int i,m=0,flag=0;
    int n,limit;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the limit for prime numbers:");
    limit =s.nextInt();
    

    for(int j=1;j<=limit;j++){
    try{
        n=s.nextInt();
        m=n/2;
        flag=0;
        if(n==0||n==1){
           // System.out.println(n+": is not a prime number.");
            throw new PrimeNoExp("not prime Error occured");
        }
        else{
                for(i=2;i<=m;i++){
                    if(n%i==0){
                    //System.out.println(n+" :is not a prime number.");
                    flag=1;
                    break; 
                    }
                }
            if(flag==0) { 
                System.out.println(n+": is a prime number."); 
                }else{
                    throw new PrimeNoExp("not prime Error occured");
                }
        }
    }catch(PrimeNoExp e){
           
    }    
    }
   
}

}

class PrimeNoExp extends Exception{
    PrimeNoExp(String s)
    {
        System.out.println(s);

    }
}